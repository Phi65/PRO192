/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Razer Blade
 */
public class Airconditioner_Gen2 extends AirConditioner implements Remote_Gen2{
    
    private String mode;
    //private String name;

    public Airconditioner_Gen2() {
        super();
        mode="eco";
    }
    
    @Override
    public void setMode() {
        System.out.println("AC tiet kiem dien");
    }

    @Override
    public void on() {
        System.out.println("mat me em ru");
    }

    @Override
    public void off() {
        System.out.println("mat, am, nong");
    }
    
}
