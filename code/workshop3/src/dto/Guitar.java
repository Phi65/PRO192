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
public class Guitar {
    private String serialNumber;
    private int price;
    private String builder;
    private String model;
    private String backWood;
    private String topWood;
    public Guitar(){
        serialNumber=null;
        price=0;
        builder=null;
        model=null;
        backWood=null;
        topWood=null;
    }
    public Guitar(String s, int p, String b, String m,String back,String top){
        if (s!=null && !s.isEmpty()) serialNumber=s;
        price=p;
        if (b!=null && !b.isEmpty()) builder=b;
        if (m!=null && !m.isEmpty()) model=m;
        if (back!=null && !back.isEmpty()) backWood=back;
        if (top!=null && !top.isEmpty()) topWood=top;
    }
    public String getSerialNumber(){
        return serialNumber;
    }
    public void setSerialNumber(String s){
        if (s!=null && !s.isEmpty())    serialNumber=s;
    }
    public int getPrice(){
        return price;
    }
    public void setPrice(int s){
        if (s>0)    price=s;
    }
    public String getBuilder(){
        return builder;
    }
    public void setBuilder(String s){
        if (s!=null && !s.isEmpty())    builder=s;
    }
    public String getModel(){
        return model;
    }
    public void setModel(String s){
        if (s!=null && !s.isEmpty())    model=s;
    }
    public String getBackWood(){
        return backWood;
    }
    public void setBackWood(String s){
        if (s!=null && !s.isEmpty())    backWood=s;
    }
    public String getTopWood(){
        return topWood;
    }
    public void setTopWood(String s){
        if (s!=null && !s.isEmpty())    topWood=s;
    }
    public void createSound(){
        System.out.println("Serial Number: " +getSerialNumber());
        System.out.println("Price: " +getPrice());
        System.out.println("Builder: " +getBuilder());
        System.out.println("Model: " +getModel());
        System.out.println("Back Wood: " +getBackWood());
        System.out.println("Top Wood: " +getTopWood());
    }
}
