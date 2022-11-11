FROM maven:3.8.6-openjdk-18
COPY . .
CMD ["cd","target"]
ENTRYPOINT ["java","-jar","achat-1.0.jar"]