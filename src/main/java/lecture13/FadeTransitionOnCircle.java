/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lecture13;

import javafx.animation.FadeTransition;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.util.Duration;

/**
 *
 * @author Ahmed Al-Brashdi
 */
public class FadeTransitionOnCircle extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        // Create a pane
        StackPane root = new StackPane();
        // Create a circle
        Circle circle = new Circle(50, Color.CORAL);
        // Add circle to the pane
        root.getChildren().add(circle);
        // Create a fade transition
        FadeTransition fade = new FadeTransition();
        // Set the node to fade
        fade.setNode(circle);
        // Set the duration
        fade.setDuration(Duration.millis(6000));
        // set autoreverse value
        fade.setAutoReverse(true);
        // set cycle count (timeline)
        fade.setCycleCount(Timeline.INDEFINITE);
        // set from value
        fade.setFromValue(1.0);
        // set to value
        fade.setToValue(0.1);
        // set by value
        fade.setByValue(0.7);
        // Play the animiation
        fade.play();
        
        
        
        
        Scene scene = new Scene(root, 300, 250);
        
        primaryStage.setTitle("Fading a Circle");
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
