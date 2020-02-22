
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;


/**
 *
 * @author ss0368
 */
public class Lab12_1 extends Application{

    @Override
    public void start(Stage primaryStage) throws Exception {
        MenuItem addItem = new MenuItem("Add");
        MenuItem subItem = new MenuItem("Subtract");
        MenuItem divItem = new MenuItem("Divide");
        MenuItem multiItem = new MenuItem("Multiply");
        
        Menu operationMenu = new Menu("Operatrions");
        operationMenu.getItems().addAll(addItem,subItem,divItem,multiItem);
        
        MenuBar menuBar = new MenuBar(operationMenu);
        
        
        Label firstLabel = new Label("First Number:");
        TextField firstTextField = new TextField();
        Label secondLabel = new Label("Second Number:");
        TextField secondTextField = new TextField();
        Label resultLabel = new Label("Result:");
        TextField resultTextField = new TextField();
        resultTextField.setEditable(false);
        
        Button addBtn = new Button("Add");
        
        
        addBtn.setOnAction(e->{ 
            Double firstNumber = Double.parseDouble(firstTextField.getText());
        Double secondNumber = Double.parseDouble(secondTextField.getText());
            resultTextField.setText(""+add(firstNumber, secondNumber));
       
        
        });
        
        Button subBtn = new Button("Subtract");
        subBtn.setOnAction(e->{ 
            Double firstNumber = Double.parseDouble(firstTextField.getText());
        Double secondNumber = Double.parseDouble(secondTextField.getText());
            resultTextField.setText(""+sub(firstNumber, secondNumber));
       
        
        });
        Button divBtn = new Button("Divide");
        divBtn.setOnAction(e->{ 
            Double firstNumber = Double.parseDouble(firstTextField.getText());
        Double secondNumber = Double.parseDouble(secondTextField.getText());
            resultTextField.setText(""+divide(firstNumber, secondNumber));
       
        
        });
        Button mulBtn = new Button("Multiply");
        mulBtn.setOnAction(e->{ 
            Double firstNumber = Double.parseDouble(firstTextField.getText());
        Double secondNumber = Double.parseDouble(secondTextField.getText());
            resultTextField.setText(""+multiply(firstNumber, secondNumber));
       
        
        });
        
        GridPane root = new GridPane();
        // adding menu bar to the grid that spans for 4 columns and one row.
        root.add(menuBar, 0, 0, 4, 1);
        
        // adding labels and text fields to the grid
        // first number is column and second is the row
        root.add(firstLabel, 0, 1,2,1);
        root.add(firstTextField, 2, 1,2,1);
        root.add(secondLabel, 0, 2,2,1);
        root.add(secondTextField, 2, 2,2,1);
        root.add(resultLabel, 0, 3,2,1);
        root.add(resultTextField, 2, 3,2,1);
        
        // adding the buttons
        root.add(addBtn, 0, 4);
        root.add(subBtn, 1, 4);
        root.add(divBtn, 2, 4);
        root.add(mulBtn, 3, 4);
        
        Scene scene = new Scene(root,210,130);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Calculator");
        primaryStage.setResizable(false);
        primaryStage.show();
        
    }
    
    public static void main(String[] args) {
        launch(args);
    }
    public double add(double f, double s){
        return f+s;
    }
    public double sub(double f, double s){
        return f-s;
    }
    public double divide(double f, double s){
        return f/s;
    }
    public double multiply(double f, double s){
        return f*s;
    }
}
