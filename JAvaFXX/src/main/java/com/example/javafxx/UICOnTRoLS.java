package com.example.javafxx;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class UICOnTRoLS extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Button button = new Button();

        Group root = new Group();
        root.getChildren().addAll(button);
        primaryStage.setScene(new Scene(root, 400, 300));
        primaryStage.show();
    }
}
