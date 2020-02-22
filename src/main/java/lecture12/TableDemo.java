/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lecture12;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author Ahmed Al-Brashdi
 */
public class TableDemo extends Application{

    @Override
    public void start(Stage primaryStage) throws Exception {
        // creating a table view
        TableView courseTable = new TableView();
        
        // creating table column
        TableColumn<String, Course> courseCode = new TableColumn<String, Course>("Course Code");
        TableColumn<String, Course> courseTitle = new TableColumn<String, Course>("Course Title");
        
        // adding columns to the tab;e
        courseTable.getColumns().add(courseCode);
        courseTable.getColumns().add(courseTitle);
        
        // setting the value for the columns (from where is the data)
        courseCode.setCellValueFactory(new PropertyValueFactory<>("code"));
        courseTitle.setCellValueFactory(new PropertyValueFactory<>("title"));
        
        // adding value to the table
        courseTable.getItems().add(new Course("ITDR1101","Introduction to IT"));
        courseTable.getItems().add(new Course("ITDR2104","Programming"));
        courseTable.getItems().add(new Course("ITSW3104","Concurrent Programming"));
        
        // adding button to add new record
        Button addBtn = new Button("Add");
        addBtn.setOnAction(e->{
            
            courseTable.getItems().add(new Course("ITDR1104", "Programming fundementals"));
                });
        VBox pane = new VBox(courseTable,addBtn);
        
        Scene scene = new Scene(pane);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Course table");
        primaryStage.show();
        
    }
    public static void main(String[] args) {
        launch(args);
    }

    

}
