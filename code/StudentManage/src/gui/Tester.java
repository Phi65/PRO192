/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import dto.Student;
import java.util.Scanner;
import mylib.Validation;

/**
 *
 * @author Razer Blade
 */
public class Tester {
    public static void main(String[] args) {
        int choice=0;
        Student stu=null;
        do{
            System.out.println("1. Input a student");
            System.out.println("2. Display a student");
            System.out.println("3. Update a student id");
            System.out.println("4. Update a student name");
            System.out.println("5. Exit");
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
                    stu=new Student();
                    stu.inputStudent();
                    break;
                case 2:
                    if(stu!=null){
                        stu.outputStudent();
                    }
                    break;
                case 3:
                    if(stu!=null){
                        //sc=new Scanner(System.in);
                        //System.out.println("input a new id");
                        //int newID=sc.nextInt();
                        try{
                            int newID=Validation.inputNumber("Input new Id");
                            stu.setId(newID);
                            System.out.println("After updating: "+stu.getId());
                        }catch(Exception e){
                            System.out.println("New Id is invalid");
                        }                     
                    }                    
                case 4:
                    if(stu!=null){
                        //sc=new Scanner(System.in);
                        //System.out.println("input a new name");
                        //String newName=sc.nextLine();
                        try{
                            String newName=Validation.inputString("Input new name");
                            stu.setName(newName);
                            System.out.println("After updating: "+stu.getName());
                        }catch(Exception e){
                            System.out.println("New Id is invalid");
                        }   
                    }                    
            }
        }while(choice<=4);
    }
}
