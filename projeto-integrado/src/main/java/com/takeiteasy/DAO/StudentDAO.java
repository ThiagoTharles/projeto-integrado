package com.takeiteasy.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.takeiteasy.entities.Student;

public class StudentDAO extends ConnectionDAO {
    public void insert(String name) {
        try {
            Connection connection = DriverManager.getConnection(jdbcURL, username, password);
            String sql = "INSERT INTO student (name) VALUES (?)";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(0, name);
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public List<Student> list() {
        try {
            Connection connection = DriverManager.getConnection(jdbcURL, username, password);
            String sql = "SELECT * FROM student";
            Statement statement = connection.createStatement();
            ResultSet result = statement.executeQuery(sql);
            List<Student> res = new ArrayList<>();
            while (result.next()) {
                Student aux = new Student();
                aux.setId(result.getInt("id"));
                aux.setName(result.getString("name"));
                res.add(aux.getId(), aux);
            }
            return res;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public Student get(int id) {
        try {
            Connection connection = DriverManager.getConnection(jdbcURL, username, password);
            String sql = "SELECT * FROM student WHERE id = " + id;
            Statement statement = connection.createStatement();
            ResultSet result = statement.executeQuery(sql);
            Student res = new Student();
            res.setId(result.getInt("id"));
            res.setName(result.getString("name"));
            return res;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public void update(Student student) {
        try {
            Connection connection = DriverManager.getConnection(jdbcURL, username, password);
            String sql = "UPDATE student SET name = '?' WHERE CustomerID = ?;";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(0, student.getName());
            statement.setInt(1, student.getId());
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void delete(int id) {
        try {
            Connection connection = DriverManager.getConnection(jdbcURL, username, password);
            String sql = "DELETE FROM student WHERE id = ?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, id);
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
