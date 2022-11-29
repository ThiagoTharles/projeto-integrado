package com.takeiteasy.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.takeiteasy.entities.Tag;

public class TagDAO extends ConnectionDAO{
    public void insert(String name) {
        try {
            Connection connection = DriverManager.getConnection(jdbcURL, username, password);
            String sql = "INSERT INTO tag (name) VALUES (?)";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(0, name);
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public List<Tag> list() {
        try {
            Connection connection = DriverManager.getConnection(jdbcURL, username, password);
            String sql = "SELECT * FROM tag";
            Statement statement = connection.createStatement();
            ResultSet result = statement.executeQuery(sql);
            List<Tag> res = new ArrayList<>();
            while (result.next()) {
                Tag aux = new Tag();
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

    public Tag get(int id) {
        try {
            Connection connection = DriverManager.getConnection(jdbcURL, username, password);
            String sql = "SELECT * FROM tag WHERE id = " + id;
            Statement statement = connection.createStatement();
            ResultSet result = statement.executeQuery(sql);
            Tag res = new Tag();
            res.setId(result.getInt("id"));
            res.setName(result.getString("name"));
            return res;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public void update(Tag tag) {
        try {
            Connection connection = DriverManager.getConnection(jdbcURL, username, password);
            String sql = "UPDATE tag SET name = '?' WHERE CustomerID = ?;";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(0, tag.getName());
            statement.setInt(1, tag.getId());
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void delete(int id) {
        try {
            Connection connection = DriverManager.getConnection(jdbcURL, username, password);
            String sql = "DELETE FROM tag WHERE id = ?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, id);
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
