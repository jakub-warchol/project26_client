package GUI;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    private static final String TITLE = "Milionerzy";

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("Application.fxml"));
        primaryStage.setTitle(TITLE);
        primaryStage.setScene(new Scene(root, 716, 402));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
