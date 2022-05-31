/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dto;

import java.util.Scanner;
import mylib.Validation;

/**
 *
 * @author Razer Blade
 */
public class Fraction {
    //field
    private int tu;
    private int mau;
    
    //constructor
    public Fraction() {
        tu=0;
        mau=1;
    }
    public Fraction(int a,int b){
        tu=a;
        mau=b;
    }
    //methods
    public void setTu(int a){
        tu=a;
    }
    public void setMau(int a){
        mau=a;
    }
    public int getTu(){
        return tu;
    }
    public int getMau(){
        return mau;
    }
    public void inputFraction(){
        boolean kt=false;
        do {
            try {
                tu = Validation.inputTu("Input x:");
                mau = Validation.inputMau("Input y:");
                kt = false;
            } catch (Exception e) {
                System.out.println("Data is invalid. Re-input");
                kt = true;
            }
        } while (kt);
    }
    public void outputFraction(){
        System.out.println("Fraction: "+tu+"/"+mau);
    }
    public int findUSCLN(int a,int b){
        int c;
        while (b!=0){
            c=b;
            b=a%b;
            a=c;
        }
        return a;
    }
    public void simplifyFraction(){
        int i=findUSCLN(tu,mau);
        tu=tu/i;
        mau=mau/i;
    }
    public Fraction sumFraction(Fraction a){
        int tuso=tu*a.getMau() + mau*a.getTu();
        int mauso=mau*a.getMau();
        Fraction phansotong = new Fraction(tuso,mauso);
        phansotong.simplifyFraction();
        return phansotong;
    }
    public Fraction subtractionFraction(Fraction a){
        int tuso=tu*a.getMau() - mau*a.getTu();
        int mauso=mau*a.getMau();
        Fraction phansohieu = new Fraction(tuso,mauso);
        phansohieu.simplifyFraction();
        return phansohieu;
    }
    public Fraction multiplicationFraction(Fraction a){
        int tuso=tu*a.getTu();
        int mauso=mau*a.getMau();
        Fraction phansotich = new Fraction(tuso,mauso);
        phansotich.simplifyFraction();
        return phansotich;
    }
    public Fraction divisionFraction(Fraction a){
        int tuso=tu*a.getMau();
        int mauso=mau*a.getTu();
        Fraction phansothuong = new Fraction(tuso,mauso);
        phansothuong.simplifyFraction();
        return phansothuong;
    }
    public void sumFraction(int tu1,int mau1){
        int tuso=tu*mau1 + mau*tu1;
        int mauso=mau*mau1;
        Fraction phansotong = new Fraction(tuso,mauso);
        phansotong.simplifyFraction();
        System.out.println("Sum of 2 Fraction: "+phansotong.getTu()+"/"+phansotong.getMau());
    }
    public void subtractionFraction(int tu1,int mau1){
        int tuso=tu*mau1 - mau*tu1;
        int mauso=mau*mau1;
        Fraction phansohieu = new Fraction(tuso,mauso);
        phansohieu.simplifyFraction();
        System.out.println("Sum of 2 Fraction: "+phansohieu.getTu()+"/"+phansohieu.getMau());
    }
    public void multiplicationFraction(int tu1,int mau1){
        int tuso=tu*tu1;
        int mauso=mau*mau1;
        Fraction phansotich = new Fraction(tuso,mauso);
        phansotich.simplifyFraction();
        System.out.println("Sum of 2 Fraction: "+phansotich.getTu()+"/"+phansotich.getMau());
    }
    public void divisionFraction(int tu1,int mau1){
        int tuso=tu*mau1;
        int mauso=mau*tu1;
        Fraction phansothuong = new Fraction(tuso,mauso);
        phansothuong.simplifyFraction();
        System.out.println("Sum of 2 Fraction: "+phansothuong.getTu()+"/"+phansothuong.getMau());
    }
}

