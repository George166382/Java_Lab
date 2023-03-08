/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package compulsory;

/**
 *
 * @author G
 */
public class Location {
    private String name;
    public enum Type{
        CITY,
        AIRPORT,
        GASSTATION
    }
    private Type type;
    private double x,y;
    public Location()
    {
        this.name = new String();
        this.type = null;
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
     * @return the type
     */
    public Type getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(Type type) {
        this.type = type;
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
        return "Location{" + "name=" + name + ", type=" + type + ", x=" + x + ", y=" + y + '}';
    }

    
    
}
