/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import dto.Fraction;
import java.util.Scanner;
import mylib.Validation;
/**
 *
 * @author Razer Blade
 */
public class Tester {
    public static void main(String[] args) {
        
        Fraction p1=null;
        Fraction p2=null;
        int choice=0;
        Scanner sc=new Scanner(System.in);
        do{
            System.out.println("1. Input 2 Fraction");
            System.out.println("2. Display 2 Fraction");
            System.out.println("3. Update numerator for Fraction 1");
            System.out.println("4. Update denominator for Fraction 1");
            System.out.println("5. Update numerator for Fraction 2");
            System.out.println("6. Update denominator for Fraction 2");
            System.out.println("7. Sum of 2 Fraction");
            System.out.println("8. Subtraction of 2 Fraction");
            System.out.println("9. Multiplication of 2 Fraction");
            System.out.println("10. DIvision of 2 Fraction");
            System.out.println("11. Exit");
            try{
                choice=Validation.inputNumber("Input a choice");
            }catch(Exception e){
                System.out.println("Choice is invalid");
            }
            switch(choice){
                case 1:         
                    p1= new Fraction();
                    System.out.println("Input a Fraction 1:");
                    p1.inputFraction();
                    p2= new Fraction();
                    System.out.println("Input a Fraction 2:");
                    p2.inputFraction();     
                    break;
                case 2:
                    if(p1!=null && p2!=null){
                        p1.outputFraction();
                        p2.outputFraction(); 
                    }                                
                    break;
                case 3:
                    if(p1!=null){                     
                        try{
                            int newX=Validation.inputTu("Input a new X for P1");
                            p1.setTu(newX);
                            p1.outputFraction();
                        }catch(Exception e){
                            System.out.println("New X is invalid.");
                        }
                    }  
                    break;
                case 4:
                    if(p1!=null){
                        try{
                            int newY=Validation.inputMau("Input a new Y for P1");
                            p1.setMau(newY);
                            p1.outputFraction();
                        }catch(Exception e){
                            System.out.println("New Y is invalid.");
                        }
                    }   
                    break;
                case 5:
                    if(p2!=null){
                        try{
                            int newX=Validation.inputTu("Input a new X for P1");
                            p2.setTu(newX);
                            p2.outputFraction();
                        }catch(Exception e){
                            System.out.println("New X is invalid.");
                        }
                    }   
                    break;
                case 6:
                    if(p2!=null){
                        try{
                            int newY=Validation.inputMau("Input a new Y for P1");
                            p2.setMau(newY);
                            p2.outputFraction();
                        }catch(Exception e){
                            System.out.println("New Y is invalid.");
                        }
                    }     
                    break;                            
                case 7:
                    if (p1!=null && p2!=null){
                        Fraction p3=p1.sumFraction(p2);//tong
                        p3.outputFraction();
                        p1.sumFraction(p2.getTu(),p2.getMau());
                    }
                    break;
                case 8:
                    if (p1!=null && p2!=null){
                        Fraction p3=p1.subtractionFraction(p2);//hieu
                        p3.outputFraction();                        
                        p1.subtractionFraction(p2.getTu(),p2.getMau());                    
                    }
                    break;
                case 9:
                    if (p1!=null && p2!=null){
                        Fraction p3=p1.multiplicationFraction(p2);//tich
                        p3.outputFraction();
                        p1.multiplicationFraction(p2.getTu(),p2.getMau());
                    }
                    break;  
                case 10:
                    if (p1!=null && p2!=null){
                        Fraction p3=p1.divisionFraction(p2);//thuong
                        p3.outputFraction();
                        p1.divisionFraction(p2.getTu(),p2.getMau());
                    }
                    break;    
            }
        }while(choice<=10);  
    }
}
