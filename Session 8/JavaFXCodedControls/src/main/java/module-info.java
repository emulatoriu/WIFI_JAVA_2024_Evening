module com.emu.javafxcodedcontrols {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.emu.javafxcodedcontrols to javafx.fxml;
    exports com.emu.javafxcodedcontrols;
}