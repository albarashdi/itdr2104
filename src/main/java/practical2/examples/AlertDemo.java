/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practical2.examples;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/**
 *
 * @author Ahmed Al-Brashdi
 */
public class AlertDemo extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {

        GridPane grid = new GridPane();
        Label gpaLabel = new Label("Your CGPA:");
        Label totalCreditLabel = new Label("Total credit to register:");

        TextField gpaTF = new TextField();
        TextField totalCreditTF = new TextField();

        Button submitBtn = new Button("Submit");

        grid.add(gpaLabel, 0, 0);
        grid.add(totalCreditLabel, 0, 1);
        grid.add(gpaTF, 1, 0);
        grid.add(totalCreditTF, 1, 1);
        grid.add(submitBtn, 1, 2);

        grid.setHgap(5);
        grid.setVgap(5);

        submitBtn.setOnAction(e -> {

            if (gpaTF.getText().isEmpty() || totalCreditTF.getText().isEmpty()) {
                Alert errorAlert = new Alert(Alert.AlertType.ERROR);
                errorAlert.setContentText("You must provide the information");
                errorAlert.setHeaderText("Information needed!");
                errorAlert.setTitle("Error");
                errorAlert.showAndWait();
            } else {
                Double gpa = Double.parseDouble(gpaTF.getText());
                Integer credits = Integer.parseInt(totalCreditTF.getText());
                if (gpa > 2.0 && credits < 12 ) {
                    Alert informationAlert = new Alert(Alert.AlertType.ERROR);
                    informationAlert.setContentText("You can't register less than 12 hours!");
                    informationAlert.setHeaderText("Error!");
                    informationAlert.setTitle("Error");
                    informationAlert.showAndWait();
                } else if ((gpa > 2.0 && gpa < 3 && credits > 18)||(gpa < 2.0 && credits > 11 && credits < 14)) {
                    Alert warningAlert = new Alert(Alert.AlertType.WARNING);
                    warningAlert.setContentText("You need approval to register more than 18 hours!");
                    warningAlert.setHeaderText("Approval needed!");
                    warningAlert.setTitle("Approval alert");
                    warningAlert.showAndWait();
                } else {
                    Alert informationAlert = new Alert(Alert.AlertType.INFORMATION);
                    informationAlert.setContentText("You are fine to register!");
                    informationAlert.setHeaderText("Success!");
                    informationAlert.setTitle("Acknowledgment alert");
                    informationAlert.showAndWait();
                }
            }

        });

        grid.setAlignment(Pos.CENTER);
        Scene scene = new Scene(grid);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Alert Demo");
        primaryStage.setResizable(false);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}
