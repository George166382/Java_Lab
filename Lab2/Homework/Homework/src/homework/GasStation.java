/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package homework;

/**
 *
 * @author G
 */
public class GasStation extends Location {
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
