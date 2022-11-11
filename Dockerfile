COPY . .
CMD ["cd","target"]
ENTRYPOINT ["java","-jar","achat-1.0.jar"]