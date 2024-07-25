package com.example.javafx_check_input;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.TextFormatter;
import javafx.scene.input.KeyEvent;

import java.util.function.UnaryOperator;
import java.util.regex.Pattern;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    private TextField numberInput;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    @FXML
    protected void onInputChanged(KeyEvent e) {
        UnaryOperator<TextFormatter.Change> filter = c -> {
            Pattern pattern = Pattern.compile("[0-9]*");
            if (pattern.matcher(c.getControlNewText()).matches()) {
                return c ;
            } else {
                return null ;
            }
        };
        TextFormatter<String> formatter = new TextFormatter<>(filter);
        numberInput.setTextFormatter(formatter);
//        e.consume();
//        String currentText = numberInput.getText();
//        String newText = currentText + e.getCharacter();
//        if (!e.getText().matches("\\d")) {
//            // Wenn die neue Eingabe keine Zahl ist, behalte den vorherigen Text bei
//            numberInput.setText(currentText);
//            e.consume(); // Verhindere, dass das Zeichen eingefügt wird
//        }
    }
}