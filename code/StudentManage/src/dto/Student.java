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
public class Student implements Comparable<Student>{
    private int id; //declare fields
    private String name;
    
    public Student() {
        id=0;
        name=null;
    }
    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    } 
    public void setId(int ma){
        if(ma>0)    id=ma;
    }
    public void setName(String ten){
        if(ten!=null && !ten.isEmpty()) name=ten;
    }    
    //lay field
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }

    public void inputStudent(){  //declare methods
    /*    Scanner sc=new Scanner(System.in);
        System.out.println("input id:");
        id=sc.nextInt();
        sc=new Scanner(System.in);
        System.out.println("input name");
        name=sc.nextLine();     */
        boolean kt=false;
        do {
            try {
                id = Validation.inputNumber("input id: ");
                name = Validation.inputString("input name: ");
                kt = false;
            } catch (Exception e) {
                System.out.println("Data is invalid. Re-input");
                kt = true;
            }
        }while (kt);
    }
    public void outputStudent(){
        System.out.println("id:" +id);
        System.out.println("name:" +name);
    }

    @Override
    public int compareTo(Student o) {
        if (id>o.getId()) return 1;
        else if (id<o.getId()) return -1;
        return 0;
    }           
}
