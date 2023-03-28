/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package homework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;



/**
 *
 * @author G
 */
public class Network {
    private List<Node> nodes = new ArrayList<>();
    public void addNode(Node node)
    {
        nodes.add(node);
    }
    public int nrConnections(Node node)
    {
        return node.nrOfApp();
    }

    
    public void print()
    {
        this.nodes.sort(Comparator.comparing((Node n)->n.nrOfApp()));
        for(int i=0;i<this.nodes.size();i++)
        {
            System.out.println(this.nodes.get(i).getName() + " " + this.nodes.get(i).nrOfApp());
        }
    }

    
}
