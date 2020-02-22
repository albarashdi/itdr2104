/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lecture13;

import javafx.animation.PathTransition;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.util.Duration;

/**
 *
 * @author Ahmed Al-Brashdi
 */
public class TransitOnLinePath extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        // Create a pane
        Pane root = new Pane();
        
        // Create a rectangle
        Rectangle rectangle = new Rectangle(20, 30);
        rectangle.setFill(Color.BROWN);
        // Create a line
        Line line = new Line(0, 100, 250, 100);
        
        // Add the rectangle and the line to the pane
        root.getChildren().addAll(rectangle,line);
        
        // Create a path transition object
        PathTransition path = new PathTransition();
        
        // Set the duration of the transition
        path.setDuration(Duration.millis(5000));
        
        // Set the node to transit
        path.setNode(rectangle);
        
        // Set the path of the transition (which path will the node follow)
        path.setPath(line);
        
        // Set the cycle count
        path.setCycleCount(Timeline.INDEFINITE);
        
        // Set the AutoReverse
        path.setAutoReverse(true);
        
        // Play the animation
        path.play();
        
        
        Scene scene = new Scene(root, 250, 200);
        
        primaryStage.setTitle("Path Transition Demo");
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
