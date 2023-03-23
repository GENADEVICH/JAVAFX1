package com.example.javafxx;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class ShapES extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) throws Exception {
        Text line = new Text(0, 50, "hello world");
        line.setFill(Color.GREEN);
        line.setFont(Font.font(50));

        Group root = new Group();
        Scene scene = new Scene(root, 400, 300);
        root.getChildren().add(line);

        primaryStage.setScene(scene);
        primaryStage.show();
    }
}