package com.takeiteasy.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.takeiteasy.entities.Activity;

public class ActivityDAO extends ConnectionDAO{
    public void insert(String name, String description, int tag, int pomodoro, int student) {
        try {
            Connection connection = DriverManager.getConnection(jdbcURL, username, password);
            String sql = "INSERT INTO activity (name, description, tag, pomodoro, student) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(0, name);
            statement.setString(1, description);
            statement.setInt(2, tag);
            statement.setInt(3, pomodoro);
            statement.setInt(4, student);
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public List<Activity> list() {
        try {
            Connection connection = DriverManager.getConnection(jdbcURL, username, password);
            String sql = "SELECT * FROM activity";
            Statement statement = connection.createStatement();
            ResultSet result = statement.executeQuery(sql);
            List<Activity> res = new ArrayList<>();
            while (result.next()) {
                Activity aux = new Activity();
                aux.setId(result.getInt("id"));
                aux.setName(result.getString("name"));
                aux.setDescription(result.getString("description"));
                TagDAO tagDAO = new TagDAO();
                aux.setTag(tagDAO.get(result.getInt("id")));
                PomodoroDAO pomodoroDAO = new PomodoroDAO();
                aux.setPomodoro(pomodoroDAO.get(result.getInt("id")));
                StudentDAO studentDAO = new StudentDAO();
                aux.setStudent(studentDAO.get(result.getInt("id")));
                res.add(aux.getId(), aux);
            }
            return res;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public Activity get(int id) {
        try {
            Connection connection = DriverManager.getConnection(jdbcURL, username, password);
            String sql = "SELECT * FROM activity WHERE id = " + id;
            Statement statement = connection.createStatement();
            ResultSet result = statement.executeQuery(sql);
            Activity res = new Activity();
            res.setId(result.getInt("id"));
            res.setName(result.getString("name"));
            res.setDescription(result.getString("description"));
            TagDAO tagDAO = new TagDAO();
            res.setTag(tagDAO.get(result.getInt("id")));
            PomodoroDAO pomodoroDAO = new PomodoroDAO();
            res.setPomodoro(pomodoroDAO.get(result.getInt("id")));
            StudentDAO studentDAO = new StudentDAO();
            res.setStudent(studentDAO.get(result.getInt("id")));
            return res;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public void update(Activity activity) {
        try {
            Connection connection = DriverManager.getConnection(jdbcURL, username, password);
            String sql = "UPDATE activity SET name = '?', description = '?', tag = '?', pomodoro = '?', student = '?' WHERE CustomerID = ?;";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(0, activity.getName());
            statement.setString(1, activity.getDescription());
            statement.setInt(2, activity.getTag().getId());
            statement.setInt(3, activity.getPomodoro().getId());
            statement.setInt(4, activity.getStudent().getId());
            statement.setInt(5, activity.getId());
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void delete(int id) {
        try {
            Connection connection = DriverManager.getConnection(jdbcURL, username, password);
            String sql = "DELETE FROM activity WHERE id = ?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, id);
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
