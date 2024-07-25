package com.example.javafxsecretmessage;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class SecretController {
    @FXML
    private TextField secretMessage;

    private String message;
    private Stage stage;

    @FXML
    protected void onOkPressed() {
        message = secretMessage.getText();
        stage.close();
    }

    public void setStage(Stage stage) {
        this.stage = stage;
    }

    public String getMessage() {
        return message;
    }
}
