/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package practiacl1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

/**
 *
 * @author Ahmed Al-Brashdi
 */
public class Question2 {
    public static void main (String[] args) throws FileNotFoundException{
        File file = new File("Student.java");
        PrintWriter pw = new PrintWriter(file);
        pw.println("public class Student {");
        pw.println("\tprivate String name;");
        pw.println("\tprivate int age;");
        pw.println("\tprivate double gpa;");
        pw.println("\tpublic Student(){");
        pw.println("\t}");
        pw.println("}");
        pw.close();
        
        // section 10
        File file2 = new File("Course.java");
        PrintWriter pw2 = new PrintWriter(file2);
        pw2.println("public class Course {");
        pw2.println("\tprivate String code;");
        pw2.println("\tprivate String title;");
        pw2.println("\tprivate int credit;");
        pw2.println("\tpublic Course(){");
        pw2.println("\t}");
        pw2.println("}");
        pw2.close();
    }

}
