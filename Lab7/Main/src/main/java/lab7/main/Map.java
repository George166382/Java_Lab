/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab7.main;

import java.util.*;


public class Map {

        private final Cell[][] matrix;
        private int n;

        public Map(int n) {
            this.n = n;
            matrix = new Cell[n][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    matrix[i][j] = new Cell();
                }
            }
        }

        
        public void  visitCell(int row,int col,Robot robot, Memory memory){
            Cell cell = matrix[row][col];
            synchronized (cell){
             List<Token> tokens = memory.extractTokens(robot.getTokensPerVisit());
             cell.setTokens(tokens);
             robot.addTok();
             System.out.println(robot.getName() + " visited cell [" + row + ", " + col + "] and placed tokens: " + tokens);
            }
        }
        public boolean visit(int row, int col, Robot robot, Memory memory) {
            if(!(row >= 0  && row <= n-1 && col >= 0 && col <= n-1))
            {
                return false;
            }
            Cell cell = matrix[row][col];
            synchronized (cell) {
                if (!cell.isVisited()) {
                    
                    return true;
                }
            }
            return false;
        }
    public boolean allCellsVisited() {
        for (Cell[] row : matrix) {
            for (Cell cell : row) {
                if (!cell.isVisited()) {
                    return false;
                }
            }
        }
        return true;
    }

        public int getSize() {
            return matrix.length;
        }
        public void printMatrix() {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                Cell cell = matrix[i][j];
                List<Token> tokens = cell.getTokens();
                System.out.print("[" + i + "," + j + "]: ");
                System.out.println(tokens);
            }
        }
    }
    }
