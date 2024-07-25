module com.example.javafxtableexample {
    opens data to javafx.base;
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.javafxtableexample to javafx.fxml;
    exports com.example.javafxtableexample;
}