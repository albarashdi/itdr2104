/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lecture13;

import javafx.animation.ScaleTransition;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.util.Duration;

/**
 *
 * @author ss0368
 */
public class ScaleDemo extends Application {

    @Override
    public void start(Stage primaryStage) {
        Pane pane = new Pane();
        
        Circle circle = new Circle(50);
        circle.setStroke(Color.RED);
        circle.setStrokeWidth(10);
        pane.getChildren().add(circle);
        ScaleTransition st = new ScaleTransition();
        st.setDuration(Duration.millis(5000));
        st.setNode(circle);
        st.setToX(2);
        st.setToY(1.5);
        st.setCycleCount(2);
        st.setAutoReverse(true);
        st.play();
        
        
        Scene scene = new Scene(pane, 300, 250);
        
        primaryStage.setTitle("Scale Transition Demo");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}
