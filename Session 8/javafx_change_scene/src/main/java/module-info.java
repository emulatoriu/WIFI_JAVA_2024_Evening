module com.emu.javafx_change_scene {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.emu.javafx_change_scene to javafx.fxml;
    exports com.emu.javafx_change_scene;
}