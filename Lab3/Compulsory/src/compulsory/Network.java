/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package compulsory;


import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author G
 */
public class Network {
    private List<Node> nodes = new ArrayList<>();

    public void print()
    {
        for(int i=0;i<this.nodes.size();i++)
        {
            System.out.print(this.nodes.get(i).getName() + " ");
        }
    }
    public void addNode(Node node)
    {
        nodes.add(node);
    }
}
