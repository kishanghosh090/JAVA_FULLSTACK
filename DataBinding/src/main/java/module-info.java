module com.example.databinding {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.databinding to javafx.fxml;
    exports com.example.databinding;
}