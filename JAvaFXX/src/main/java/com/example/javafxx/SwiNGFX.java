package com.example.javafxx;


import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.paint.Color;


public class SwiNGFX {
    public static void main(String[] args) {
    JFrame jFrame = new JFrame("Swing and JavaFX");
    JFXPanel jfxPanel = new JFXPanel();
    frame.add(jfxPanel);
    frame.setSize(300,200);
    frame.setVisible(true);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    Group group = new Group();
    Scene scene = new Scene(group, Color.ALICEBLUE);
    group.getChildren().addAll(new Button("press"));
    jfxPanel.setScene(scene);

    }
}
