package com.takeiteasy.DAO;

public abstract class ConnectionDAO {
    protected String jdbcURL = "jdbc:postgresql://localhost:5432/takeiteasy";
    protected String username = "postgres";
    protected String password = "1234";
}
