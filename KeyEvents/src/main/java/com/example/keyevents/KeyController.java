package com.example.keyevents;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

 class KeyController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void gotclicked() {
        System.out.println("hello");
    }
}
