FROM eclipse-temurin:21-jre-alpine
LABEL authors="ican"
WORKDIR /app
COPY build/libs/*.jar app.jar
EXPOSE 8761
ENTRYPOINT ["java", "-jar", "app.jar"]