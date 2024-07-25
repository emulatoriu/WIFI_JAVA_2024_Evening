package com.emu.javafx_change_scene;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick(ActionEvent actionEvent) throws IOException {
        Stage stage = (Stage) welcomeText.getScene().getWindow();
        welcomeText.setText("Welcome to JavaFX Application!");
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("second-scene.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }
}