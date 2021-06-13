# StakaterFe Service Notes

This FrondEnd Service Calls backend StakaterBE service and prints the string returned from backend and
appends the date and time. 

Sample Output : 12/06/2021 12:02:36 Hello Chandra Reddy



Technologies Used : Java , Spring Boot , RestTemplate , Embeded Tomcat
Deployment : openshift used

Deployment Notes : 

1. Port Used : 8080  configured in application.properties. If openshift used for deployment , then it uses default port 8080.
 

2. backend service rest url configured in application.properties. localhost need to change to openshift backend service route url.
   Ex : http://localhost:8081/displayHello

3. Sample url to test by using browser : http://localhost:8080/ ("/" is the Rest URI path)

4. Sample OUTPUT of the service is ::  12/06/2021 12:02:36 Hello Chandra Reddy (Hello Chandra Reddy is the output received from backend service)

5. While executing the FE service , BE service should be up and running state to display proper output.