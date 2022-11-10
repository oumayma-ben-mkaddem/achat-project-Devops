FROM openjdk:8-jdk-alpine
EXPOSE 8083
ADD http://192.168.1.9:8081/repository/achat/achat-1.0.jar achat.war
ENTRYPOINT ["java","-jar","achat.war"] 