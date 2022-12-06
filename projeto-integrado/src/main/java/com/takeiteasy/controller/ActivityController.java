package com.takeiteasy.controller;

import java.util.List;

import com.takeiteasy.DAO.ActivityDAO;
import com.takeiteasy.entities.Activity;

public class ActivityController {
    ActivityDAO activityDAO = new ActivityDAO();
    
    public void insert(String name, String description, int tag, int pomodoro, int student) {
        activityDAO.insert(name, description, tag, pomodoro, student);
    }
    
    public List<Activity> list() {
        return activityDAO.list();
    }

    public Activity get(int id) {
        return activityDAO.get(id);
    }

    public void update(Activity activity) {
        activityDAO.update(activity);
    }

    public void delete(int id) {
        activityDAO.delete(id);
    }
}
