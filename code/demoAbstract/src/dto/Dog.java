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
public class Dog extends Animal implements Skin{

    public Dog() {
        super();
    }

    public Dog(String gender, String name) {
        super(gender, name);
    }

    @Override
    public void changeSkin() {
        System.out.println("tu rung lon cu, moc long moi");
    }
    
    
}
