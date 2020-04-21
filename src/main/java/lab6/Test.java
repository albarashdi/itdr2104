/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6;

import java.util.ArrayList;

/**
 *
 * @author Ahmed Al-Brashdi
 */
public class Test {
    public static void main(String[] args) {
        // answer for lab 6 question 7
        ArrayList<GeometricObject> geomatrics = new ArrayList<>();
        Circle circle1 = new Circle(26.4);
        Circle circle2 = new Circle(21.0);
        Rectangle rectangle1 = new Rectangle(10, 23);
        Rectangle rectangle2 = new Rectangle(7, 18);
        
        geomatrics.add(circle1);
        geomatrics.add(circle2);
        geomatrics.add(rectangle1);
        geomatrics.add(rectangle2);
        
        for(GeometricObject go :geomatrics){
            System.out.println(go);
        }
        
        
    }
}
