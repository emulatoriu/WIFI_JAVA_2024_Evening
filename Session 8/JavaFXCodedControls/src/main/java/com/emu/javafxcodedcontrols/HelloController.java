package com.emu.javafxcodedcontrols;

import com.emu.javafxcodedcontrols.logic.MessageService;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label welcomeText;

    private MessageService messageService;

    public void setMessageService(MessageService messageService) {
        this.messageService = messageService;
    }

    @FXML
    protected void onHelloButtonClick(ActionEvent actionEvent) {
        System.out.println(actionEvent.getSource().toString());
        String text = "Welcome to JavaFX Application!";
        String translated = messageService.transferToSingleSternianer(text);
        welcomeText.setText(translated);
    }
}