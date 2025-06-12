
# 1. Maven ile build eden aşama
FROM maven:3.9.6-eclipse-temurin-17 AS build
WORKDIR /app
COPY . .
RUN mvn clean package -DskipTests

# 2. Sadece çalıştırma aşaması
FROM eclipse-temurin:17-jdk
WORKDIR /app
COPY --from=build /app/target/JavaStudentSystemProjesi-1.0-SNAPSHOT.jar app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]
