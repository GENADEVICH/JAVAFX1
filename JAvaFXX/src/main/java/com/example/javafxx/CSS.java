package com.example.javafxx;

import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import static javafx.application.Application.launch;

public class CSS {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        //Application.setUserAgentStylesheet(getClass().getResource("mycss.css").toExternalForm())

        Button button = new Button("test");
        button.setId("my-putton");
        button.setStyle("");

        //button.getStyleClass().add("mystyle");

        Group root = new Group();
        Scene scene = new Scene(root, 400, 300);
        scene.getStylesheets().add(getClass().getResource("mycss.css").toExternalForm());
        root.getChildren().add(button);

        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
