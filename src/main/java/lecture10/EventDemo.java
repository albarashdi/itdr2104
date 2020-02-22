/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lecture10;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

/**
 *
 * @author Ahmed Al-Brashdi
 */
public class EventDemo extends Application{
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Button helloBtn = new Button("Say hello!");
        helloBtn.setOnAction(e->System.out.println("Hello from Lambda"));
        Pane pane = new Pane(helloBtn);
        Scene scene = new Scene(pane);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Hello Event Handling");
        primaryStage.show();
    }
    class ButtonHandeller implements EventHandler<ActionEvent>{

        @Override
        public void handle(ActionEvent event) {
            System.out.println("Hello there!");
        }
        
    }

}
