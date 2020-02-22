/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lecture8;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

/**
 *
 * @author Ahmed Al-Brashdi
 */
public class ReadFromURL {

    public static void main(String[] args) throws MalformedURLException, IOException {
        URL url = new URL("https://www.aljazeera.net/");
        Scanner scan = new Scanner(url.openStream());
        while(scan.hasNext()){
            System.out.println(scan.nextLine());
        }

    }

}
