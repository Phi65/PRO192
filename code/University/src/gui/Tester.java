/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import dto.Dog;
import dto.Laptop;
import dto.Person;
import dto.Student;
import dto.Teacher;
import mylib.Validation;

/**
 *
 * @author Razer Blade
 */
public class Tester {
    public static void main(String[] args) {
//        int choice=0;
//        Student stu=null;       
//        Teacher tea=null;
//        Dog pet=null;
//        Person per=null;
//        do{
//            System.out.println("1. Create a student");
//            System.out.println("2. Create a Teacher");
//            System.out.println("3. Create a Dog");
//            System.out.println("4. Display.");
//            try{
//                choice=Validation.inputInteger("Input a choice");
//            }catch(Exception e){
//                System.out.println("Choice is invalid");
//            }
//            switch(choice){
//                case 1:
//                    stu=new Student();
//                    stu.inputStudent();
//                    per = new Student();
//                    ((Student)per).inputStudent();
//                    break;
//                case 2:
//                    tea=new Teacher();
//                    tea.inputTeacher();
//                    per = new Teacher();
//                    ((Teacher)per).inputTeacher();
//                    break;
//                case 3:
//                    pet=new Dog();
//                    pet.inputDog();
//                    if (stu!=null)   stu.setPet(pet);
//                    break;
//                case 4:
////                    if (stu!=null){
////                        stu.outStudent();
////                        if (stu.getPet()!=null) stu.getPet().outDog();
////                    }
////                    if (tea!=null)  tea.outTeacher();
//                    if (per!=null){
//                        if(per instanceof Student){
//                            ((Student)per).outStudent();
//                        }
//                        else if (per instanceof Teacher){
//                            ((Teacher)per).outTeacher();
//                        }
//                    }
//                    break;
//            }
//        }while (choice<=4);
        Student stu1=new Student();
        stu1.inputStudent();
        stu1.outStudent();
        //test case 2
        Dog dog=new Dog("200","black","nam");
        Student stu2=new Student(5.5,dog,"2","c","op");
        stu2.outStudent();
        //test case 3
        Student stu3=new Student(7.5,"3","d","pop");
        stu3.outStudent();
        //test case 4
        Dog dog1=new Dog("400","aka","nam");
        Laptop lap=new Laptop("1234","99887766");
        Student stu4=new Student(9.5,dog1,lap,"2","c","op");
        stu4.outStudent();
        
        System.out.println("");
        System.out.println("Teacher");
        Teacher tea1=new Teacher();
        tea1.inputTeacher();
        tea1.outTeacher();
        
        Laptop laptea=new Laptop("9999","11111111");
        Teacher tea2=new Teacher(3,laptea,"1","p","ios");
        tea2.outTeacher();
    }
}
