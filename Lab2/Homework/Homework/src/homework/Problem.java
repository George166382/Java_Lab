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
    private final int nrOfLocations;
    private final int nrOfRoads;
    public Problem()
    {
        this.nrOfLocations = 10;
        this.nrOfRoads = 10;
        locations = new Location[10];
        roads=new Road[10];
        this.locations[0] = new Location();
        this.locations[0].setName("Iasi");
        this.locations[0].setX(39.45);
        this.locations[0].setY(16.22);
        this.locations[1] = new Location();
        this.locations[1].setName("Bucuresti");
        this.locations[1].setX(12.233);
        this.locations[1].setY(78.213);
        this.locations[2] = new Location();
        this.locations[2].setName("Cluj");
        this.locations[2].setX(19.33);
        this.locations[2].setY(27.199);
        this.locations[3] = new Location();
        this.locations[3].setName("Craiova");
        this.locations[3].setX(200.2123);
        this.locations[3].setY(123.2313);
        this.locations[4] = new Location();
        this.locations[4].setName("Constanta");
        this.locations[4].setX(99.01);
        this.locations[4].setY(1000.314);
        this.locations[5] = new Location();
        this.locations[5].setName("Brasov");
        this.locations[5].setX(4344);
        this.locations[5].setY(113.45);
        this.locations[6] = new Location();
        this.locations[6].setName("Timisoara");
        this.locations[6].setX(312.333);
        this.locations[6].setY(231.15);
        this.locations[7] = new Location();
        this.locations[7].setName("Braila");
        this.locations[7].setX(231.231);
        this.locations[7].setY(199.14);
        this.locations[8] = new Location();
        this.locations[8].setName("Suceava");
        this.locations[8].setX(98.16);
        this.locations[8].setY(176.12);
        this.locations[9] = new Location();
        this.locations[9].setName("Sibiu");
        this.locations[9].setX(44.22);
        this.locations[9].setY(19.11);
        this.roads[0] = new Road(this.locations[2],this.locations[5]);
        this.roads[1] = new Road(this.locations[6],this.locations[3]);
        this.roads[2] = new Road(this.locations[1],this.locations[4]);
        this.roads[3] = new Road(this.locations[1],this.locations[0]);
        this.roads[4] = new Road(this.locations[2],this.locations[9]);
        this.roads[5] = new Road(this.locations[9],this.locations[5]);
        
    }
    public int Verify()
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
                for(int i=0;i<6 && stop==0;i++)
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
