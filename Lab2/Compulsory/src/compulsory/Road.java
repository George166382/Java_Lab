/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package compulsory;
import java.lang.Math;
/**
 *
 * @author G
 */
public class Road {
    private RoadType type;
    private int speedLimit;
    private double length;
    public enum RoadType{
        HIGHWAY,
        EXPRESS,
        COUNTRY
    }
    public Road()
    {
        this.type = null;
        this.length = 0;
        this.speedLimit = 0;
    }
    public Road(RoadType type,Location a,Location b, int sl)
    {
        this.type = type;
        this.length = Math.sqrt(((a.getX() - b.getX()) * (a.getX() - b.getX()) + (a.getY() - b.getY()) * (a.getY() - b.getY())));
        this.speedLimit = sl;   
    }
    /**
     * @return the type
     */
    public RoadType getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(RoadType type) {
        this.type = type;
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

    @Override
    public String toString() {
        return "Road{" + "type=" + type + ", speedLimit=" + speedLimit + ", length=" + length + '}';
    }

    
}
