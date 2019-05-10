import entities.ECM;
import entities.Roof;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    /*public static void main(String[] args) {

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
*/
    @Override
    public void start(Stage primaryStage) throws Exception {
       /* Parent fxml = FXMLLoader.load(getClass().getResource("/resources/FirstView.fxml "));
        Scene scene = new Scene(fxml);
        primaryStage.setWidth(600);
        primaryStage.setHeight(350);
        primaryStage.setScene(scene);
        primaryStage.show();*/
       System.out.println(2+3+"2"+9+1);
    }
}
