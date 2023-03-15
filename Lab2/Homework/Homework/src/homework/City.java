/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package homework;

/**
 *
 * @author G
 */
public class City extends Location {
    protected int population;
    public City()
    {
        super();
        this.population = 0;
    }
    public City(String name, double x, double y,int population)
    {
        super(name,x,y);
        this.population = population;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }
    
}
