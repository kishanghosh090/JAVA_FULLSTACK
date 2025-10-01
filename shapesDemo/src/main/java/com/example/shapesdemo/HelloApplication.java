package com.example.shapesdemo;

import javafx.application.Application;
//import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
//        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
//        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
//        Pane root = new Pane();
//        Rectangle re = new Rectangle();
//        re.setX(50);
//        re.setY(50);
//        re.setWidth(100);
//        re.setHeight(60);
//        re.setFill(Color.BLUE);
//        root.getChildren().add(re);
//
//        Rectangle re1 = new Rectangle();
//        re1.setX(5);
//        re1.setY(5);
//        re1.setWidth(100);
//        re1.setHeight(60);
//        re1.setFill(Color.RED);
//        root.getChildren().add(re1);

        Button b1 = new Button("Button 1");
        Button b2 = new Button("Button 2");
        Button b3 = new Button("Button 3");

        HBox hbox = new HBox(10);
        hbox.getChildren().addAll(b1,b2,b3);

        VBox vbox = new VBox(10);
        vbox.getChildren().addAll(b1,b2,b3);

        FlowPane flowPane = new FlowPane();
        flowPane.getChildren().addAll(b1,b2,b3);


        Scene scene = new Scene(flowPane,400,300);



        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }
}
