package com.emu.javafx_change_scene;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class SecondSceneController {

    @FXML
    private Button previous;


    @FXML
    protected void goToPreviousScene() throws IOException {
        Stage stage = (Stage) previous.getScene().getWindow();
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }
}
