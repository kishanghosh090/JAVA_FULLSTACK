package com.example.javadxdemo;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {

        Label hello = new Label("hello from kishan");

        StackPane root = new StackPane();
        root.getChildren().add(hello);
        

        Scene scene = new Scene(root,300,300);

        stage.setTitle("hello from chai");
        stage.setScene(scene);
        stage.show();
    }
}


//        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
//        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
//        stage.setTitle("Hello!");
//        stage.setScene(scene);
//        stage.show();