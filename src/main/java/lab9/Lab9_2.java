/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab9;

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/**
 *
 * @author ss0368
 */
public class Lab9_2 extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        // creating images and adding them to image views
        Image omanFlag = new Image("file:oman.png");
        ImageView omanView = new ImageView(omanFlag);

        Image ksaFlag = new Image("file:ksa.png");
        ImageView ksaView = new ImageView(ksaFlag);

        Image yemenFlag = new Image("file:yemen.png");
        ImageView yemenView = new ImageView(yemenFlag);

        Image uaeFlag = new Image("file:uae.png");
        ImageView uaeView = new ImageView(uaeFlag);
        
        // creating the labels
        Label omanLabel = new Label("Sultanate of Oman");
        Label ksaLabel = new Label("Kingdom of Saudi Arabia");
        Label yemenLabel = new Label("Republic of Yemen");
        Label uaeLabel = new Label("United Arab Emirates");
        
        
        // creating the grid pane
        GridPane root = new GridPane();
        
        // adding elements to the grid pane with indes column,row
        root.add(omanView, 0, 0);
        root.add(omanLabel, 0, 1);
        root.add(ksaView, 1, 0);
        root.add(ksaLabel, 1, 1);
        root.add(yemenView, 2, 0);
        root.add(yemenLabel, 2, 1);
        root.add(uaeView, 3, 0);
        root.add(uaeLabel, 3, 1);
        
        // setting the horizental gap between elements
        root.setHgap(2);
        
        // setting the vertical gap between elements
        root.setVgap(2);
        
        // setting the alignment of the labels to center of their cells
        GridPane.setHalignment(omanLabel, HPos.CENTER);
        GridPane.setHalignment(ksaLabel, HPos.CENTER);
        GridPane.setHalignment(yemenLabel, HPos.CENTER);
        GridPane.setHalignment(uaeLabel, HPos.CENTER);
        
        // creating the scene and adding the grid pane to it
        Scene scene = new Scene(root);
        
        // adding the scene to the stage
        primaryStage.setScene(scene);
        
        // setting the title of the stage
        primaryStage.setTitle("Flags");
        
        // displaying the stage
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}
