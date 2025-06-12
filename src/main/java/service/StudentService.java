
package service;

import model.Student;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StudentService {
    private final List<Student> students = new ArrayList<>();

    public void addStudent(Student student) {
        students.add(student);
        try (Connection conn = DbConnection.getConnection()) {
            String sql = "INSERT INTO student (id, name, grade) VALUES (?, ?, ?)";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, student.getId());
            stmt.setString(2, student.getName());
            stmt.setDouble(3, student.getGrade());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void listAll() {
        try (Connection conn = DbConnection.getConnection()) {
            String sql = "SELECT * FROM student";
            PreparedStatement stmt = conn.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                System.out.println(rs.getInt("id") + " - " + rs.getString("name") + " - " + rs.getDouble("grade"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void printTopStudent() {
        try (Connection conn = DbConnection.getConnection()) {
            String sql = "SELECT * FROM student ORDER BY grade DESC LIMIT 1";
            PreparedStatement stmt = conn.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                System.out.println(rs.getInt("id") + " - " + rs.getString("name") + " - " + rs.getDouble("grade"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
