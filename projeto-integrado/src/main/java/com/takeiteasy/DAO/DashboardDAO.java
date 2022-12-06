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

public class DashboardDAO extends ConnectionDAO{
    public void create(int id) {
        try {
            Connection connection = DriverManager.getConnection(jdbcURL, username, password);
            String sql = "INSERT INTO dashboard (id) VALUES (?)";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(0, id);
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public void insert(int id, Activity activity) {
        try {
            Connection connection = DriverManager.getConnection(jdbcURL, username, password);
            String sql = "INSERT INTO dashboard_activity (activity, dashboard) VALUES (?, ?)";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(0, activity.getId());
            statement.setInt(1, id);
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Activity> list(int id) {
        try {
            Connection connection = DriverManager.getConnection(jdbcURL, username, password);
            String sql = "SELECT activity FROM dashboard_activity WHERE dashboard = "+ id;
            Statement statement = connection.createStatement();
            ResultSet result = statement.executeQuery(sql);
            List<Activity> res = new ArrayList<>();
            while (result.next()) {
                ActivityDAO activityDAO = new ActivityDAO();
                Activity aux = activityDAO.get(result.getInt("id"));
                res.add(aux.getId(), aux);
            }
            return res;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public void delete(int id) {
        try {
            Connection connection = DriverManager.getConnection(jdbcURL, username, password);
            String sql = "DELETE FROM dashboard WHERE id = ?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, id);
            sql = "DELETE FROM dashboard_activity WHERE dashboard = ?";
            statement = connection.prepareStatement(sql);
            statement.setInt(1, id);
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
