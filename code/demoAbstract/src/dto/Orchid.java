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
public class Orchid extends Plant{
    private int price;

    public Orchid() {
        super();
        price=1000;
    }

    public Orchid(int price, int year, String name) {
        super(year, name);
        this.price = price;
    }
    
    
}
