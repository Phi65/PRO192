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
public class Validation {
    //ham nhap 1 so nguyen duong tu ban phim 
    //tra ve so da nhap
    public static int inputTu(String msg) throws Exception
    {
        int num=0;
        Scanner sc=new Scanner(System.in);  
        System.out.println(msg);
        num=sc.nextInt();
        //if(num<0) throw new Exception();
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
    //ham nhap 1 so thuc tu ban phim 
    //tra ve so da nhap    
    public static int inputMau(String msg) throws Exception
    {
        int num=0;
        Scanner sc=new Scanner(System.in);  
        System.out.println(msg);
        num=sc.nextInt();
        if(num==0) throw new Exception();
        return num;
    }
    public static int inputNumber(String msg) throws Exception
    {
        int num=0;
        Scanner sc=new Scanner(System.in);  
        System.out.println(msg);
        num=sc.nextInt();
        if(num<1) throw new Exception();
        return num;
    }
}
