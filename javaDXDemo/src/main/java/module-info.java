module com.example.javadxdemo {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.javadxdemo to javafx.fxml;
    exports com.example.javadxdemo;
}