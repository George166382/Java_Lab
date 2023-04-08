/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.openjfx.compulsory;

/**
 *
 * @author G
 */
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderStroke;
import javafx.scene.layout.BorderStrokeStyle;
import javafx.scene.layout.BorderWidths;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;

public class DrawingPanel extends Pane {
    final MainFrame frame;
    final static int W = 800, H = 600;
    
    public DrawingPanel(MainFrame frame) {
        this.frame = frame;
        initPanel();
    }
    
    private void initPanel() {
        setPrefSize(W, H);
        setBorder(new Border(new BorderStroke(Color.BLACK,
                BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));
    }
    
    @Override
    protected void layoutChildren() {
        // draw the board
    
    }
}
    