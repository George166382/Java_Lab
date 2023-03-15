/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package compulsory;

/**
 *
 * @author G
 */
public class Person implements Node,Comparable<Person>{
    private String name;

    public Person()
    {
        this.name = new String();
    }
    
    @Override
    public String getName() {
        return this.name;
    }
    
     /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }
    
    @Override
    public int compareTo(Person o) {
        return this.name.compareTo(o.getName());
    }

    

    
}
