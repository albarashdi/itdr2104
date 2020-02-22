/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ss0368
 */
public class Test {
    
    public static void main (String[] args) throws FileNotFoundException{
        Person p1 = new Person(25, "Salim", "Male");
        Person p2 = new Person(25, "Salim", "Male");
        
        System.out.println(p1.equals(p2));
        
        Person person1 = new Person(32, "Ahmed", "Male");
        Person person2 = new Person(36, "Hamed", "Male");
        Instructor instructor1 = new Instructor(12, "Sali", "Female", 3678, "IT");
        Student student1 = new Student(19, "Halima","Female", 2018493001, "IT");
        
        // create array list pf persons
        ArrayList<Person> persons = new ArrayList<>();
        
        // adding elements to the arraylist
        persons.add(p1);
        persons.add(p2);
        persons.add(instructor1);
        persons.add(student1);
        
        File file = new File("persons2.txt");
        try(PrintWriter pw = new PrintWriter(file)){
            for(int i=0;i<persons.size();i++){
            System.out.println(persons.get(i));
            pw.println(persons.get(i));
            
        }
        }
        
        // print out array list elements
        // removing student1 object from the arraylist
        persons.remove(student1);
        
        // question 4 a
        File f = new File("myPersons.txt");
        Scanner scan = new Scanner(f);
        while(scan.hasNext()){
            Person p = new Person(scan.nextInt(),scan.next(),scan.next());
            System.out.println(p.toString());

        }
        // using split method in String
        Scanner scan2 = new Scanner(f);
        while(scan2.hasNext()){
            String[] pParts = scan2.nextLine().split(" ");
            Person p = new Person(Integer.parseInt(pParts[0]), pParts[1], pParts[2]);
            System.out.println(p.toString());
        }


        
        
        
    }
    
}
