package com.stakater;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

@Controller
public class WelcomeController {

	// inject via application.properties
	@Value("${welcome.message:test}")
	private String message = "Hello World";
	
	

	@RequestMapping("/")
	public String displayHello(Map<String, Object> model) {
	    
	    LocalDateTime now = LocalDateTime.now();
	    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

        String formatDateTime = now.format(formatter);
	    
	    RestTemplate rt = new RestTemplate();
	    String res= rt.getForObject("http://localhost:8081/displayHello", String.class);
		model.put("message", formatDateTime +" "+ res);
		return "welcome";
	}

}