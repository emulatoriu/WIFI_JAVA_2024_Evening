module com.example.javafx_check_input {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.example.javafx_check_input to javafx.fxml;
    exports com.example.javafx_check_input;
}