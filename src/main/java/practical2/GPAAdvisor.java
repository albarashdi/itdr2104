/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package practical2;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/**
 *
 * @author Ahmed Al-Brashdi
 */
public class GPAAdvisor extends Application{

    @Override
    public void start(Stage primaryStage) throws Exception {
        Label nameLabel = new Label("Your name:");
        TextField nameTF = new TextField();
        
        Label gpaLabel = new Label("Your GPA");
        PasswordField gpaTF = new PasswordField();
        
        Button submitBtn = new Button("Submit");
        
        GridPane root = new GridPane();
        root.add(nameLabel, 0, 0);
        root.add(nameTF, 1, 0);
        root.add(gpaLabel, 0, 1);
        root.add(gpaTF, 1, 1);
        root.add(submitBtn, 1, 2);
        root.setHgap(5);
        root.setVgap(5);
        root.setAlignment(Pos.CENTER);
        
        submitBtn.setOnAction(e->{
        if(nameTF.getText().isEmpty()||gpaTF.getText().isEmpty()){
            Alert errorAlert = new Alert(Alert.AlertType.ERROR);
                errorAlert.setContentText("You must provide the information");
                errorAlert.setHeaderText("Information needed!");
                errorAlert.setTitle("Error");
                errorAlert.showAndWait();
        }else{
            Double gpa = Double.parseDouble(gpaTF.getText());
            if(gpa <2.0){
                Alert dangerAlert = new Alert(Alert.AlertType.ERROR);
                dangerAlert.setContentText("You need to work much harder "+nameTF.getText()+", you can do it");
                dangerAlert.setHeaderText(null);
                dangerAlert.setTitle("Danger Zoon");
                dangerAlert.showAndWait();
            }else if(gpa >2.0 && gpa <2.5){
                Alert warningAlert = new Alert(Alert.AlertType.WARNING);
                    warningAlert.setContentText("Try to reach at least 3 "+nameTF.getText()+", you can do it");
                    warningAlert.setHeaderText(null);
                    warningAlert.setTitle("Motivation alert");
                    warningAlert.showAndWait();
            }else{
                Alert informationAlert = new Alert(Alert.AlertType.INFORMATION);
                    informationAlert.setContentText("Keep up the good work "+nameTF.getText());
                    informationAlert.setHeaderText(null);
                    informationAlert.setTitle("Success alert");
                    informationAlert.showAndWait();
            }
        }
        
        });
        
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.setTitle("GPA Advisor");
        primaryStage.show();
        
    }
    public static void main(String[] args) {
        launch(args);
    }

}
