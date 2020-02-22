/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lecture9;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

/**
 *
 * @author Ahmed Al-Brashdi
 */
public class PanesDemo extends Application{
    
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Label centerLabel = new Label("Center");
        centerLabel.setFont(Font.font("Sans Serif", FontWeight.BOLD, 50));
        
        Label topLabel = new Label("Top");
        topLabel.setFont(Font.font(20));
        
        Label bottomLabel = new Label("Bottom");
        bottomLabel.setFont(Font.font(20));
        
        Label leftLabel = new Label("Left");
        leftLabel.setFont(Font.font(20));
        leftLabel.setRotate(90);
        
        Label rightLabel = new Label("Right");
        rightLabel.setFont(Font.font(20));
        rightLabel.setRotate(90);
        
        BorderPane pane = new BorderPane(centerLabel, topLabel, rightLabel, bottomLabel, leftLabel);
        pane.setAlignment(topLabel, Pos.CENTER);
        pane.setAlignment(bottomLabel, Pos.CENTER);
        pane.setAlignment(leftLabel, Pos.CENTER);
        pane.setAlignment(rightLabel, Pos.CENTER);
        pane.setAlignment(centerLabel, Pos.CENTER);
        Scene scene = new Scene(pane);
        
        primaryStage.setScene(scene);
        primaryStage.setTitle("Border Pane Demo");
        primaryStage.show();
    }

}
