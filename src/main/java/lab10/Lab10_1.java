/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab10;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.transform.Rotate;
import javafx.scene.transform.Transform;
import javafx.stage.Stage;
import javax.sound.midi.Receiver;

/**
 *
 * @author a_alb
 */
public class Lab10_1 extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        Button rotateBtn = new Button();
        Rectangle rectangle = new Rectangle(30, 50, Color.WHITE);
        rectangle.setStroke(Color.BLACK);
        rotateBtn.setText("Rotate");
        rotateBtn.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                rectangle.rotateProperty().setValue(rectangle.rotateProperty().getValue()+20);
                //rectangle.getTransforms().add(new Rotate(20));
            }
        });
        
        BorderPane root = new BorderPane();
        root.setCenter(rectangle);
        root.setBottom(rotateBtn);
        BorderPane.setAlignment(rotateBtn, Pos.CENTER);
        Scene scene = new Scene(root, 300, 250);
        
        primaryStage.setTitle("Rotate a Rectangle");
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
