/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package furtherJavaFX;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.scene.web.HTMLEditor;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

/**
 *
 * @author Ahmed Al-Brashdi
 */
public class HtmlEditorDemo extends Application{
    @Override
    public void start(Stage stage){
        HTMLEditor htmlEditor = new HTMLEditor();
        Button saveBtn = new Button("Save html page");
        saveBtn.setOnAction(e->{
            
            FileChooser fileChooser = new FileChooser();
            fileChooser.getExtensionFilters().add(new FileChooser.ExtensionFilter("HTML Files", "*.html"));
            File savedFile = fileChooser.showSaveDialog(stage);
            try (PrintWriter pw = new PrintWriter(savedFile);){
                pw.println(htmlEditor.getHtmlText());
                
            } catch (FileNotFoundException ex) {
                System.out.println("File not found");
            }
            
           
        });
        VBox vBox = new VBox(htmlEditor,saveBtn);
        Scene scene = new Scene(vBox);
        stage.setScene(scene);
        stage.setTitle("JavaFX App");

        stage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}
