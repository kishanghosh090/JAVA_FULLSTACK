package com.example.keyevents;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        VBox root = fxmlLoader.load();

        Scene scene = new Scene(root);

        scene.setOnKeyPressed(keyEvent->{
            KeyController controller = fxmlLoader.getController();
            controller.handleKeyPressed(keyEvent);
        });
        root.requestFocus();


        stage.setTitle("Hello!");

        stage.setScene(scene);
        stage.show();
    }

}
