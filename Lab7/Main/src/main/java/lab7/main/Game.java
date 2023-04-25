/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab7.main;

import java.util.*;

public class Game {
    private final List<Robot> robots;

    public Game() {
        this.robots = new ArrayList<>();
    }

    public void addRobot(Robot robot) {
        robots.add(robot);
    }

    public void start() {
        for (Robot robot : robots) {
            new Thread(robot).start();
        }
    }
}