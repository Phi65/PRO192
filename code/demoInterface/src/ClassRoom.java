/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Razer Blade
 */
public class ClassRoom {
    private int id;
    private Remote ac;
    private Switch sw;
    
    public ClassRoom() {
        id=303;
        ac=new AirConditioner();
        sw=new Light();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Remote getAc() {
        return ac;
    }

    public void setAc(Remote ac) {
        this.ac = ac;
    }

    public Switch getSw() {
        return sw;
    }

    public void setSw(Switch sw) {
        this.sw = sw;
    }
    
    public void useRoom(){
        ac.on();
        if (ac instanceof Remote_Gen2) ((Remote_Gen2)ac).setMode();
        sw.up();
    }
    public void outRoom(){
        ac.off();
        sw.down();
    }
    public static void main(String[] args) {
        ClassRoom c=new ClassRoom();
        c.useRoom();
        c.outRoom();
        
        Remote ac=new Airconditioner_Gen2();
        c.setAc(ac);
        c.useRoom();
        c.outRoom();
    }
}
