FROM openjdk:8-jdk-alpine
FROM maven:3.8.6-openjdk-18
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["mvn","-v"]
ENTRYPOINT ["java","-jar","/app.jar"]