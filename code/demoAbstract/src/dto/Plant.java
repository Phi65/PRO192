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
public class Plant extends LivingBeing{
    private int year;

    public Plant() {
        super();
    }

    public Plant(int year, String name) {
        super(name);
        this.year = year;
    }    
    
    @Override
    public void grow() {
        System.out.println("grow by light");
    }
    
}
