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
public class Nepenthe extends Plant implements Food,Skin{
    private String type;

    public Nepenthe() {
        super();
        type="cay nhiet doi";
    }

    public Nepenthe(String type, int year, String name) {
        super(year, name);
        this.type = type;
    }
    
    @Override
    public void eatBug() {
        System.out.println("an bug by nap");
    }

    @Override
    public void changeSkin() {
        System.out.println("mau canh la, do, nau, rung");
    }
    
}
