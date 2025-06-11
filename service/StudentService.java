package service;

import model.Student;
import java.util.*;
import java.util.stream.Collectors;

public class StudentService {
    private List<Student> studentList = new ArrayList<>();

    public void addStudent(Student s) {
        studentList.add(s);
    }

    public void listAll() {
        for (Student s : studentList) {
            System.out.println(s);
        }
    }

    public void printTopStudent() {
        Optional<Student> top = studentList.stream()
                .max(Comparator.comparing(Student::getGrade));
        if (top.isPresent()) {
            System.out.println("En yüksek not: " + top.get());
        }
    }
}