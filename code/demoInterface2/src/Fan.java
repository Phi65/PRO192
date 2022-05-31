/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Razer Blade
 */
public class Fan implements RemoteTimer,Remote{

    @Override
    public void setTime() {
        System.out.println("het gio");
    }

    @Override
    public void on() {
        System.out.println("quay deu quay deu quay deu");
    }

    @Override
    public void off() {
        System.out.println("shutdown");
    }
    
}
