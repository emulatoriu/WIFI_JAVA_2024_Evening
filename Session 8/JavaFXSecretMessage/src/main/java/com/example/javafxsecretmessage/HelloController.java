package com.example.javafxsecretmessage;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloController {
    @FXML
    private Label welcomeText;

    private Stage primaryStage;

    @FXML
    protected void onHelloButtonClick() throws IOException {
        welcomeText.setText("Welcome to JavaFX Application!");
        Stage stage = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("secret-msg.fxml"));
        Scene scene = new Scene(fxmlLoader.load());

        SecretController controller = fxmlLoader.getController();
        controller.setStage(stage);
        stage.setScene(scene);

        stage.initModality(Modality.WINDOW_MODAL);
        stage.initOwner(primaryStage);
        stage.showAndWait();

        welcomeText.setText(controller.getMessage());

    }

    public void setPrimaryStage(Stage primaryStage) {
        this.primaryStage = primaryStage;
    }
}