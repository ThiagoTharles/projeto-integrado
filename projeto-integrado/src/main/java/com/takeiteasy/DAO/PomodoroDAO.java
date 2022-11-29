package com.takeiteasy.DAO;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.takeiteasy.entities.Pomodoro;

public class PomodoroDAO extends ConnectionDAO{
    public void insert(int shortBreak, int longBreak, int pomodoro, int cycle, String status) {
        try {
            Connection connection = DriverManager.getConnection(jdbcURL, username, password);
            String sql = "INSERT INTO pomodoro (shortbreak, longbreak, pomodoro, cycle, status) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(0, shortBreak);
            statement.setInt(1, longBreak);
            statement.setInt(2, pomodoro);
            statement.setInt(3, cycle);
            statement.setString(4, status);
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public List<Pomodoro> list() {
        try {
            Connection connection = DriverManager.getConnection(jdbcURL, username, password);
            String sql = "SELECT * FROM pomodoro";
            Statement statement = connection.createStatement();
            ResultSet result = statement.executeQuery(sql);
            List<Pomodoro> res = new ArrayList<>();
            while (result.next()) {
                Pomodoro aux = new Pomodoro();
                aux.setId(result.getInt("id"));
                aux.setShortBreak(result.getInt("shortbreak"));
                aux.setLongBreak(result.getInt("longbreak"));
                aux.setPomodoro(result.getInt("pomodoro"));
                aux.setCycle(result.getInt("cycle"));
                aux.setStatus(result.getString("status"));
                res.add(aux.getId(), aux);
            }
            return res;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public Pomodoro get(int id) {
        try {
            Connection connection = DriverManager.getConnection(jdbcURL, username, password);
            String sql = "SELECT * FROM pomodoro WHERE id = " + id;
            Statement statement = connection.createStatement();
            ResultSet result = statement.executeQuery(sql);
            Pomodoro res = new Pomodoro();
            res.setId(result.getInt("id"));
            res.setShortBreak(result.getInt("shortbreak"));
            res.setLongBreak(result.getInt("longbreak"));
            res.setPomodoro(result.getInt("pomodoro"));
            res.setCycle(result.getInt("cycle"));
            res.setStatus(result.getString("status"));
            return res;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public void update(Pomodoro pomodoro) {
        try {
            Connection connection = DriverManager.getConnection(jdbcURL, username, password);
            String sql = "UPDATE pomodoro SET shortbreak = '?', longbreak = '?', pomodoro = '?', cycle = '?', status = '?' WHERE id = ?;";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(0, pomodoro.getShortBreak());
            statement.setInt(1, pomodoro.getLongBreak());
            statement.setInt(2, pomodoro.getPomodoro());
            statement.setInt(3, pomodoro.getCycle());
            statement.setString(4, pomodoro.getStatus());
            statement.setInt(5, pomodoro.getId());
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void delete(int id) {
        try {
            Connection connection = DriverManager.getConnection(jdbcURL, username, password);
            String sql = "DELETE FROM pomodoro WHERE id = ?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, id);
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
