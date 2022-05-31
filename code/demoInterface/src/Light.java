/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Razer Blade
 */
public class Light implements Switch{
    
    private String name;

    public Light() {
        name="Dien quang";
    }
    
    @Override
    public void up() {
        System.out.println("mo dien");
    }

    @Override
    public void down() {
        System.out.println("tat dien");
    }
    
}
