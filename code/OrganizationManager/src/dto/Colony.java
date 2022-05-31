/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dto;

/**
 *
 * @author Razer Blade
 */
public class Colony extends Organization{
    private String place;

    public Colony() {
    }

    public Colony(String place, int size) {
        super(size);
        this.place = place;
    }

    public String getPlace() {
        return place;
    }
    
    @Override
    public void communicateByTool() {
        System.out.println("The colony communicate by sound");
    }
    
    public void grow(){
        System.out.println("An annual cycle of grows that begins in spring");
    }
    
    public void reproduce(){
        System.out.println("Colony can reproduce ifself through a process");
    }

    @Override
    public String toString() {
        return "The colony size is "+this.getSize()+ ", the colony place is " + place;
    }
    
}
