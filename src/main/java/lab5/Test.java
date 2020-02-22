
package lab5;

import java.util.ArrayList;

/**
 *
 * @author ss0368
 */
public class Test {
    public static void main(String[] args){
        // declaring and array list of persons
        ArrayList<Person> persons= new ArrayList<>();
        Person e =new Person(25, "Sloom");
        persons.add(e);
        
        ArrayList<Integer> marks = new ArrayList<>();
        // add element at the end of the array lis
        marks.add(5);
        
        // add element to given index of the array list
        marks.add(0, 10);
        
        // print out arraylist values
        for(int i=0;i<marks.size();i++){
            System.out.print(marks.get(i)+" ");
        }
        
        // using set to rewrite element in specific index
        marks.set(0, 15);
        
        // print out arraylist values
        for(int i=0;i<marks.size();i++){
            System.out.print(marks.get(i)+" ");
        }
        marks.add(23);
        marks.add(15);
        marks.remove(0);
        // print out arraylist values
        for(int i=0;i<marks.size();i++){
            System.out.print(marks.get(i)+" ");
        }
        System.out.println("The index of 23 is: "+marks.indexOf(23));
        System.out.println("Is the array list empty? "+marks.isEmpty());
    }
    
}
