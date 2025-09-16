/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package spc.edu;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class bai13_Break {
      public static void main(String[] args) {
          System.out.println("Break");
          Scanner sc= new Scanner(System.in);
          for (int i = 1; i <= 1000; i++){
              System.out.print(i + " " );
              /*
              if(i==50)
              continue;
              */
              if(i==50)
              break;
      }
          System.out.println("Thoát khỏi vòng lặp");
    }
      
    
}
