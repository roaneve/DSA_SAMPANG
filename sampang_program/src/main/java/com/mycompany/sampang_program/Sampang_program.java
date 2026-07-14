/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sampang_program;
import java.util.Scanner;

/**
 *
 * @author STUDENT
 */
public class Sampang_program {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Hello World!");
        System.out.println("Sampang Roan!");
        System.out.println("number!");
        int x = input.nextInt();
       System.out.println("number!");
        int y = input.nextInt();
        
        int sum,diff,prod,quot;
        sum = x + y;
        diff = x - y;
        prod = x * y;
        quot = x / y;
        
        
         System.out.println("sum is :"+ sum);
         System.out.println("diff is :"+ diff);
         System.out.println("prod is :"+ prod);
         System.out.println("quot is :"+ quot);
         
         
    }
}
