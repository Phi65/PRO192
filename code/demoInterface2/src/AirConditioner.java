/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Razer Blade
 */
public class AirConditioner implements Remote{
    
    private String name;
    public AirConditioner(){
        name="LG";
    }
    public AirConditioner(String name) {
        this.name = name;
    }
    @Override
    public void on() {
        System.out.println("cach cach cach");
        System.out.println("vu vu vu");
        System.out.println("co khoi");
        System.out.println("mat mat hoi hoi");
    }

    @Override
    public void off() {
        System.out.println("cach cach cach");
        System.out.println("nong nong nong");
    }
    
}
