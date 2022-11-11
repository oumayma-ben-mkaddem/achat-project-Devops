FROM maven:3.8.6-openjdk-18
RUN curl -u admin:nexus -o achat-1.0.jar "http://192.168.1.9:8081/#browse/browse:achat:tn%2Fesprit%2Frh%2Fachat%2F1.0%2Fachat-1.0.jar" -L
ENTRYPOINT ["java","-jar","achat-1.0.jar"]