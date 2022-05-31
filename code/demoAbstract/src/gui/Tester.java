/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import dto.Dog;
import dto.Food;
import dto.Komodo;
import dto.LivingBeing;
import dto.Nepenthe;
import dto.Skin;

/**
 *
 * @author Razer Blade
 */
public class Tester {
    public static void main(String[] args) {
        LivingBeing obj1=null;
        obj1=new Nepenthe();
        obj1.consumeWater();
        obj1.grow();
        
        LivingBeing obj2=null;
        obj2=new Dog();
        obj2.consumeWater();
        obj2.grow();
        
        Food f=null;
        f=new Nepenthe();
        f.eatBug();
        
        f=new Komodo();
        f.eatBug();
        
        Skin s=null;
        s=new Dog();
        s.changeSkin();
    }
}
