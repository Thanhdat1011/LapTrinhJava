/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package spc.edu;

/**
 *
 * @author Administrator
 */
public class bai11_bangcuuchuong {
    public static void main(String[] args) {
        System.out.println("Chuong trinh tinh bang cuu chuong");
        for (int i = 1; i <= 10; i++) {
            System.out.println("Bảng cửu chương " + i + ":");
            for (int j = 1; j <= 10; j++) {
                System.out.printf("%d x %d = %d\n", i, j, i * j);
            }
            System.out.println(); 
    }
  }
}
