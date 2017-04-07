package sample.userlogin;/**
 * Created by Shelly on 2017-4-7.
 */

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class UserLogin extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("userLogin.fxml"));

        primaryStage.setTitle("JavaFX Welcome!");
        primaryStage.setScene(new Scene(root, 600, 400));
        primaryStage.show();
    }
}
