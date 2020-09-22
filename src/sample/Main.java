package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;


public class Main extends Application {




    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        Stage primaryStage = null;
        primaryStage.setTitle("Меню администратора");
        primaryStage.setScene(new Scene(root,1920,1080));
        primaryStage.show();
    }
    public static void main(String[] args) throws IOException {
        launch(args);
    }
}

