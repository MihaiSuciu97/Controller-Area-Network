package controller;

import entities.ABS;
import entities.Roof;
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

    @FXML ImageView tcuImage;

    public Date date;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        absImage.setVisible(false);
        espImage.setVisible(false);
        oilImage.setVisible(false);
        roofImage.setVisible(false);
        seatImage.setVisible(false);
        tcuImage.setVisible(false);




    }

    public void startSimulationList() throws InterruptedException {

        ABS abs = new ABS();
        Roof roof = new Roof();

        date = roof.execute();

        roofImage.setVisible(true);

        PauseTransition visiblePause = new PauseTransition(
                Duration.seconds(3)
        );
        visiblePause.setOnFinished(
                event -> roofImage.setVisible(false)
        );

        visiblePause.play();
        Date date1 = roof.repair();





    }
}





