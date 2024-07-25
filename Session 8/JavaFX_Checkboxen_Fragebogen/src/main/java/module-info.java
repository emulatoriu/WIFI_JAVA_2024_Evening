module com.example.javafx_checkboxen_fragebogen {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.javafx_checkboxen_fragebogen to javafx.fxml;
    exports com.example.javafx_checkboxen_fragebogen;
}