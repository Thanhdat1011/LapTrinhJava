/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package spc.edu;

import java.time.YearMonth;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class bai9_songaytrongthang {
    public static void main(String[] args) {
        System.out.println("Chuong trinh so ngay trong thang");
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap thang");
        int thang = sc.nextInt();
        System.out.println("nhap nam");
        int nam = sc.nextInt();
        YearMonth yearmonth = YearMonth.of(nam, thang);
        int ngay = yearmonth.lengthOfMonth();
        
        System.out.println("thang" + thang + "nam" + nam + "co" + ngay + "ngay.");
    }
}
