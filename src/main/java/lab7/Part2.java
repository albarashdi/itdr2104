/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author ss0368
 */
public class Part2 {
    private static int num1;
    private static boolean n1;
    private static boolean n2;
    private static int num2;
    public static void main (String[] args){
        while(n1==false){
            firstNumber();
        }
        while(n2==false){
            secondNumber();
        }
        
        System.out.println("Sum of the two integers= "+(num1+num2));
       
    }
    public static void firstNumber(){
        try{
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first number");
        num1=scan.nextInt();
        n1=true;
        }catch(InputMismatchException e){
            System.out.println("Must be integer");
        }
    }
    public static void secondNumber(){
        try{
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter second number");
        num2=scan.nextInt();
        n2=true;
        }catch(InputMismatchException e){
            System.out.println("Must be integer");
        }
    }
}
