package com.example.javafxx;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.*;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.FileInputStream;

public class WorKINPAINT extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Image image = new Image(new FileInputStream("src/giena.jpg"));
        ImageView imageView = new ImageView(image);
        imageView.setFitHeight(220);
        imageView.setFitWidth(220);

        PixelReader pixelReader = image.getPixelReader();
        for (int i = 0; i < image.getWidth(); i++) {
            for (int j = 0; j < image.getHeight(); j++) {
                Color color = pixelReader.getColor(i, j);
            }

        }

        WritableImage wImage = new WritableImage((int) image.getWidth(), (int) image.getHeight());
        PixelWriter pixelWriter = wImage.getPixelWriter();
        for (int i = 0; i < image.getHeight(); i++) {
            for (int j = 0; j < image.getWidth(); j++) {
                pixelWriter.setColor(j, i, Color.ALICEBLUE);
            }


            Group root = new Group();
            root.getChildren().add(new ImageView(wImage));
            primaryStage.setScene(new Scene(root, 400, 300));
            primaryStage.show();
        }
    }
}