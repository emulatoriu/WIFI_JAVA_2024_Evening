module com.example.questionsjsongenerator {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.questionsjsongenerator to javafx.fxml;
    exports com.example.questionsjsongenerator;
}