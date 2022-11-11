FROM maven:3.3.9-jdk-8-alpine
WORKDIR /app
COPY code /app
WORKDIR /app
CMD ["mvn","spring-boot:run"]