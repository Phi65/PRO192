/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import dto.Inventory;
import dto.Item;
import dto.Painting;
import dto.Statue;
import dto.Vase;
import mylib.Validation;

/**
 *
 * @author Razer Blade
 */
public class Store {
    public static void main(String[] args) {
        int choice=0;
        Inventory khohang=new Inventory();
        do{
            System.out.println("1. Add a vase to the inventory");
            System.out.println("2. Add a statue to the inventory");
            System.out.println("3. Add a painting to the inventory");
            System.out.println("4. Display all items the inventory");
            System.out.println("5. Update the item by index");
            System.out.println("6. Remove the item from the inventory");
            System.out.println("7. Sort the inventory by value");
            try {
                choice = Validation.inputInteger("Input a choice");
            } catch (Exception e) {
                System.out.println("Choice is invalid");
            }
            switch(choice){
                case 1:
                    Item it=new Vase();
                    it.inputItem();
                    if (khohang.addItem(it)) System.out.println("Added");
                    else System.out.println("Add failed");
                    break;
                case 2:
                    it=new Statue();
                    it.inputItem();
                    if (khohang.addItem(it)) System.out.println("Added");
                    else System.out.println("Add failed");
                    break;
                case 3:
                    it=new Painting();
                    it.inputItem();
                    if (khohang.addItem(it)) System.out.println("Added");
                    else System.out.println("Add failed");
                    break;
                case 4:
                    if (khohang.getCount()==0)  System.out.println("The inventory is empty");
                    else khohang.displayAll();
                    break;
                case 5:
                    int index;
                    try {
                        index = Validation.inputInteger("Input a index to update");
                        if (khohang.updateItembyIndex(index)){
                            System.out.println("After update");
                            khohang.displayAll();
                        }
                        else System.out.println("no update");
                    } catch (Exception e) {
                        System.out.println("Error");
                    }
                    break;
                case 6:
                    try {
                        index = Validation.inputInteger("Input a index to remove");
                        Item tmp=khohang.removeItembyIndex(index);
                        if (tmp!=null){
                            System.out.println("After remove");
                            khohang.displayAll();                        
                        }else System.out.println("no remove");
                    } catch (Exception e) {
                        System.out.println("Error");
                    }
                    break;
                case 7:
                    System.out.println("After sorting");
                    khohang.sortbyValue();
                    khohang.displayAll();
                    break;
            }
        }while(choice<=7);
          
    }
}
