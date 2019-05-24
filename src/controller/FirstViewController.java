package controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class FirstViewController implements Initializable {

    @FXML
    private Button startSimulationButton;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        startSimulationButton.setStyle("-fx-border-color: #000000; -fx-border-width: 3px;-fx-background-color: #FF6347");
    }

    public void startSimulation() {
        Scene scene = startSimulationButton.getScene();
        Parent newFxml;
        try {
            newFxml = FXMLLoader.load(getClass().getResource("/resources/SimulationView.fxml"));
            scene.setRoot(newFxml);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
