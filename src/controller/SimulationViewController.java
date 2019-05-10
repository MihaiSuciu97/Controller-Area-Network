package controller;

import entities.ECM;
import entities.Roof;
import javafx.animation.PauseTransition;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.image.ImageView;
import javafx.util.Duration;

import java.net.URL;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.ResourceBundle;
import java.util.concurrent.TimeUnit;

public class SimulationViewController implements Initializable {

    @FXML
    public ImageView roofImage;

    @FXML
    private ListView<String> list = new ListView<>();

    @FXML
    private Button startButton;


    ObservableList<String> items = FXCollections.observableArrayList();

    Date date;


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        list.setItems(items);
        roofImage.setVisible(false);

    }

    public void startSimulationList() throws InterruptedException {

        Roof roof = new Roof();
        date = roof.execute();
        items.add(date.toString() + "- roof problem");

        roofImage.setVisible(true);
        System.out.println("sunt aici");
        PauseTransition visiblePause = new PauseTransition(
                Duration.seconds(3)
        );
        visiblePause.setOnFinished(
                event -> roofImage.setVisible(false)
        );

        visiblePause.play();
        Date date1 = roof.open();
        items.add(date1.toString() + "- roof opened");




    }
}





