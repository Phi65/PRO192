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
public class Dog {
    private String id;
    private String name;
    private String gender;

    public Dog() {
        id="";
        name="";
        gender="";
    }
    
    public Dog(String id, String name, String gender) {
        this.id = id;
        this.name = name;
        this.gender = gender;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    
    public void inputDog(){
        try {
            id=Validation.inputString("input id of Dog:");
            name=Validation.inputString("input name of Dog:");     
            gender=Validation.inputString("input gender of Dog:");     
        }catch(Exception e){
            System.out.println("Error");
        }
    }
    
    public void outDog(){
        System.out.println("Dog: "+id+", "+name+", "+gender);
    }
}
