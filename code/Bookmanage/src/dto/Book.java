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
public class Book {
    //field
    private String id;
    private String name;
    private String nxb;    
    
    //Validate:    id,title   is not empty ;  
    //publisher should be “Tuoi Tre”, “Giao Duc”, 
    //or “Nhi Dong”   trong cac ham setter
    //constructor
    public Book(){
        id=null;
        name=null;
        nxb=null;
    }
    //methods
    public void setId(String ma){
        if(ma!=null && !ma.isEmpty())    id=ma;
    }
    public void setName(String ten){
        if(ten!=null && !ten.isEmpty()) name=ten;
    }    
    public void setNxb(String ten){
        nxb=ten;
    //  if(ten.equalsIgnoreCase("Tuoi Tre") || ten.equalsIgnoreCase("Giao Duc") || ten.equalsIgnoreCase("Nhi Dong")) nxb=ten;  
    }    
    public String getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public String getPublisher(){
        return nxb;
    }
    public void inputBook(){
        boolean kt = false;
        do {
            try {
                id = Validation.inputString("Input Id:");
                name = Validation.inputString("Input name:");
                nxb = Validation.inputDefaultString("Input publisher:");
                kt = false;
            } catch (Exception e) {
                System.out.println("Data is Invalid. Re-input");
                kt = true;
            }
        } while (kt);
    //  }while (!nxb.equalsIgnoreCase("Tuoi Tre") && !nxb.equalsIgnoreCase("Giao Duc") && !nxb.equalsIgnoreCase("Nhi Dong"));  
    }
    public void outputBook(){
        System.out.println("id: " +id);
        System.out.println("name: " +name);
        System.out.println("nxb: " +nxb);
    }
}
