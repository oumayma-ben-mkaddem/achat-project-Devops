FROM openjdk:8-jdk-alpine
EXPOSE 8083
ADD /target/achat-1.0.jar achat.war
ENTRYPOINT ["java","-jar","achat.war"] 