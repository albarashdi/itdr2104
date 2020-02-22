package lecture13;

import javafx.animation.PathTransition;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Line;
import javafx.stage.Stage;
import javafx.util.Duration;

public class PathTransitionDemo extends Application {
  @Override // Override the start method in the Application class
  public void start(Stage primaryStage) {
    // Create a pane 
    Pane pane = new Pane();
    
    // Create a rectangle
    Rectangle rectangle = new Rectangle (0, 0, 25, 50);
    rectangle.setFill(Color.ORANGE);
    
    // Create a line
    Line line = new Line(0, 100, 250, 100);
    
    // Add circle and rectangle to the pane
    pane.getChildren().add(rectangle);
    pane.getChildren().add(line);
    
    // Create a path transition 
    PathTransition pt = new PathTransition();
    // Set the duration
    pt.setDuration(Duration.millis(4000));
    // Set the path 
    pt.setPath(line);
    // Set the node of transition
    pt.setNode(rectangle);
    // Set orientation
    pt.setOrientation(
      PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);
    // Set cycle count (timeline)
    pt.setCycleCount(Timeline.INDEFINITE);
    // Set the autoreverse
    pt.setAutoReverse(true);
    // Start animation (play)
    pt.play(); 
    
    // Set action for pausing and playing
    line.setOnMousePressed(e -> pt.pause());
    line.setOnMouseReleased(e -> pt.play());
    
    // Create a scene and place it in the stage
    Scene scene = new Scene(pane, 250, 200);
    primaryStage.setTitle("PathTransitionDemo"); // Set the stage title
    primaryStage.setScene(scene); // Place the scene in the stage
    primaryStage.show(); // Display the stage
  }
  
  public static void main(String[] args) {
    launch(args);
  }
}