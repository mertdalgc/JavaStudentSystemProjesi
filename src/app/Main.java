package app;

import model.Student;
import service.StudentService;

public class Main {
    public static void main(String[] args) {
        StudentService service = new StudentService();

        service.addStudent(new Student(1, "Ali", 75.5));
        service.addStudent(new Student(2, "Ayşe", 88.2));
        service.addStudent(new Student(3, "Mehmet", 66.7));

        System.out.println("Tüm Öğrenciler:");
        service.listAll();

        System.out.println("\nEn Başarılı Öğrenci:");
        service.printTopStudent();
    }
}
