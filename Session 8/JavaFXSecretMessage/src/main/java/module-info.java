module com.example.javafxsecretmessage {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.example.javafxsecretmessage to javafx.fxml;
    exports com.example.javafxsecretmessage;
}