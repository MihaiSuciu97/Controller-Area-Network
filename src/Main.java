
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent fxml = FXMLLoader.load(getClass().getResource("/resources/FirstView.fxml "));
        Scene scene = new Scene(fxml);
        primaryStage.setWidth(650 );
        primaryStage.setHeight(380);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
