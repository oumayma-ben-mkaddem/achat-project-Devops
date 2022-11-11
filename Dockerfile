ARG JAR_FILE=target/*.jar
CMD ["cd","target"]
ENTRYPOINT ["java","-jar","/app.jar"]
