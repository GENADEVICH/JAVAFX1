package com.example.javafxx;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class mEdia extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Media media = new Media("file:///home/max/101Swing6WindowLisener.mp4");
        MediaPlayer mediaPlayer = new MediaPlayer(media);
        mediaPlayer.play();
        MediaView mediaView = new MediaView(mediaPlayer);

        Group group = new Group();
        group.getChildren().add(mediaView);

        primaryStage.setScene(new Scene(group, 400, 300));
        primaryStage.show();
    }
}
