package az.dea.app;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("/fxml/home.fxml"));
        //primaryStage.isMaximized();
        //primaryStage.setFullScreen(true);
        primaryStage.setTitle("DEA Restautant");
        primaryStage.setScene(new Scene(root, 1360, 710));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
