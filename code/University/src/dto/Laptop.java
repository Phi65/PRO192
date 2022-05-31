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
public class Laptop {
    private String id;
    private String mac;

    public Laptop() {
        id="";
        mac="";
    }
    
    public Laptop(String id, String mac) {
        this.id = id;
        this.mac = mac;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMac() {
        return mac;
    }

    public void setMac(String mac) {
        this.mac = mac;
    }
    
    public void inputLaptop(){
        try {
            id=Validation.inputString("input id of Laptop:");
            mac=Validation.inputString("input MAC of laptop:");         
        }catch(Exception e){
            System.out.println("Error");
        }
    }
    
    public void outLaptop(){
        System.out.println("Laptop: "+id+", "+mac);
    }    
}
