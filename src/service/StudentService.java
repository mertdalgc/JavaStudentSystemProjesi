package service;

import model.Student;

import java.sql.*;

public class StudentService {
    private final String url = System.getenv("DB_URL");
    private final String user = System.getenv("DB_USER");
    private final String password = System.getenv("DB_PASS");

    public StudentService() {
        try (Connection conn = DriverManager.getConnection(url, user, password);
             Statement stmt = conn.createStatement()) {
            stmt.execute("CREATE TABLE IF NOT EXISTS student (id INT PRIMARY KEY, name VARCHAR(255), grade DOUBLE)");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void addStudent(Student s) {
        try (Connection conn = DriverManager.getConnection(url, user, password)) {
            PreparedStatement ps = conn.prepareStatement("INSERT INTO student (id, name, grade) VALUES (?, ?, ?)");
            ps.setInt(1, s.getId());
            ps.setString(2, s.getName());
            ps.setDouble(3, s.getGrade());
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void listAll() {
        try (Connection conn = DriverManager.getConnection(url, user, password);
             Statement stmt = conn.createStatement()) {
            ResultSet rs = stmt.executeQuery("SELECT * FROM student");
            while (rs.next()) {
                System.out.println(rs.getInt("id") + " - " + rs.getString("name") + " - " + rs.getDouble("grade"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void printTopStudent() {
        try (Connection conn = DriverManager.getConnection(url, user, password);
             Statement stmt = conn.createStatement()) {
            ResultSet rs = stmt.executeQuery("SELECT * FROM student ORDER BY grade DESC LIMIT 1");
            if (rs.next()) {
                System.out.println(rs.getString("name") + " - " + rs.getDouble("grade"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
