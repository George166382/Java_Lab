/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package homework;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 *
 * @author G
 */
public class Person implements Node,Comparable<Person> {
    private String name;
    private Date birthDay;
    private Map<Node,String> relationships = new HashMap<>();

    public Person(String name, Date birthDay) {
        this.name = name;
        this.birthDay = birthDay;
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(Date birthDay) {
        this.birthDay = birthDay;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + Objects.hashCode(this.name);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Person other = (Person) obj;
        return Objects.equals(this.name, other.name);
    }
    
    @Override
    public int compareTo(Person o) {
        return this.name.compareTo(o.getName());
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
    public int nrOfApp()
    {
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
