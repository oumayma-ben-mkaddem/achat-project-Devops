FROM openjdk:8-jdk-alpine
COPY target/achat-1.0.jar .
CMD mvn spring-boot:run
