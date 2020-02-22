/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lecture12;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextArea;
import javafx.scene.layout.VBox;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

/**
 *
 * @author Ahmed Al-Brashdi
 */
public class MenuDemo extends Application{

    @Override
    public void start(Stage primaryStage) throws Exception {
        
        MenuItem openMenuItem = new MenuItem("open");
        Menu fileMenu = new Menu("File");
        fileMenu.getItems().add(openMenuItem);
        MenuBar menuBar = new MenuBar(fileMenu);
        
        TextArea textArea = new TextArea();
        
        openMenuItem.setOnAction(e->{
            FileChooser fileChooser = new FileChooser();
            fileChooser.setTitle("Choose a file to open");
            File selectedFile = fileChooser.showOpenDialog(primaryStage);
            Scanner scan=null;
            try {
                scan = new Scanner(selectedFile);
            } catch (FileNotFoundException ex) {
                Logger.getLogger(MenuDemo.class.getName()).log(Level.SEVERE, null, ex);
            }
            while(scan.hasNext()){
                textArea.appendText(scan.nextLine());
            }
            
        });
        textArea.setWrapText(true);
        VBox root = new VBox(menuBar,textArea);
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Menu Demo");
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }

}
