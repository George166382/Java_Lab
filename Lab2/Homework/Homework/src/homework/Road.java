/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package homework;
import java.lang.Math;

/**
 *
 * @author G
 */
public class Road {
    private Location a,b;
    private int speedLimit;
    private double length;
    public Road()
    {
        this.a = new Location();
        this.b = new Location();
        this.length = 0;
        this.speedLimit = 0;
    }
    public Road(Location a,Location b)
    {
        this.a = a;
        this.b = b;
        this.length = Math.sqrt(((a.getX() - b.getX()) * (a.getX() - b.getX()) + (a.getY() - b.getY()) * (a.getY() - b.getY())));
        this.speedLimit = 0;   
    }
    /**
     * @return the length
     */
    public double getLength() {
        return length;
    }

    /**
     * @param length the length to set
     */
    public void setLength(double length) {
        this.length = length;
    }

    /**
     * @return the speedLimit
     */
    public int getSpeedLimit() {
        return speedLimit;
    }

    /**
     * @param speedLimit the speedLimit to set
     */
    public void setSpeedLimit(int speedLimit) {
        this.speedLimit = speedLimit;
    }

    public Location getA() {
        return a;
    }

    public void setA(Location a) {
        this.a = a;
    }

    public Location getB() {
        return b;
    }

    public void setB(Location b) {
        this.b = b;
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
        final Road other = (Road) obj;
        if (this.speedLimit != other.speedLimit) {
            return false;
        }
        return Double.doubleToLongBits(this.length) == Double.doubleToLongBits(other.length);
    }
    
}

class Highway extends Road
{
    public Highway()
    {
        super();
    }
    public Highway(Location a, Location b)
    {
        super(a,b);
    }
    
}
class Express extends Road
{
    public Express()
    {
        super();
    }
    public Express(Location a, Location b)
    {
        super(a,b);
    }
    
}
class Country extends Road
{
    public Country()
    {
        super();
    }
    public Country(Location a, Location b)
    {
        super(a,b);
    }
    
}
