/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package practiacl1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;
import jdk.nashorn.internal.parser.Lexer;

/**
 *
 * @author Ahmed Al-Brashdi
 */
public class Question3 {
    public static void main(String[] args) throws MalformedURLException, FileNotFoundException, IOException{
        URL url = new URL("http://www.java2s.com/Tutorials/Java/Java_io/index.htm");
        File file = new File("D:\\CAS Drive\\FL19\\ITDR2104-FL19\\practical1\\q3assets\\myPage.html");
        PrintWriter pw = new PrintWriter(file);
        Scanner scan = new Scanner(url.openStream());
        while(scan.hasNext()){
            pw.println(scan.nextLine());
        }
        pw.close();
    }

}
