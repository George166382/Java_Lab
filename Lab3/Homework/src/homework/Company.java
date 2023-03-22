/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package homework;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 *
 * @author G
 */
public class Company implements Node,Comparable<Company>{
    private String name;
    private String location;
    private Map<Node,String> relationships = new HashMap<>();
    public Company(String name, String location) {
        this.name = name;
        this.location = location;
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

     /**
     *
     * @param company
     * @return
     */
    @Override
    public int compareTo(Company company) {
        return this.name.compareTo(company.name);
    }
    
    public void addRelationship(Node node, String value)
    {
        relationships.put(node, value);
    }

    /**
     *
     * @param n
     * @return
     */
    @Override
    public int nrOfApp() {
        int nr = 0;
        for(Map.Entry m : this.relationships.entrySet())
        {
            if(m.getValue().equals(this.name))
            {
            
                
                nr++;
            }
        }
        
        return nr;
    }

   

    
   
   
    
}
