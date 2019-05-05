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
import javafx.util.Duration;

import javax.swing.text.html.ImageView;
import java.net.URL;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.ResourceBundle;

public class SimulationViewController implements Initializable {

    @FXML
    private ListView<String> list = new ListView<>();

    @FXML
    private Button startButton;

    @FXML
    private ImageView roofImage;


    ObservableList<String> items = FXCollections.observableArrayList();

    Date date;

    private ObservableList<Date> dates = FXCollections.observableArrayList();

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        list.setItems(null);
        /*Roof roof = new Roof();
        roof.execute();

        ECM ecm = new ECM();
        ecm.execute();
        if(roof.isImportant()==true){
            roof.open();
        }
        else{
            if(ecm.isImportant()==true){
                ecm.repair();
                roof.open();
            }
        }*/
       /* Roof roof = new Roof();
        Date date = new Date();
        date = roof.execute();
        listView.getItems().add(date.toString());*/
    }

    public void startSimulationList() throws InterruptedException {
        Roof roof = new Roof();
        Date date1 = roof.execute();
        ECM ecm = new ECM();
        Date date2 = ecm.execute();
        items.add(date1.toString() + "- roof problem");
        items.add(date2.toString() + " - ECM problem");
        list.setItems(items);
        startButton.setVisible(false);
        if (ecm.isImportant()) {
            Thread.sleep(10000);
            System.out.println("ba aici");
            date = ecm.repair();
            items.add(date.toString() + " - ECM solved");


            date = roof.open();
            items.add(date.toString() + " - Roof opened");
        }
        startButton.setVisible(true);
    }
}





