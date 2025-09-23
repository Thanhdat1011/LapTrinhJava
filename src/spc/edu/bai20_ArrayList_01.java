/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package spc.edu;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;



/**
 *
 * @author Administrator
 */
public class bai20_ArrayList_01 {
    public static void main(String[] args) {
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));
        System.out.println("Chương trình nhập vào ArrayList");
        ArrayList<String> s = new ArrayList<String>();
        s.add("Số 1");
        s.add("Số 2");
        s.add("Số 3");
        s.add("Số 4");
        s.add("Số 5");
        s.add("Số 6");
        s.remove(2);
        s.remove("Số5");
        for(int i = 0; i < s.size(); i++){
            System.out.println(s.get(i));
        }
    }

}
