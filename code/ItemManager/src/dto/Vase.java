/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dto;

import mylib.Validation;

/**
 *
 * @author Razer Blade
 */
public class Vase extends Item{
    private int height;
    private String material;

    public Vase() {
        super();
        height=0;
        material="";
    }    

    public Vase(int height, String material, int value, String creator) {
        super(value, creator);
        this.height = height;
        this.material = material;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
    
//    public void inputVase(){        
//        try{
//            inputItem();
//            height=Validation.inputInteger("Input height: ");
//            material=Validation.inputString("Input material: ");
//        }catch (Exception e){
//            System.out.println("Error");
//        }
//    }
//    
//    public void outVase() {
//        outItem();
//        System.out.println("height: "+height);
//        System.out.println("material: "+material);
//    }

    @Override
    public void outItem() {
        super.outItem(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("height: "+height);
        System.out.println("material: "+material);
    }

    @Override
    public void inputItem() {
        super.inputItem(); //To change body of generated methods, choose Tools | Templates.
        try{
            height=Validation.inputInteger("Input height: ");
            material=Validation.inputString("Input material: ");
        }catch (Exception e){
            System.out.println("Error");
        }
    }
    
}
