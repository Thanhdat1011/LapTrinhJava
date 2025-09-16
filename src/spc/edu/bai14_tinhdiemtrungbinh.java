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
public class bai14_tinhdiemtrungbinh {
    public static void main(String[] args) {
        int diem;
        int somonhoc = 0 ;
        double tongdiem = 0;
        
        Scanner sc = new Scanner (System.in);
        
        while(true){
        
            System.out.printf("nhap diem mon %d :", somonhoc);
            diem= sc.nextInt();
        
        if (diem == -1){
            break;
        }
        
        if (diem <= 0 || diem >=10){
            System.out.println("Diem phai nhap tu 0 den muoi");
            continue;
        }
        somonhoc++;
        tongdiem +=diem;
      }  
        double diemtrungbinh = tongdiem/somonhoc;
        System.out.printf("Ban da hoc %d mon hoc, diem trung binh la: %f\n", somonhoc,diemtrungbinh );        
    }
}
