/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package homework;

/**
 *
 * @author G
 */
public class Problem {
    Location[] locations;
    Road[] roads;
    private int nrOfLocations;
    private int nrOfRoads;
    public Problem()
    {
        this.nrOfLocations = 0;
        this.nrOfRoads = 0;
        locations = new Location[10];
        roads=new Road[10];
        
    }
    public void setNewLoc(String name, double x, double y)
    {
        this.locations[this.nrOfLocations] = new Location();
        this.locations[this.nrOfLocations].setName(name);
        this.locations[this.nrOfLocations].setX(x);
        this.locations[this.nrOfLocations].setY(y);
        this.nrOfLocations = this.nrOfLocations + 1;
    }
    public void setNewRoad(Location a,Location b)
    {
        this.roads[this.nrOfRoads] = new Road(a,b);
        this.nrOfRoads = this.nrOfRoads + 1;
    }
    public int verify()
    {
        int nr = 0;
        for(int i=0;i<this.nrOfLocations;i++)
        {
            for(int j=0;j<this.nrOfLocations;j++)
            {
                if(this.locations[i].equals(this.locations[j]))
                {
                    nr++;
                }
            }
        }
        int nr1 = 0;
        for(int i=0;i<this.nrOfRoads;i++)
        {
            for(int j=0;j<this.nrOfRoads;j++)
            {
                if(this.roads[i].equals(this.roads[j]))
                {
                    nr1++;
                }
            }
        }
        if(nr == this.nrOfLocations && nr1 == this.nrOfRoads)return 1;
        else return -1;
    }
    public Location getLocInd(int i)
    {
        return this.locations[i];
    }
    public int Alg(Location a,Location b)
    {
        int ok=0;
        int retine = -1;
        //verifica daca a formeaza drum
        for(int i=0;i<6;i++)
        {
            if(this.roads[i].getA().equals(a))
            {
                ok=1;
                retine = i;
            }
        }
        if(ok==0) 
        {
            
            return -1;
        }
        else
        {
            // verific daca b face drum cu a
            Location x = this.roads[retine].getA();
            while(ok==1)
            {
                if(x.equals(b))
                {
                    ok=0;
                    break;
                }
                x = this.roads[retine].getB();
                if(x.equals(b))
                {
                    ok=0;
                    break;
                }
                int stop = 0;
                for(int i=0;i<this.nrOfRoads && stop==0;i++)
                {
                    if(this.roads[i].getA().equals(x))
                    {
                        retine = i;
                        stop = 1;
                        
                    }
                }
                if(stop == 0) {System.out.println("De aici");return -1;}
            }
            if(ok==0)return 1;
            else {return -1;}
        }
        
    }
}
