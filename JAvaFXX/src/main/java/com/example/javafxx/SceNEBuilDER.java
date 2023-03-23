package com.example.javafxx;

import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import static javafx.application.Application.launch;

public class SceNEBuilDER {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        Group group = new Group();

        Parent content = FXMLLoader.load(getClass().getResource("myForm.fxml"));
        BorderPane root = new BorderPane();
        root.setCenter(content);
        group.getChildren().add (root);

        primaryStage.setScene(new Scene(group, 400,  300));
        primaryStage.show() ;

    }
}
