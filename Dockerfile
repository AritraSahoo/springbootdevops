FROM openjdk:8
ADD target/springbootdevops.jar springbootdevops.jar
EXPOSE 8085
ENTRYPOINT ["java", "-jar", "springbootdevops.jar"]