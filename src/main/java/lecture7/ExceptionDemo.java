
package lecture7;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author ss0368
 */
public class ExceptionDemo {
    public static void main (String[] args){
        try{
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        System.out.println("You entered: "+scan.nextInt());
        }catch (InputMismatchException ex){
            System.out.println("You should enter an integer");
        }
    }
    
    
}
