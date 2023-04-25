/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.openjfx.compulsory;

/**
 *
 * @author G
 */
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;

import java.util.ArrayList;
import java.util.List;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderStroke;
import javafx.scene.layout.BorderStrokeStyle;
import javafx.scene.layout.BorderWidths;
import javafx.scene.layout.CornerRadii;

public class DrawingPanel extends Pane {
    final MainFrame frame;
    final static int W = 800, H = 600;
    final static int RADIUS = 200;
    final static int CENTER_X = W / 2;
    final static int CENTER_Y = H / 2;

    List<Circle> dots = new ArrayList<>();
    List<Line> lines = new ArrayList<>();

    // Player 1 is red, Player 2 is blue
    int currentPlayer = 1;

    public DrawingPanel(MainFrame frame) {
        this.frame = frame;
        initPanel();
    }

    private void initPanel() {
        setPrefSize(W, H);
        setBorder(new Border(new BorderStroke(Color.BLACK,
                BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));

        // Create dots on a circle
        for (int i = 0; i < 6; i++) {
            double angle = i * Math.PI / 3;
            double x = CENTER_X + RADIUS * Math.cos(angle);
            double y = CENTER_Y + RADIUS * Math.sin(angle);
            Circle dot = new Circle(x, y, 10, Color.BLACK);
            dots.add(dot);
            getChildren().add(dot);
        }

        // Connect the dots with lines
        for (int i = 0; i < dots.size(); i++) {
            int j = (i + 1) % dots.size();
            Line line = new Line(dots.get(i).getCenterX(), dots.get(i).getCenterY(),
                    dots.get(j).getCenterX(), dots.get(j).getCenterY());
            lines.add(line);
            getChildren().add(line);
        }
    }

    @Override
    protected void layoutChildren() {
        // update the color of the lines
        for (Line line : lines) {
            if (line.getStroke() == Color.GRAY) {
                line.setOnMouseClicked(e -> {
                    if (line.getStroke() == Color.GRAY) {
                        if (currentPlayer == 1) {
                            line.setStroke(Color.RED);
                        } else {
                            line.setStroke(Color.BLUE);
                        }
                        currentPlayer = 3 - currentPlayer; // switch players
                        //checkWin();
                    }
                });
            }
        }
    }

}