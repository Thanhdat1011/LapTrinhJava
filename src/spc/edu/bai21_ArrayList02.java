/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package spc.edu;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class bai21_ArrayList02 {
    public static void main(String[] args) {
         System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));
         System.out.println("Chuong trinh nhap vao ArrayList");
         ArrayList<String> sinhvien = new ArrayList<String>();
         Scanner nhap = new Scanner(System.in);
         while(true) {
         String s = nhap.next();
         
         if("0".equals(s)) break;
         
         sinhvien.add(s);
         }
         System.out.println("Danh sách sinh viên là: " + sinhvien.toString());
         System.out.println("\nTổng số có: " + sinhvien.size() + " sinh viên");
    }
}
