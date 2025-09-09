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
public class bai4_tinhthuongtich {
    public static void main(String[] args) {
        System.out.println("Chuong trinh tinh thuong tich");
        Scanner sc = new Scanner(System.in);
         System.out.println("Nhap so a");
        int a= sc.nextInt();
        System.out.println("Nhap so b");
        int b= sc.nextInt();
        int thuong = a*b;
        int hieu = a/b;
        System.out.println(a + "*" + b+"="+ thuong);
        System.out.println(a + "/" + b+"="+ hieu);
    } 
}
