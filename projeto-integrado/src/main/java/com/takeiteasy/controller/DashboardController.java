package com.takeiteasy.controller;

import java.util.List;

import com.takeiteasy.DAO.DashboardDAO;
import com.takeiteasy.entities.Activity;

public class DashboardController {
    DashboardDAO dashboardDAO = new DashboardDAO();
    
    public void create(int id) {
        dashboardDAO.create(id);
    }
    
    public void insert(int id, Activity activity) {
        dashboardDAO.insert(id, activity);
    }

    public List<Activity> list(int id) {
        return dashboardDAO.list(id);
    }

    public void delete(int id) {
        dashboardDAO.delete(id);
    }
}
