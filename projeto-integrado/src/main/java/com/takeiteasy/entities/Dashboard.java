package com.takeiteasy.entities;

import java.util.List;

public class Dashboard {
    private int id;
    private List<Activity> activities;

    public Dashboard() {
    }

    public List<Activity> getActivities() {
        return activities;
    }

    public void setActivities(List<Activity> activities) {
        this.activities = activities;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
