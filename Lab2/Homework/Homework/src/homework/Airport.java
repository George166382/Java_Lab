/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package homework;

/**
 *
 * @author G
 */
public class Airport extends Location {
     protected int nrOfTerminals;
    public Airport()
    {
        super();
        this.nrOfTerminals = 0;
    }
    public Airport(String name, double x, double y,int nrOfTerminals)
    {
        super(name,x,y);
        this.nrOfTerminals = nrOfTerminals;
    }

    public int getNrOfTerminals() {
        return nrOfTerminals;
    }

    public void setNrOfTerminals(int nrOfTerminals) {
        this.nrOfTerminals = nrOfTerminals;
    }

}
