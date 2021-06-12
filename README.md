# StakaterFe Service Notes

This FrondEnd Service Calls backend StakaterBE service and prints the string returned from backend and
appends the date and time. 

Sample Output : 12/06/2021 12:02:36 Hello Chandra Reddy



Technologies Used : Java , Spring Boot web application with jsp , RestTemplate , Embeded Tomcat
Deployment : openshift used

Deployment Notes : 

1. Port Used : 8080 . configured in application.properties

2. Sample url : http://localhost:8080/ ("/" is the Rest URI path)

3. Sample OUTPUT of the service is ::  12/06/2021 12:02:36 Hello Chandra Reddy (Hello Chandra Reddy is the output received from backend service)

4. While executing the FE service , BE service should be up and running state to display proper output.