/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lecture9;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author Ahmed Al-Brashdi
 */
public class BasicJavaFX extends Application{

    @Override
    public void start(Stage primaryStage) throws Exception {
        // Creating label with its properties
        Label helloText = new Label("Hello JavaFX");
        helloText.setFont(Font.font("Times New Roman", 
      FontWeight.BOLD, FontPosture.ITALIC, 20));
        
        // Creating circle with its properties
        Circle circle = new Circle(50);
        //circle.setCenterX(100);
        //circle.setCenterY(100);
        circle.setStroke(Color.BLACK);
        circle.setFill(null);
        
        
        // creating an image
        Image javaImage = new Image("file:java.png",100,100,true,true);
        // creating image view and adding the image to it
        ImageView imageView = new ImageView(javaImage);
        
        // creating text
        Text text = new Text("Java Programming");
        text.setUnderline(true);
        text.setStrikethrough(true);
        
        // creating line
        Line line = new Line(20, 20, 40, 40);
        
        // creating rectangle 
        Rectangle rectangle = new Rectangle(20, 50);
        
        // creating a pane and adding controls/nodes/elements
        Pane pane = new FlowPane();
        pane.getChildren().add(helloText);
        pane.getChildren().add(circle);
        pane.getChildren().add(imageView);
        pane.getChildren().add(line);
        pane.getChildren().add(rectangle);
        //pane.setRotate(50);
        
        // creating the scene and adding the pane to it
        Scene scene = new Scene(pane, 200, 200);
        
        // adding the scene to the stage
        primaryStage.setScene(scene);
        primaryStage.setTitle("Hello JavaFX");
        primaryStage.show();
    }
public static void main(String[] args) {
    launch(args);
  }
}
