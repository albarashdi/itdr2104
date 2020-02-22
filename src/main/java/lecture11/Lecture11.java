
package lecture11;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author Ahmed Al-Brashdi
 */
public class Lecture11 extends Application{

    @Override
    public void start(Stage primaryStage) throws Exception {
        // all panes needed
        BorderPane rootPane = new BorderPane();
        HBox topPane = new HBox();
        VBox leftPane = new VBox();
        VBox rightPane = new VBox();
        
        // top controls
        Label msgLabel = new Label("Enter your message");
        TextField msgField = new TextField();
        topPane.getChildren().addAll(msgLabel,msgField);
        
        // center control
        Text msg = new Text();
       
        
        // left controls
        RadioButton redRB = new RadioButton("Red");
        RadioButton blueRB = new RadioButton("Blue");
        RadioButton greenRB = new RadioButton("Green");
        
        ToggleGroup tg = new ToggleGroup();
        redRB.setToggleGroup(tg);
        blueRB.setToggleGroup(tg);
        greenRB.setToggleGroup(tg);
        
        leftPane.getChildren().addAll(redRB,blueRB,greenRB);
        
        // right controls
        CheckBox boldCB = new CheckBox("Bold");
        CheckBox italicCB = new CheckBox("Italic");
        
        rightPane.getChildren().addAll(boldCB,italicCB);
        // buttom controls
        Button submitBtn = new Button("Submit");
        
        // setting actions
        msgField.setOnAction(e->msg.setText(msgField.getText()));
        redRB.setOnAction(e->{
            if(redRB.isSelected()){
                msg.setFill(Color.RED);
            }
        });
        
        // adding different nodes to the root pane
        rootPane.setTop(topPane);
        rootPane.setCenter(msg);
        rootPane.setLeft(leftPane);
        rootPane.setRight(rightPane);
        rootPane.setBottom(submitBtn);
        BorderPane.setAlignment(topPane, Pos.CENTER);
        BorderPane.setAlignment(leftPane, Pos.CENTER);
        BorderPane.setAlignment(rightPane, Pos.CENTER);
        BorderPane.setAlignment(msg, Pos.CENTER);
        BorderPane.setAlignment(submitBtn, Pos.CENTER);
        Scene scene = new Scene(rootPane,400,200);
        primaryStage.setScene(scene);
        primaryStage.setTitle("GUI Controls");
        primaryStage.show();
    }
    
    public static void main(String[] args) {
        launch(args);
    }

}
