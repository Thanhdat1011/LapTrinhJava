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
public class bai8_hinhtronvaHinhchunhat {
        public static void main(String[] args) {
        System.out.println("Chuong trinh hinh chu nhat");
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap chieu dai");
        double cd =  sc.nextInt();
        System.out.println("nhap chieu rong");
        double cr = sc.nextInt();
        double cv = (cd + cr)*2;
        double dt = cd*cr;
        System.out.println("chu vi hinh chu nhat"+cv);
        System.out.println("dien tich chu nhat"+dt);
        
        System.out.println("nhap ban kinh");
        double bk = sc.nextInt();
        double cvht = 2*3.14*bk;
        double dtht = 3.14*(bk*bk);
        System.out.println("chu vi hinh tron la"+cvht);
        System.out.println("dien tich hinh tron la"+dtht);
    }
}

        
