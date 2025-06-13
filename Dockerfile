FROM openjdk:17-jdk-slim
COPY target/JavaStudentSystemProjesi-1.0-SNAPSHOT-shaded.jar app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]
