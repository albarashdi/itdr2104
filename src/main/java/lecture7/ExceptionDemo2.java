
package lecture7;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author ss0368
 */
public class ExceptionDemo2 {
    public static void main (String[] args) throws FileNotFoundException {
        Scanner scan = new Scanner(new File("text.txt"));
        System.out.println("Enter an integer: ");
        System.out.println(scan.nextInt());
    }
    
    
}
