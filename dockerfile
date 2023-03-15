FROM openjdk:11 
EXPOSE 8080
ADD target/docker-file.jar docker-file.jar 

ENTRYPOINT ["java", "-jar" , docker-file.jar"]