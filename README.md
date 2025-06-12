JavaStudentSystemProjesi

Bu proje, Java programlama dili ile gerçekleştirilmiş temel bir öğrenci yönetim sistemidir. Final projesi kapsamında hazırlanmıştır. Projeyi geliştirirken amaç, hem Java'nın temel yapılarını hem de ileri düzey konularını kullanarak çalışır bir sistem ortaya koymaktı.

Kullanılan Teknolojiler:

Java 8+

JDBC

MySQL (Docker üzerinden)

Maven

Docker / Docker Compose

Uygulanan Konular:

Projede aşağıdaki ders konularına yer verilmiştir:

Nesne Tabanlı Programlama (OOP)

JDBC ile Veritabanı bağlantısı

Koleksiyonlar

Docker üzerinden MySQL kurulumu

Temel CRUD işlemleri (Create, Read, Update, Delete)

Çalıştırma:

Projeyi çalıştırmak için şu adımları izleyebilirsiniz:

Docker ve Docker Compose kurulu olmalı.

Proje klasöründe terminal açıp şu komutu girin:

docker-compose up --build

Java dosyalarını Main.java üzerinden çalıştırarak test edebilirsiniz.
.
├── Dockerfile
├── docker-compose.yml
├── init.sql
├── pom.xml
├── README.md
└── src
└── main
└── java
├── Main.java
├── model
│ └── Student.java
└── service
├── DbConnection.java
└── StudentService.java
Bu proje final projesi kapsamında yapılmıştır. Kodlar bireysel olarak tarafımdan yazılmıştır. Herhangi bir framework kullanmadan, sade Java ile yapılmıştır. Kodda sadelik ve anlaşılabilirlik öncelikli hedefim olmuştur.
