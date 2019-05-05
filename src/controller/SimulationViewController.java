package controller;

import entities.ECM;
import entities.Roof;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;

import java.net.URL;
import java.util.ResourceBundle;

public class SimulationViewController implements Initializable {

    @FXML
    private ListView listView;
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        Roof roof = new Roof();
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
        }
    }
}
