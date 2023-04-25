/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab7.main;

import java.util.*;

public class Cell {
    private List<Token> tokens;

    public Cell() {
        this.tokens = null;
    }

    public boolean isVisited() {
        return tokens != null;
    }

    public void setTokens(List<Token> tokens) {
        this.tokens = tokens;
    }

    public List<Token> getTokens() {
        return tokens;
    }
}
