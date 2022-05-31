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
public class Point {
    //field
    private double x;
    private double y;
    //constructor
    public Point() {
        x=0;
        y=0;
    }
    public Point(double mX,double mY) {
        x=mX;
        y=mY;
    }
    //methods
    public void setX(double p){
        x=p;
    }
    public void setY(double q){
        y=q;
    }
    public double getX(){
        return x;
    }
    public double getY(){
        return y;
    }
    public void inputPoint(){
        boolean kt=false;
        do {
            try {
                x = Validation.inputDouble("Input x:");
                y = Validation.inputDouble("Input y:");
                kt = false;
            } catch (Exception e) {
                System.out.println("Data is invalid. Re-input");
                kt = true;
            }
        } while (kt);
    }
    public void outputPoint(){
        System.out.println("x:" +x);
        System.out.println("y:" +y);
    }
    public double getDistance(Point p){
        double res =Math.sqrt((x-p.getX())*(x-p.getX())+(y-p.getY())*(y-p.getY()));
        return res;        
    }
}
