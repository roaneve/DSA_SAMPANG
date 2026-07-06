/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.verzon_program;
import java.util.Scanner; //input scanner
/**
 *
 * @author STUDENT
 */
public class Verzon_program {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Basic Output Syntax
        System.out.println("Hello World!");
        System.out.println("Mark Regie Verzon");
        System.out.println("Section 2D");
        //comment //
        
        System.out.println("Enter a number 1:");
        int x = input.nextInt();
        System.out.println("Enter a number 2:");
        int y = input.nextInt();
        
        int sum ,  diff; 
        sum = x + y;
        diff = x - y ;
        System.out.print(" sum is "+sum);
        System.out.print(" diff is "+diff);
        
        
        
        
        
    }
}
