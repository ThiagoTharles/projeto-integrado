package com.takeiteasy.entities;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.*;    
    
public class TagTest {
    
    @Test
    public void createTag() {
        Tag tag = new Tag();
        tag.setId(0);
        tag.setName("novo");
        assertEquals(0,tag.getId());
    }    
    @Test
    public void modifyTag() {
        Tag tag = new Tag();
        tag.setId(0);
        tag.setName("novo");
        Tag tag1 = new Tag();
        tag1.setId(5);       
        tag1.setName("velho");
        assertNotEquals(tag, tag);
    }
}
    