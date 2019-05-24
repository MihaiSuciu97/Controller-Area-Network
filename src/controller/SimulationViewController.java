package controller;

import entities.*;
import javafx.animation.PauseTransition;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.ImageView;
import javafx.util.Duration;

import java.net.URL;
import java.util.Date;
import java.util.ResourceBundle;

public class SimulationViewController implements Initializable {

    @FXML
    public ImageView absImage;

    @FXML
    public ImageView espImage;

    @FXML
    public ImageView oilImage;

    @FXML
    public ImageView roofImage;

    @FXML
    public ImageView seatImage;

    @FXML
    public ImageView airbagImage;

    private Date date;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        absImage.setVisible(false);
        espImage.setVisible(false);
        oilImage.setVisible(false);
        roofImage.setVisible(false);
        seatImage.setVisible(false);
        airbagImage.setVisible(false);

    }

    public void simulation1() {

        ABS abs = new ABS();
        Roof roof = new Roof();

        date = abs.execute();
        System.out.println("Abs problem - " + date);
        date = roof.execute();
        System.out.println("Roof small problem - " + date);

        roofImage.setVisible(true);
        absImage.setVisible(true);

        PauseTransition visiblePause = new PauseTransition(Duration.seconds(3));
        visiblePause.setCycleCount(1);
        visiblePause.setOnFinished(event -> {
            absImage.setVisible(false);
            date = abs.repair();
            System.out.println("Abs repaired - " + date);
        });
        visiblePause.play();

        PauseTransition visiblePause1 = new PauseTransition(Duration.seconds(6));
        visiblePause1.setCycleCount(1);
        visiblePause1.setOnFinished(event -> {
            roofImage.setVisible(false);
            date = roof.repair();
            System.out.println("Roof repaired - " + date);
        });
        visiblePause1.play();

    }

    public void simulation2() {

        System.out.println("SPORT");

        ABS abs = new ABS();
        Airbag airbag = new Airbag();
        ESP esp = new ESP();
        Oil oil = new Oil();
        Roof roof = new Roof();
        Seat seat = new Seat();


        date = abs.execute();
        System.out.println("Abs problem - " + date);
        absImage.setVisible(true);
        date = airbag.execute();
        System.out.println("Airbag problem - " + date);
        airbagImage.setVisible(true);
        date = esp.execute();
        System.out.println("Esp problem - " + date);
        espImage.setVisible(true);


        /*PauseTransition visiblePause = new PauseTransition(Duration.seconds(3));
        visiblePause.setCycleCount(1);
        visiblePause.setOnFinished(event -> {
            absImage.setVisible(false);
            date = abs.repair();
            System.out.println("Abs repaired - " + date);
        });
        visiblePause.play();*/
    }

}





