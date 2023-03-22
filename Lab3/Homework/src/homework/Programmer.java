/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package homework;

import java.util.Date;

/**
 *
 * @author G
 */
public class Programmer extends Person {
    
    private int experience;

    public Programmer(int experience, String name, Date birthDay) {
        super(name, birthDay);
        this.experience = experience;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

   
    
}
