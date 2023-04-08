/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.openjfx.compulsory;

/**
 *
 * @author G
 */
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;

public class ControlPanel extends HBox {
    private final MainFrame frame;
    private Button exitBtn = new Button("Exit");
    private Button loadBtn = new Button("Load");
    private Button saveBtn = new Button("Save");
    private Button resetBtn = new Button("Reset");
    private Button undoBtn = new Button("Undo");
    private Button redoBtn = new Button("Redo");
    private Button infoBtn = new Button("Info");
    // create all buttons (Load, Exit, etc.)
    // ...TODO
    
    public ControlPanel(MainFrame frame) {
        this.frame = frame;
        init();
    }

    private void init() {
        // add all buttons to a container
        // ...TODO
        HBox container = new HBox(10, exitBtn, loadBtn, saveBtn, resetBtn, undoBtn, redoBtn, infoBtn);
        container.setPadding(new Insets(10));
        
        // configure listeners for all buttons
        exitBtn.setOnAction(this::exitGame);
        loadBtn.setOnAction(this::loadGame);
        saveBtn.setOnAction(this::saveGame);
        resetBtn.setOnAction(this::resetGame);
        undoBtn.setOnAction(this::undoGame);
        redoBtn.setOnAction(this::redoGame);
        infoBtn.setOnAction(this::showInfo);
        
        // add the container to this panel
        getChildren().add(container);
    }

    private void exitGame(ActionEvent e) {
        frame.close();
    }

    // ...TODO

    private void saveGame(ActionEvent t) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void loadGame(ActionEvent t) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void resetGame(ActionEvent t) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void undoGame(ActionEvent t) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void redoGame(ActionEvent t) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void showInfo(ActionEvent t) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

