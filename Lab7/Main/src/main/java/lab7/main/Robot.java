/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab7.main;

import java.util.*;

public class Robot implements Runnable {
    private final String name;
    private final Map map;
    private final Memory memory;
    private final int tokensPerVisit;
    private int totalTokens;
    private int row;
    private int col;
    private boolean running;
    private boolean canPrint;

    public Robot(String name, Map map, Memory memory, int tokensPerVisit, boolean canPrint, int row, int col) {
        this.name = name;
        this.map = map;
        this.memory = memory;
        this.tokensPerVisit = tokensPerVisit;
        this.totalTokens = 0;
        this.running = true;
        this.canPrint=canPrint;
        this.row = row;
        this.col = col;
    }

    public String getName() {
        return name;
    }

    public int getTokensPerVisit() {
        return tokensPerVisit;
    }
    public void addTok(){
        this.totalTokens = this.totalTokens + this.getTokensPerVisit();
    }
    public void printTotal(){
        System.out.println(this.getName() + " has placed " + this.totalTokens + " tokens.");
    }
    @Override
    public void run() {
        Random random = new Random();
        //int size = map.getSize();
        map.visit(this.row, this.col, this, memory);
        while (running) {
            int ok=0;
            if(map.visit(this.row-1, this.col-1, this, memory)&&ok==0)
            {
                this.row = this.row - 1;
                this.col = this.col - 1;
                map.visitCell(this.row, this.col, this, memory);
                ok=1;
            }
            if(map.visit(this.row-1, this.col, this, memory)&&ok==0)
            {
                this.row = this.row - 1;
                this.col = this.col;
                map.visitCell(this.row, this.col, this, memory);
                ok=1;
            }
            if(map.visit(this.row-1, this.col+1, this, memory)&&ok==0)
            {
                this.row = this.row - 1;
                this.col = this.col + 1;
                map.visitCell(this.row, this.col, this, memory);
                ok=1;
            }
            if(map.visit(this.row, this.col-1, this, memory)&&ok==0)
            {
                this.row = this.row;
                this.col = this.col - 1;
                map.visitCell(this.row, this.col, this, memory);
                ok=1;
            }
            if(map.visit(this.row, this.col+1, this, memory)&&ok==0)
            {
                this.row = this.row;
                this.col = this.col + 1;
                map.visitCell(this.row, this.col, this, memory);
                ok=1;
            }
            if(map.visit(this.row+1, this.col-1, this, memory)&&ok==0)
            {
                this.row = this.row + 1;
                this.col = this.col - 1;
                map.visitCell(this.row, this.col, this, memory);
                ok=1;
            }
            if(map.visit(this.row+1, this.col, this, memory)&&ok==0)
            {
                this.row = this.row + 1;
                this.col = this.col;
                map.visitCell(this.row, this.col, this, memory);
                ok=1;
            }
            if(map.visit(this.row+1, this.col+1, this, memory)&&ok==0)
            {
                this.row = this.row+1;
                this.col = this.col+1;
                map.visitCell(this.row, this.col, this, memory);
                ok=1;
            }
            if (map.allCellsVisited()) {
                System.out.println("All cells visited. Stopping " + getName() + ".");
                this.printTotal();
                if(canPrint)
                    map.printMatrix();
                break;
            }
            try {
                Thread.sleep(random.nextInt(1000) + 500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}