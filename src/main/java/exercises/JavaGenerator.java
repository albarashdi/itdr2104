package exercises;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

/**
 *
 * @author Ahmed Al-Brashdi
 */
public class JavaGenerator extends Application {
    
    String name1;
    String name2;
    String name3;
    
    @Override
    public void start(Stage primaryStage) {
        
        ComboBox modifiers = new ComboBox();
        modifiers.getItems().add("");
        modifiers.getItems().add("private");
        modifiers.getItems().add("public");
        modifiers.getItems().add("Protected");
        
        ComboBox types = new ComboBox();
        types.getItems().add("int");
        types.getItems().add("String");
        types.getItems().add("double");
        types.getItems().add("Date");
     
        ComboBox modifiers2 = new ComboBox();
        modifiers2.getItems().add("");
        modifiers2.getItems().add("private");
        modifiers2.getItems().add("public");
        modifiers2.getItems().add("Protected");
        
        ComboBox types2 = new ComboBox();
        types2.getItems().add("int");
        types2.getItems().add("String");
        types2.getItems().add("double");
        types2.getItems().add("Date");
        
        
        ComboBox modifiers3 = new ComboBox();
        modifiers3.getItems().add("");
        modifiers3.getItems().add("private");
        modifiers3.getItems().add("public");
        modifiers3.getItems().add("Protected");
        
        ComboBox types3 = new ComboBox();
        types3.getItems().add("int");
        types3.getItems().add("String");
        types3.getItems().add("double");
        types3.getItems().add("Date");
        
        TextField name1TF = new TextField();
        TextField name2TF = new TextField();
        TextField name3TF = new TextField();
        
        CheckBox genSetter = new CheckBox("Generate setters\t");
        CheckBox genGetter = new CheckBox("Generate getters\t");
        Button btn = new Button();
        btn.setText("Generate Code");
        btn.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {

                
                name1 = name1TF.getText();
                name2 = name2TF.getText();
                name3 = name3TF.getText();
               File generatedFile = new File("Test.java");
                try {
                    PrintWriter pw = new PrintWriter(generatedFile);
                    pw.println("public class Test {\n");
                    pw.println("\t"+modifiers.getValue()+" "+types.getValue()+" "+name1+";");
                    pw.println("\t"+modifiers2.getValue()+" "+types2.getValue()+" "+name2+";");
                    pw.println("\t"+modifiers3.getValue()+" "+types3.getValue()+" "+name3+";");
                    if(genSetter.isSelected()){
                        pw.println("\n\tpublic void set"+name1+"("+types.getValue()+" "+name1+"){");
                        pw.println("\t\tthis."+name1+"="+name1+";");
                        pw.println("\t}");
                        
                        
                        pw.println("\n\tpublic void set"+name2+"("+types2.getValue()+" "+name2+"){");
                        pw.println("\t\tthis."+name2+"="+name2+";");
                        pw.println("\t}");
                        
                        pw.println("\n\tpublic void set"+name3+"("+types3.getValue()+" "+name3+"){");
                        pw.println("\t\tthis."+name3+"="+name3+";");
                        pw.println("\t}");
                    }
                    if(genGetter.isSelected()){
                        pw.println("\n\tpublic "+types.getValue()+" get"+name1+"(){");
                        pw.println("\t\treturn "+name1+";");
                        pw.println("\t}");
                        
                        pw.println("\n\tpublic "+types2.getValue()+" get"+name2+"(){");
                        pw.println("\t\treturn "+name2+";");
                        pw.println("\t}");
                        
                        pw.println("\n\tpublic "+types3.getValue()+" get"+name3+"(){");
                        pw.println("\t\treturn "+name3+";");
                        pw.println("\t}");
                    }
                    pw.println("}");
                    pw.close();
                } catch (FileNotFoundException ex) {
                    System.out.println("File not found");
                }
                
                System.exit(0);
            }
        });
        FlowPane flow = new FlowPane();
        HBox root1 = new HBox();
        root1.setAlignment(Pos.CENTER);
        root1.getChildren().add(new Label("\tData type:"));
        root1.getChildren().add(types);
        root1.getChildren().add(new Label("\tVariable name:"));
        root1.getChildren().add(name1TF);
        root1.getChildren().add(new Label("\tModifier:"));
        root1.getChildren().add(modifiers);

        HBox root2 = new HBox();
        root2.getChildren().add(new Label("\tData type:"));
        root2.getChildren().add(types2);
        root2.getChildren().add(new Label("\tVariable name:"));
        root2.getChildren().add(name2TF);
        root2.getChildren().add(new Label("\tModifier:"));
        root2.getChildren().add(modifiers2);

        HBox root3 = new HBox();
        root3.getChildren().add(new Label("\tData type:"));        
        root3.getChildren().add(types3);
        root3.getChildren().add(new Label("\tVariable name:"));
        root3.getChildren().add(name3TF);
        root3.getChildren().add(new Label("\tModifier:"));
        root3.getChildren().add(modifiers3);

        Label title = new Label("Your Java Code Generator");
        title.setFont(Font.font(20));
        flow.getChildren().add(title);
        flow.getChildren().add(root1);
        flow.getChildren().add(root2);
        flow.getChildren().add(root3);
        flow.getChildren().add(genSetter);
        flow.getChildren().add(genGetter);
        flow.getChildren().add(btn);
        flow.alignmentProperty().setValue(Pos.CENTER);
        Scene scene = new Scene(flow);
        
        primaryStage.setHeight(300);
        primaryStage.setWidth(700);
        primaryStage.setResizable(false);
        
        primaryStage.getIcons().add(new Image("file:java.png"));

        primaryStage.setTitle("Java generator");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

