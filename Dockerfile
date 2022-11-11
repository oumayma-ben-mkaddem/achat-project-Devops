FROM openjdk:8-jdk-alpine
FROM maven:3.8.6-jdk-8-alpine
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]