FROM openjdk:17-jdk-alpine

ARG JAR_FILE=task-manager-backend.jar

COPY task-manager-backend.jar app.jar

ENTRYPOINT ["java", "-jar", "/app.jar"]
