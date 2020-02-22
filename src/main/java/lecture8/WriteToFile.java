/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lecture8;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

/**
 *
 * @author Ahmed Al-Brashdi
 */
public class WriteToFile {

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("text.txt");// relative path
        PrintWriter pw = new PrintWriter(file);
        pw.println("This is our text file");
        pw.close();

    }

}
