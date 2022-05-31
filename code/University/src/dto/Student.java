/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dto;

import mylib.Validation;

/**
 *
 * @author Razer Blade
 */
public class Student extends Person {
    private double mark;
    private Dog pet; //cai dat relationship has-a giua Student va Dog
    //pet khong la dac diem cua sinh vien
    private Laptop laptop;
    
    public Student() {
        super(); //goi default constructor of class Person;
        //co the bo qua lenh nay
        //do java tu them vao
        mark=0;
    }

    public Student(double mark, String id, String name, String gender) {
        super(id, name, gender);
        this.mark = mark;
    }

    public Student(double mark, Dog pet, String id, String name, String gender) {
        super(id, name, gender);
        this.mark = mark;
        this.pet = pet;
    }

    public Student(double mark, Dog pet, Laptop laptop, String id, String name, String gender) {
        super(id, name, gender);
        this.mark = mark;
        this.pet = pet;
        this.laptop = laptop;
    }

    
    public Dog getPet() { 
        return pet;
    }

    public void setPet(Dog pet) {
        this.pet = pet;
    }

    public double getMark() {
        return mark;
    }

    public void setMark(double mark) {
        this.mark = mark;
    }
    
    public void inputStudent(){
        try{
            inputPerson();
            mark=Validation.inputNumber("Input mark: ");
            String anw=Validation.inputString("Ban co muon nhap Pet(Y/N):");
            if (anw.equalsIgnoreCase("Y")){
                if (pet==null){
                    pet= new Dog();
                    pet.inputDog();
                }
                else pet.inputDog();
            }
            anw=Validation.inputString("Ban co muon nhap Laptop (Y/N):");
            if (anw.equalsIgnoreCase("Y")){
                if (laptop==null){
                    laptop= new Laptop();
                    laptop.inputLaptop();
                }
                else laptop.inputLaptop();
            }
        }catch (Exception e){
            System.out.println("Error");
        }
    }
    
    public void outStudent() {
        outPerson();
        System.out.println("mark: "+mark);
        if (pet!=null) pet.outDog();
        if (laptop!=null) laptop.outLaptop();
    }
}
