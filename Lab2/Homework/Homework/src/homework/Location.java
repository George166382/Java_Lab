/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package homework;

import java.util.Objects;

/**
 *
 * @author G
 */
public class Location {
    private String name;
    private double x,y;
    public Location()
    {
        this.name = new String();
        this.x = 0;
        this.y = 0;
    }
    public Location(String name, double x, double y)
    {
        this.name = new String();
        this.name = name;
        this.x = x;
        this.y = y;
    }
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }


    /**
     * @return the x
     */
    public double getX() {
        return x;
    }

    /**
     * @param x the x to set
     */
    public void setX(double x) {
        this.x = x;
    }

    /**
     * @return the y
     */
    public double getY() {
        return y;
    }

    /**
     * @param y the y to set
     */
    public void setY(double y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Location{" + "name=" + name + '}';
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
        final Location other = (Location) obj;
        if (Double.doubleToLongBits(this.x) != Double.doubleToLongBits(other.x)) {
            return false;
        }
        if (Double.doubleToLongBits(this.y) != Double.doubleToLongBits(other.y)) {
            return false;
        }
        return Objects.equals(this.name, other.name);
    }

  
    
    
}

class City extends Location
{
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

class Airport extends Location
{
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

class GasStation extends Location
{
    protected int price;
    public GasStation()
    {
        super();
        this.price = 0;
    }
    public GasStation(String name, double x, double y,int price)
    {
        super(name,x,y);
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    
}
