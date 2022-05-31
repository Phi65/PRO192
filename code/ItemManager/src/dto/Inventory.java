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
public class Inventory {
    private Item[] arr;
    private int count;
    private final int max=5;
    
    public Inventory() {
        arr=new Item[max];
        count=0;
    }
    
    public boolean addItem(Item it){
        if (count>=max) return false;
        arr[count]=it;
        count++;
        return true;
    }

    public int getCount() {
        return count;
    }
    
    public int findItembyValue(int value){
        for (int i=0;i<count;i++){
            if (arr[i].getValue()==value)   return i;
        }
        return -1;
    }
    
    public boolean updateItembyIndex(int index){
        if (index<0 || index>=count) return false;
        arr[index].inputItem();
        return true;
    }
    
    public Item removeItembyIndex(int index){
       if (index<0 || index>=count) return null;
       Item tmp=arr[index];
       for (int i=index;i<count;i++){
           arr[i]=arr[i+1];
       }
       count--;
       return tmp;
    }
    
    public void sortbyValue(){
        for (int i=0;i<count;i++){
            for(int j=i+1;j<count;j++){
                if (arr[i].getValue()>arr[j].getValue()){
                    Item tmp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=tmp;
                }
            }
        }
    }
    
    public void displayAll(){
        for (int i=0;i<count;i++){
//            System.out.println(arr[i].getValue());
//            System.out.println(arr[i].getCreator());
//            if (arr[i] instanceof Vase){
//                System.out.println(((Vase)arr[i]).getHeight());
//                System.out.println(((Vase)arr[i]).getMaterial());
//            }
//            else if (arr[i] instanceof Statue){
//                System.out.println(((Statue)arr[i]).getWeight());
//                System.out.println(((Statue)arr[i]).getColour());
//            }
            arr[i].outItem();
        }
    }
    
}
