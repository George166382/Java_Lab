/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab5.main;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author G
 */
public class Catalog implements Serializable {
    private String name;
    private List<Document> docs;

    public Catalog(String name) {
        this.name = name;
        this.docs = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Document> getDocs() {
        return docs;
    }

    public void setDocs(List<Document> docs) {
        this.docs = docs;
    }
    
    public void add(Document doc) {
       docs.add(doc);
    }
    
    public Document findById(String id) {
        return docs.stream()
        .filter(d -> d.getId().equals(id)).findFirst().orElse(null);
    }
}
