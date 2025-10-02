package com.example.keyevents;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.input.KeyEvent;

public class KeyController {
    @FXML
    private Label welcomeText;

    @FXML
    public void handleKeyPressed(KeyEvent event){
        switch (event.getCode()){
            case UP:
                System.out.println("up button clicked");
                break;
            case ENTER:
                System.out.println("Enter preesed");

        }
    }
    @FXML
    protected void gotclicked() {
        System.out.println("hello");
    }
}
