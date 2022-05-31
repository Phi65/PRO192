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
public abstract class LivingBeing {
    String name;

    public LivingBeing() {
    }

    public LivingBeing(String name) {
        this.name = name;
    }
    
    public void consumeWater(){
        System.out.println("use water");
    }
    
    public abstract void grow();
}
