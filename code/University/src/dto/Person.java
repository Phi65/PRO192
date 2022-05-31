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
public class Person {
    private String id;
    private String name;
    private String gender;
    
    public Person() {
        id="";
        name="";
        gender="";
    }

    public Person(String id, String name, String gender) {
        this.id = id;
        this.name = name;
        this.gender = gender;
    }

    public String getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getGender() {
        return gender;
    }

    public void setId(String id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    
    public void inputPerson(){
        try {
            id=Validation.inputString("input id:");
            name=Validation.inputString("input name:");     
            gender=Validation.inputString("input gender:");     
        }catch(Exception e){
            System.out.println("Error");
        }
    }
    
    public void outPerson(){
        System.out.println("id: "+id);
        System.out.println("name: "+name);
        System.out.println("gender: "+gender);
    }
}
