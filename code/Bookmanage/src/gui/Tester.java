/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import dto.Book;
import java.util.Scanner;
import mylib.Validation;

/**
 *
 * @author Razer Blade
 */
public class Tester {
    public static void main(String[] args) {
        int choice=0;
        Book sach=null;
        do{
            System.out.println("1. Input a book");
            System.out.println("2. Display a book");
            System.out.println("3. Update a book id");
            System.out.println("4. Update a book name");
            System.out.println("5. Update a book publisher");            
            System.out.println("6. Exit");
            Scanner sc=new Scanner(System.in);
            try{
                choice=Validation.inputNumber("Input a choice");
            }catch(Exception e){
                System.out.println("Choice is invalid");
            }
            switch(choice){
                case 1:
                    sach=new Book();
                    sach.inputBook();
                    break;
                case 2:
                    sach.outputBook();
                    break;
                case 3:
                    if(sach!=null){
                        try{
                            String newId=Validation.inputString("Input new Id");
                            sach.setId(newId);
                            System.out.println("After updating: "+sach.getId());
                        }catch(Exception e){
                            System.out.println("New Id is invalid");
                        }   
                    }                    
                case 4:
                    if(sach!=null){
                        try{
                            String newName=Validation.inputString("Input new Name");
                            sach.setName(newName);
                            System.out.println("After updating: "+sach.getName());
                        }catch(Exception e){
                            System.out.println("New Name is invalid");
                        }   
                    }    
                case 5:
                    if(sach!=null){
                        try{
                            String newNxb=Validation.inputDefaultString("Input new Publisher");
                            sach.setNxb(newNxb);
                            System.out.println("After updating: "+sach.getPublisher());
                        }catch(Exception e){
                            System.out.println("New Publisher is invalid");
                        }   
                    }    
            }
        }while(choice<=5);
    }
}
