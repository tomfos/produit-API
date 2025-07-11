FROM eclipse-temurin:21-jdk-alpine

LABEL authors="AiZEN"

WORKDIR /app

COPY target/produit.jar ./produit.jar

EXPOSE 8082

CMD ["java", "-jar", "produit.jar"]