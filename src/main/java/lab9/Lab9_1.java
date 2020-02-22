/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab9;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author ss0368
 */
public class Lab9_1 extends Application{

    @Override
    public void start(Stage stage) throws Exception {
        Label welcomeText = new Label("Welcome to JavaFX");
        welcomeText.setFont(Font.font(30));
        StackPane pane = new StackPane(welcomeText);
        //pane.getChildren().add(welcomeText);
        
        Scene scene = new Scene(pane,400,200);
        
        stage.setScene(scene);
        stage.setResizable(false);
        stage.setTitle("Welcome to JavaFX");
        stage.show();
    }
    
    public static void main(String[] args) {
        launch(args);
    }
    
}
