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
public class Designer extends Person {
    
    private boolean isProgrammer;

    public Designer(String name, Date birthDay, boolean isProgrammer) {
        super(name, birthDay);
        this.isProgrammer = isProgrammer;
    }

    

    public boolean getIsProgrammer() {
        return isProgrammer;
    }

    public void setIsProgrammer(boolean isProgrammer) {
        this.isProgrammer = isProgrammer;
    }
    
    
    
}
