package com.stakater;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class WelcomeController {
    
    @Value("${url}")
    private String url;

    @RequestMapping("/")
    public String displayHello() {
   // public String displayHello(Map<String, Object> model) {

        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

        String formatDateTime = now.format(formatter);

        RestTemplate rt = new RestTemplate();
        String res = rt.getForObject(url, String.class);
        String result = formatDateTime +" "+res;
       // model.put("message", formatDateTime + " " + res);
        return result;
    }

}