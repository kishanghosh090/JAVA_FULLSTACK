package com.example.fxmldemo;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
    @FXML
    protected  void onHelloButtonEntered(){
//        System.out.println("button entered");
        Alert alart = new Alert(Alert.AlertType.INFORMATION);
        alart.setTitle("Button entered");
        alart.setHeaderText("header text");
        alart.setContentText("Your entered the button with the mouse");
        alart.showAndWait();

    }
}
