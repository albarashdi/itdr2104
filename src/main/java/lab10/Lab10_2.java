/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab10;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.StackPane;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

/**
 *
 * @author a_alb
 */
public class Lab10_2 extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        Rectangle rectangle = new Rectangle(50, 80);
        rectangle.setOnMouseDragged(new EventHandler<MouseEvent>(){
            @Override
            public void handle(MouseEvent event) {
                rectangle.setTranslateX(rectangle.getTranslateX()+event.getX());
                rectangle.setTranslateY(rectangle.getTranslateY()+event.getY());
            }
            
        });
        StackPane root = new StackPane();
        root.getChildren().add(rectangle);
        
        Scene scene = new Scene(root, 300, 250);
        
        primaryStage.setTitle("Move a Rectangle");
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
