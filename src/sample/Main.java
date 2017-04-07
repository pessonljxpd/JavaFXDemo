package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Main extends Application {

    private GridPane mGridPane;

    @Override
    public void start(Stage primaryStage) throws Exception {
        mGridPane = new GridPane();
        mGridPane.setAlignment(Pos.CENTER);
        mGridPane.setHgap(10);
        mGridPane.setVgap(10);
        mGridPane.setPadding(new Insets(25, 25, 25, 25));
        mGridPane.setStyle("-fx-background-color: darkolivegreen");

        initWidget();

        primaryStage.setTitle("JavaFX Demo");
        primaryStage.setScene(new Scene(mGridPane, 900, 600));
        primaryStage.show();
    }

    private void initWidget() {
        Label labelUsername = new Label("用户名：");
        labelUsername.setStyle("-fx-alignment: center-right");
        Label labelPassword = new Label("密码：");
        labelPassword.setStyle("-fx-alignment: center-right");

        TextField textFieldUsername = new TextField();
        PasswordField passwordField = new PasswordField();

        mGridPane.add(labelUsername, 0, 0);
        mGridPane.add(labelPassword, 0, 1);
        mGridPane.add(textFieldUsername, 1, 0);
        mGridPane.add(passwordField, 1, 1);

    }


    public static void main(String[] args) {
        launch(args);
    }
}
