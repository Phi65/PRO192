/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import dto.Item;
import dto.Painting;
import dto.Statue;
import dto.Vase;
import java.util.Scanner;
import mylib.Validation;

/**
 *
 * @author Razer Blade
 */
public class AntiqueShop {

    public static void main(String[] args) {
//        Item item = null;
//        int choice = 0;
//        do {
//            System.out.println("1. Create a Vase:");
//            System.out.println("2. Create a Statue:");
//            System.out.println("3. Create a Painting:");
//            System.out.println("4. Display the Item:");
//            System.out.println("5. Exit");
//            try {
//                choice = Validation.inputInteger("Input a choice");
//            } catch (Exception e) {
//                System.out.println("Choice is invalid");
//            }
//            switch (choice) {
//                case 1:
//                    item = new Vase();
//                    ((Vase) item).inputVase();
//                    break;
//                case 2:
//                    item = new Statue();
//                    ((Statue) item).inputStatue();
//                    break;
//                case 3:
//                    item = new Painting();
//                    ((Painting) item).inputPainting();
//                    break;
//                case 4:
//                    if (item != null) {
//                        if (item instanceof Vase) {
//                            ((Vase) item).outVase();
//                        } else if (item instanceof Statue) {
//                            ((Statue) item).outStatue();
//                        } else if (item instanceof Painting) {
//                            ((Painting) item).outPainting();
//                        }
//                    } else {
//                        System.out.println("you need to create an object");
//                    }
//                    break;
//            }
//        } while (choice <= 4);
        Item item=null;
        item=new Vase();
        item.inputItem(); 
        item.outItem();
        System.out.println("toString: "+item.toString());
    }
}
