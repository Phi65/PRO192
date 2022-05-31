/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import dto.Student;
import dto.StudentSet;
import mylib.Validation;

/**
 *
 * @author Razer Blade
 */
public class Tester2 {
    public static void main(String[] args) {
        StudentSet set=new StudentSet();
        set.addStudent(new Student(20,"Phi"));
        set.addStudent(new Student(10,"Phong"));
        set.addStudent(new Student(50,"Phu"));
        set.addStudent(new Student(40,"Long"));
        set.displayAll();
        try{
           int id=Validation.inputNumber("Input id to remove");
           Student rs=set.removeStudent(id);
           if(rs==null) System.out.println("id is false");
           set.displayAll();
       }catch(Exception e){
           System.out.println("error");
       }
    }
}
