/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mylib;

import java.util.Scanner;

/**
 *
 * @author Razer Blade
 */
// day la class chua cac ham thu vien su dung chung
public class Validation {
    //ham nhap 1 so nguyen duong tu ban phim 
    //tra ve so da nhap
    public static double inputNumber(String msg) throws Exception
    {
        double num=0;
        Scanner sc=new Scanner(System.in);  
        System.out.println(msg);
        num=sc.nextDouble();
        if(num<0) throw new Exception();
        return num;
    }
    
    public static int inputInteger(String msg) throws Exception
    {
        int num=0;
        Scanner sc=new Scanner(System.in);  
        System.out.println(msg);
        num=sc.nextInt();
        if(num<0) throw new Exception();
        return num;
    }
    //ham nhap chuoi khac rong tu ban phim
    //tra ve chuoi da nhap
    public static String inputString(String msg) throws Exception
    {
        String s="";
        Scanner sc=new Scanner(System.in);  
        System.out.println(msg);
        s=sc.nextLine();
        if(s.isEmpty()) throw new Exception();
        return s;
    }
    public static boolean confirmYN(String msg) throws Exception
    {
        boolean r=false;
        String confirm=Validation.inputString(msg);
        if ("T".equalsIgnoreCase(confirm)){
            r=true;
        }
        return r;
    }
    
}
