/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lecture13;

import javafx.animation.FillTransition;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Ellipse;
import javafx.stage.Stage;
import javafx.util.Duration;

/**
 *
 * @author Ahmed Al-Brashdi
 */
public class FillTransitionOnEllipse extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        
        StackPane root = new StackPane();
        
        Ellipse ellipse = new Ellipse(50, 70);
        
        root.getChildren().add(ellipse);
        
        FillTransition fill = new FillTransition(Duration.millis(5000), ellipse);
        fill.setFromValue(Color.BLACK);
        fill.setToValue(Color.RED);
        fill.setCycleCount(Timeline.INDEFINITE);
        fill.setAutoReverse(true);
        fill.play();
        
        
        
        Scene scene = new Scene(root, 300, 250);
        
        primaryStage.setTitle("Fill Transition Demo");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
