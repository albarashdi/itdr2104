/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Ahmed Al-Brashdi
 */
public class Test2 {
    public static void main(String[] args) {
        ArrayList<Rectangle> rectangles = new ArrayList<>();
        
        Rectangle rectangle1 = new Rectangle(10, 23);
        Rectangle rectangle2 = new Rectangle(7, 18);
        Rectangle rectangle3 = new Rectangle(9, 11);
        Rectangle rectangle4 = new Rectangle(15, 20);
        
        rectangles.add(rectangle1);
        rectangles.add(rectangle2);
        rectangles.add(rectangle3);
        rectangles.add(rectangle4);
        // this is before sorting
        System.out.println("ArrayList before sorting:");
        for(Rectangle r :rectangles){
            System.out.println(r.getArea());
        }
        System.out.println("#########################");
        Collections.sort(rectangles);
        System.out.println("ArrayList after sorting:");
        for(Rectangle r :rectangles){
            System.out.println(r.getArea());
        }
    }
}
