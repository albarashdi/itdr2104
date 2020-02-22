/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lecture8;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


/**
 *
 * @author Ahmed Al-Brashdi
 */
public class AppendToFile {
    public static void main (String[] args) throws IOException{
        File file = new File("text.txt");
        FileWriter fileWriter = new FileWriter(file,true);
        fileWriter.append("\nThis is new text from file writer");
        fileWriter.close();
                
        
    }

}
