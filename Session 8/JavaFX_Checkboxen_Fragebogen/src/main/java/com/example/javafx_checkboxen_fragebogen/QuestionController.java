package com.example.javafx_checkboxen_fragebogen;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;

public class QuestionController {
    @FXML
    private CheckBox cbDuGe;
    @FXML
    private CheckBox cbNoe;
    @FXML
    private CheckBox cbSoFa;
    @FXML
    private CheckBox cbFin;
    @FXML
    private Button btn;

    @FXML
    public void onBtnPress() {
        btn.setStyle("-fx-border-color: red; -fx-font-size: 20px;-fx-background-color: blue");
        System.out.println(cbDuGe.isSelected());
        System.out.println(cbNoe.isSelected());
        System.out.println(cbSoFa.isSelected());
        System.out.println(cbFin.isSelected());
    }

}
