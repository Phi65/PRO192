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
public class Teacher extends Person{
    private int exp;
    private Laptop laptop;
    
    public Teacher(){
        super();
        exp=0;
    }

    public Teacher(int exp, String id, String name, String gender) {
        super(id, name, gender);
        this.exp = exp;
    }

    public Teacher(int exp, Laptop laptop, String id, String name, String gender) {
        super(id, name, gender);
        this.exp = exp;
        this.laptop = laptop;
    }

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }
    
    public void inputTeacher(){
        try{
            this.inputPerson();
            exp=Validation.inputInteger("Input exp: ");
            String anw=Validation.inputString("Ban co muon nhap Laptop (Y/N):");
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
    
    public void outTeacher() {
        outPerson();
        System.out.println("exp: "+exp);
        if (laptop!=null) laptop.outLaptop();
    }
}
