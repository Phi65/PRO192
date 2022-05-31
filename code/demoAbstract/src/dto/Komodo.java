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
public class Komodo extends Animal implements Food{
    private String from;

    public Komodo() {
        super();
        from="chau phi";
    }

    public Komodo(String from, String gender, String name) {
        super(gender, name);
        this.from = from;
    }
    
    @Override
    public void eatBug() {
        System.out.println("an bug by luoi");
    }
    
}
