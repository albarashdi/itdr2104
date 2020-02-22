/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package practiacl1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Ahmed Al-Brashdi
 */
public class Question1 {
    public static void main(String[] args) throws FileNotFoundException{
        File file = new File("D:\\CAS Drive\\FL19\\ITDR2104-FL19\\practical1\\courses.txt");
        Scanner scan = new Scanner(file);
        while(scan.hasNext()){
            System.out.println("Course code:"+scan.next()+", Course major:"+scan.next()+" and Student number:"+scan.nextInt());
        }
        
        // section 10
        File file2 = new File("D:\\CAS Drive\\FL19\\ITDR2104-FL19\\practical1\\persons.txt");
        Scanner scan2 = new Scanner(file2);
        while(scan2.hasNext()){
            System.out.println("Name:"+scan2.next()+", Age:"+scan2.nextInt()+" and gender:"+scan2.next());
        }
    }

}
