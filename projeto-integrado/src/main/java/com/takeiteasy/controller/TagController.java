package com.takeiteasy.controller;

import java.util.List;

import com.takeiteasy.DAO.TagDAO;
import com.takeiteasy.entities.Tag;

public class TagController {
    TagDAO tagDAO = new TagDAO();
    public void insert(String name) {
        tagDAO.insert(name);
    }
    
    public List<Tag> list() {
        return tagDAO.list();
    }

    public Tag get(int id) {
        return tagDAO.get(id);
    }

    public void update(Tag tag) {
        tagDAO.update(tag);
    }

    public void delete(int id) {
        tagDAO.delete(id);
    }
}
