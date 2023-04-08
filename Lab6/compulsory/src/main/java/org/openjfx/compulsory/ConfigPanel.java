/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.openjfx.compulsory;

/**
 *
 * @author G
 */
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory.IntegerSpinnerValueFactory;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class ConfigPanel extends VBox {
    private final MainFrame frame;
    private Label dotsLabel, linesLabel;
    private Spinner<Integer> dotsSpinner;
    private ComboBox<String> linesCombo;
    private Button createButton;

    public ConfigPanel(MainFrame frame) {
        this.frame = frame;
        init();
    }

    private void init() {
        // create the label and the spinner
        dotsLabel = new Label("Number of dots:");
        dotsSpinner = new Spinner<>(3, 100, 6);
        dotsSpinner.setEditable(true);
        dotsSpinner.setPrefWidth(60);

        // create the rest of the components
        linesLabel = new Label("Type of lines:");
        linesCombo = new ComboBox<>();
        linesCombo.getItems().addAll("Solid", "Dotted", "Dashed");
        linesCombo.setValue("Solid");

        createButton = new Button("Create");

        // arrange the components in a layout (HBox and VBox)
        HBox dotsBox = new HBox(10, dotsLabel, dotsSpinner);
        HBox linesBox = new HBox(10, linesLabel, linesCombo);
        VBox container = new VBox(10, dotsBox, linesBox, createButton);
        container.setPadding(new Insets(10));
        container.setPrefWidth(200);

        // add the container to this panel
        getChildren().add(container);
    }
}

