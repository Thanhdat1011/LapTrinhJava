/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package spc.edu;

/**
 *
 * @author Administrator
 */
public class bai16_Fibonaci {
    public static void main(String[] args) {
        System.out.println("Chuong trinh tinh giai thua:");
        int so1 = 0, so2 = 1;
        System.out.print(so1 + " " + so2 + " ");
        while (true) {
            int soketiep = so1 + so2;
            System.out.print(soketiep + " ");
            so1 = so2;
            so2 = soketiep;
            if (soketiep > 100) {
                break;
            }
        }
    
    }
}
