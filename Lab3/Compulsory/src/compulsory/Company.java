/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package compulsory;


/**
 *
 * @author G
 */
public class Company implements Node,Comparable<Company> {
    private String name;
    
    public Company()
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
    public int compareTo(Company o) {
        return this.name.compareTo(o.name);
    }

    
}
