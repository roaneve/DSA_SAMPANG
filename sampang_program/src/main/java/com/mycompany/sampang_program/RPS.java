/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sampang_program;
import java.util.Scanner;
/**
 *
 * @author STUDENT
 */
public class RPS {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.println("[1] = ROCK");
      System.out.println("[2] = PAPER");
      System.out.println("[3] = SCISSOR");
      
      System.out.println("ENTER PLAYER1:");
      int P1 = input.nextInt();
       System.out.println("ENTER PLAYER2:");
        int P2 = input.nextInt();
        if( P1 == 1 && P2 == 1 )
        {
            System.out.println("DRAW");
        }
        else if(P1 == 1 && P2 == 2)
      {
            System.out.println("PLAYER 2 WIN");
        }
          else if(P1 == 1 && P2 == 3)
      {
            System.out.println("PLAYER 1 WIN");
        }
         else if(P1 == 2 && P2 == 1)
      {
            System.out.println("PLAYER 1 WIN");
        }
         else if(P1 == 2 && P2 == 2)
      {
            System.out.println("DRAW");
        }
         else if(P1 == 2 && P2 == 3)
      {
            System.out.println("PLAYER 2 WIN");
        }
         else if(P1 == 3 && P2 == 1)
      {
            System.out.println("PLAYER 1 WIN");
        }
         else if(P1 == 3 && P2 == 2)
      {
            System.out.println("PLAYER 1 WIN");
        }
         else if(P1 == 3 && P2 == 3)
      {
            System.out.println("DRAW");
        }
    }
}
