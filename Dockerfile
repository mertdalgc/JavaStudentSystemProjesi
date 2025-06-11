FROM openjdk:17
WORKDIR /app
COPY target/JavaStudentSystemProjesi-1.0-jar-with-dependencies.jar app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]
