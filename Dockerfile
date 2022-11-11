FROM maven:3.8.6-openjdk-18
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar
CMD ["mvn","clean", "package"]
ENTRYPOINT ["java","-jar","/app.jar"]