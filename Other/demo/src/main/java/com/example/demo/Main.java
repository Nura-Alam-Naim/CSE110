package com.example.demo;
import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.css.CssParser;
import javafx.animation.Animation;
import javafx.beans.binding.Binding;
import javafx.event.Event;
import javafx.scene.control.Button;
import javafx.print.Collation;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.util.*;

public class Main extends Application {
    Button button;
    StackPane stackPane;
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("I am naim");
        button =new Button("Nai");

        StackPane layout= new StackPane();
        layout.getChildren().add(button);
        Scene scene=new Scene(layout,300,300);
        stage.setScene(scene);
        stage.show();
    }
}
