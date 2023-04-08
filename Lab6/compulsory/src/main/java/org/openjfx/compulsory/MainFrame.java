/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.openjfx.compulsory;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.application.Application;
import javafx.stage.Stage;

/**
 *
 * @author G
 */

public class MainFrame extends Application {
    private ConfigPanel configPanel;
    private ControlPanel controlPanel;
    private DrawingPanel canvas;

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("My Drawing Application");

        // create the components
        canvas = new DrawingPanel(this);
        configPanel = new ConfigPanel(this);
        controlPanel = new ControlPanel(this);

        // arrange the components in the container (BorderPane)
        BorderPane root = new BorderPane();
        root.setCenter(canvas);
        root.setLeft(configPanel);
        root.setBottom(controlPanel);

        // create and set the scene
        Scene scene = new Scene(root, 800, 600);
        primaryStage.setScene(scene);

        primaryStage.show();
    }

    void close() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

   
}

