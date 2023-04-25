/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package group.homework;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author G
 */
public class Document implements Serializable { 
    private String id;
    private String title;
    private String location; //file name or Web page
    private Map<String, Object> tags;

    public Document(String id, String title, String location) {
        this.id = id;
        this.title = title;
        this.location = location;
        this.tags = new HashMap<>();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Map<String, Object> getTags() {
        return tags;
    }

    public void setTags(Map<String, Object> tags) {
        this.tags = tags;
    }
    
    public void addTag(String key, Object obj) {
        tags.put(key, obj);
    }
}
