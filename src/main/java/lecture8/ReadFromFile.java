/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lecture8;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Ahmed Al-Brashdi
 */
public class ReadFromFile {

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("text.txt");
        Scanner scan = new Scanner(file);
        while(scan.hasNext()){
            System.out.println(scan.nextLine());
        }
        

        

    }

}
