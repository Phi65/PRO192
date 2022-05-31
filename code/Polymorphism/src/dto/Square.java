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
public class Square extends Rectangle{

    public Square() {
        super();
    }
    public Square(double side) {
        super();
        super.setLength(side);
        super.setWidth(side);
    }

    public Square(double side,String color, boolean filled) {
        super.setColor(color); 
        super.setFilled(filled);
        super.setLength(side); 
        super.setWidth(side);
    }
    public double getSide(){
        return super.getLength();
    }
    public void setSide(double side){
        super.setLength(side);
        super.setWidth(side);
    }
    public void setWidth(double side){
        super.setLength(side);
        super.setWidth(side);
    }
    public void setLength(double side){
        super.setLength(side);
        super.setWidth(side);
    }

    @Override
    public String toString() {
        return "Square{" + "Side ="+ super.getWidth() +'}';
    }
         
}
