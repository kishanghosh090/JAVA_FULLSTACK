module com.example.shapesdemo {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.shapesdemo to javafx.fxml;
    exports com.example.shapesdemo;
}