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
public class Car {
    //field
    private String colour;
    private int epower;
    private boolean tible;
    private boolean brake;
    //constructor
    public Car(){
        colour="black";
        epower=0;
        tible=true;
        brake=true;
    }
    public Car(String c, int e, boolean t,boolean b){
        colour=c;
        epower=e;
        tible=t;
        brake=b;
    }
    //getter
    public String getColour(){
        return colour;
    }
    public int getEnginePower(){
        return epower;
    }
    public boolean getConvertible(){
        return tible;
    }
    public boolean getParkingBrake(){
        return brake;
    }
    //setter
    public void setColour(String c){
        if (c!=null && !c.isEmpty())colour=c;
    }
    public void setEnginePower(int e){
        epower=e;
    }
    public void setConvertible(boolean t){
        tible=t;
    }
    public void setParkingBrake(boolean b){
        brake=b;
    }
    //method
    public void pressStartButton(){
        System.out.println("You have pressed the start button");
    }
    public void pressAcceleratorButton(){
        System.out.println("You have pressed the Accelerator button");
    }
    public void output(){
        System.out.println("Colour: "+colour);
        System.out.println("Engine Power: "+epower);
        System.out.println("Convertible: "+tible);
        System.out.println("Parking Brake: "+brake);
    }
}
