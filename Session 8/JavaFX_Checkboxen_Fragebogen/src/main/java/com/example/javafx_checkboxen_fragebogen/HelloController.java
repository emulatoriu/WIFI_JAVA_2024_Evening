package com.example.javafx_checkboxen_fragebogen;

import javafx.animation.PauseTransition;
import javafx.animation.TranslateTransition;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.IOException;

public class HelloController {
    @FXML
    private Label welcomeText;
    @FXML
    private VBox mainPane;

    @FXML
    protected void onHelloButtonClick() throws IOException {

        welcomeText.setText("Welcome to JavaFX Application!");
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Question1.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 600);
        Stage stage = (Stage) welcomeText.getScene().getWindow();

        TranslateTransition transition = new TranslateTransition(Duration.seconds(0.5), mainPane);
        transition.setToX(mainPane.getWidth());
//        transition.setToY(-mainPane.getHeight());
        transition.setOnFinished(e -> {
//            PauseTransition pause = new PauseTransition(Duration.seconds(3)); // Adjust this duration as needed
//            pause.setOnFinished(event -> stage.setScene(scene));
//            pause.play();
            stage.setScene(scene);
        });
        transition.play();
    }
}