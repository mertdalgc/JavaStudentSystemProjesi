# Java Student System

Basit bir öğrenci yönetim sistemi. Spring Boot olmadan temel Java + JDBC ile yazılmıştır.

## Kullanılan Teknolojiler
- Java 17
- MySQL (Docker)
- JDBC
- Maven
- Docker Compose

## Başlatma Talimatı

```bash
docker compose down -v
docker compose up --build
```

## API ve Veritabanı
Veritabanı ismi: `students`

Tablo: `student (id, name, grade)`
