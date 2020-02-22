/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lecture13;

import javafx.animation.FadeTransition;
import javafx.animation.FillTransition;
import javafx.animation.Timeline;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.util.Duration;

/**
 *
 * @author ss0368
 */
public class FadeAndFill extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        // Create a pane (which pane layout?)
        GridPane root = new GridPane();
        root.setAlignment(Pos.CENTER);
        // Create a square
        Rectangle square = new Rectangle(70,70);
        // Fill with Red color
        square.setFill(Color.RED);
        // Create the two buttons
        Button fadeBtn = new Button("Fade");
        Button fillBtn = new Button("Fill");
        
        // Add square and buttons to the pane
        root.add(square, 0, 0, 2, 2);
        root.add(fadeBtn,0,2);
        root.add(fillBtn,1,2);
        
        // Create fade transition
        FadeTransition fade = new FadeTransition();
        // Set the node
        fade.setNode(square);
        // 
        fade.setDuration(Duration.seconds(3));
        //
        fade.setCycleCount(1);
        //
        fade.setFromValue(1.0);
        //
        fade.setToValue(0.1);
        //
        fadeBtn.setOnAction((e)->fade.play());
        
        
        FillTransition fill = new FillTransition();
        fill.setShape(square);
        fill.setDuration(Duration.seconds(3));
        fill.setFromValue(Color.RED);
        fill.setToValue(Color.GREEN);
        fill.setCycleCount(1);
        
        
        fillBtn.setOnAction(eh->fill.play());
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
