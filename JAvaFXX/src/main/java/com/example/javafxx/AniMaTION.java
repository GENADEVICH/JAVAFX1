package com.example.javafxx;

import javafx.animation.*;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.CubicCurveTo;
import javafx.scene.shape.MoveTo;
import javafx.scene.shape.Path;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.FileInputStream;

public class AniMaTION extends Application {
        public static void main(String[] args) {
            launch(args);
        }

        @Override
        public void start(Stage primaryStage) throws Exception {
//            Rectangle rectangle = new Rectangle(0, 0, 50, 50);
//            KeyValue xValue = new KeyValue(rectangle.xProperty(),100);
//            KeyValue yValue = new KeyValue(rectangle.yProperty(),100);
//            KeyFrame keyFrame = new KeyFrame(Duration.millis(1000), xValue, yValue);
//
//            Timeline timeline = new Timeline();
//            timeline.setCycleCount(Timeline.INDEFINITE);
//            timeline.setAutoReverse(true);
//            timeline.getKeyFrames().addAll(keyFrame);
//            timeline.play();

//            Image image = new Image(new FileInputStream("src/giena.jpg"));
//            ImageView imageView = new ImageView(image);
//            imageView.setFitHeight (300);
//            imageView.setFitWidth (460);
//
//            FadeTransition fadeOut = new FadeTransition(Duration.millis(1000), imageView);
//            fadeOut.setFromValue (1.0);
//            fadeOut.setToValue(6.0);
//            fadeOut.setCycleCount (Timeline. INDEFINITE);
//            fadeOut.setAutoReverse (true);
//            fadeOut.play();


            Rectangle rectPath = new Rectangle ( 0,0,40, 0);
            rectPath.setFill(Color.ORANGE) ;

            Path path = new Path();
            path.getElements().add (new MoveTo(20, 20));

            path.getElements().add (new CubicCurveTo( 380, 0, 380, 120,  200,  120));
            path.getElements().add (new CubicCurveTo( 0,  120, 0, 240, 380,  240));

            PathTransition pathTransition = new PathTransition();
            pathTransition.setDuration(Duration.millis(4000));

            pathTransition.setPath(path);
            pathTransition.setNode(rectPath);
            pathTransition.setOrientation(PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT) ;
            pathTransition.setCycleCount(Timeline.INDEFINITE);

            pathTransition.setAutoReverse (true);

            pathTransition.play();

            Group root = new Group();
            root.getChildren().addAll();
            primaryStage.setScene(new Scene(root, 400, 300));
            primaryStage.show();
        }
    }
