/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package spc.edu;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class bai15_giaithua {
    public static void main(String[] args) {
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));
        System.out.println("Chuong trinh tinh giai thua3");
        Scanner sc= new Scanner(System.in);
        System.out.println("nhap so");
        int n = sc.nextInt();
        long ketqua = 1;
        for (int i = 1; i <=n; i ++){
         ketqua *= i;
        }
        System.out.println(n + "! = " + ketqua);
    }
    
  }
