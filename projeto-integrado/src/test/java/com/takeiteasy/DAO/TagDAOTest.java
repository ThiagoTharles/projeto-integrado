package com.takeiteasy.DAO;

import org.junit.Test;

import com.takeiteasy.entities.Tag;

import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.Before;    
    
public class TagDAOTest {
    TagDAO tDao = new TagDAO();
    
    @Test
    public void ItShouldBeInserted() {
        Tag tag = new Tag();
        tag.setId(0);
        tag.setName("novo");
        tDao.insert(
                tag.getName());
        Tag tag2 = tDao.get(0);
        assertNotNull(null, tag2);
    }

    @Test
    public void ItShouldBelisted() {
    }

    @Test
    public void get(int id) {
        Tag tag = new Tag();
        tag.setId(0);
        tag.setName("novo");
        tDao.insert(
                tag.getName());
        assertNotNull(tDao.get(0));
    }

    @Test
    public void update() {
        Tag tag = new Tag();
        tag.setId(0);
        tag.setName("novo");
        tDao.insert(
                tag.getName());
        Tag tag2 = tDao.get(0);
        tag2.setName("Pedro");
        assertNotEquals(tag.getName(), tag2.getName());
    }

    @Test
    public void delete(int id) {
        Tag tag = new Tag();
        tag.setId(0);
        tag.setName("novo");
        tDao.insert(
                tag.getName());
        Tag tag2 = tDao.get(0);
        assertNull(null, tag2);
    }
}
    