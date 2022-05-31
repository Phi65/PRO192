/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import dto.Point;
import java.util.Scanner;
import mylib.Validation;

/**
 *
 * @author Razer Blade
 */
public class Tester {
    public static void main(String[] args) {
        int choice=0;
        Point p1=null;
        Point p2=null;  
        do{
            System.out.println("1. Input 2 points");
            System.out.println("2. Display 2 points");
            System.out.println("3. Update a X for P1");
            System.out.println("4. Update a Y for P1");
            System.out.println("5. Update a X for P2");
            System.out.println("6. Update a Y for P2");
            System.out.println("7. Get distance");
            System.out.println("8. Exit");
            Scanner sc=new Scanner(System.in);
            //System.out.println("input a choice");
            //choice=sc.nextInt();
            try{
                choice=Validation.inputNumber("Input a choice");
            }catch(Exception e){
                System.out.println("Choice is invalid");
            }
            switch(choice){
                case 1:
                    p1=new Point();
                    p2=new Point();
                    System.out.println("P1:");
                    p1.inputPoint();
                    System.out.println("P2:");
                    p2.inputPoint();
                    break;
                case 2:
                    if(p1!=null && p2!=null){
                        System.out.println("P1:");
                        p1.outputPoint();
                        System.out.println("P2:");
                        p2.outputPoint();
                    }
                    else System.out.println("2 point are not available");
                    break;
                case 3:
                    if(p1!=null){
                        //sc=new Scanner(System.in);
                        //System.out.println("input a new X for P1");
                        //double newX=sc.nextDouble();
                        try{
                            double newX=Validation.inputDouble("Input a new X for P1");
                            p1.setX(newX);
                            p1.outputPoint();
                        }catch(Exception e){
                            System.out.println("New X is invalid.");
                        }
                        
                    }     
                    break;
                case 4:
                    if(p1!=null){
                        try{
                            double newY=Validation.inputDouble("Input a new Y for P1");
                            p1.setY(newY);
                            p1.outputPoint();
                        }catch(Exception e){
                            System.out.println("New Y is invalid.");
                        }
                    }     
                    break;
                case 5:
                    if(p2!=null){
                        try{
                            double newX=Validation.inputDouble("Input a new X for P2");
                            p2.setX(newX);
                            p2.outputPoint();
                        }catch(Exception e){
                            System.out.println("New X is invalid.");
                        }
                    }     
                    break;
                case 6:
                    if(p2!=null){
                        try{
                            double newY=Validation.inputDouble("Input a new Y for P2");
                            p2.setY(newY);
                            p2.outputPoint();
                        }catch(Exception e){
                            System.out.println("New Y is invalid.");
                        }
                    }     
                    break;
                case 7:
                    if(p1!=null && p2!=null){
                        System.out.println("Distance of 2 Point: "+p1.getDistance(p2));
                    }
                    break;
            }
        }while(choice<=7);
    }
}

