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
public class Animal extends LivingBeing{
    private String gender;

    public Animal() {
        super();
        gender="female";
    }
    public Animal(String gender, String name) {
        super(name);
        this.gender = gender;
    }    
    @Override
    public void grow() {
        System.out.println("grow by food");
    }
    
}
