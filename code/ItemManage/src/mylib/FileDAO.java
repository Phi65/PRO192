/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mylib;

import dto.Item;
import dto.Statue;
import dto.Vase;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;

/**
 *
 * @author Razer Blade
 */
public class FileDAO {
    public static ArrayList<Item> loadData(String filename) throws IOException{
       ArrayList<Item> rs=new ArrayList<>();
       FileReader f=new FileReader(filename);
       BufferedReader bf=new BufferedReader(f);
       while (bf.ready()){
           String s=bf.readLine();
           String[] a=s.split("-");
           if (a.length>=5){
               Item it=null;
               if (a[a.length-1].equals("1")){
                   //vase
                   it =new Vase(Integer.parseInt(a[2]),a[3],Integer.parseInt(a[0]),a[1]);
               }
               else if (a[a.length-1].equals("2")){
                   //statue
                   it =new Statue(Integer.parseInt(a[2]),a[3],Integer.parseInt(a[0]),a[1]);
               }
               else{
                   //painting
               }
               rs.add(it);
           }
       }
       f.close();
       bf.close();
       return rs;
    }
    public static void writeData(String filename,ArrayList<Item> list) throws IOException{
        PrintWriter w=new PrintWriter(filename);
        for (Item item : list) {
            if(item instanceof Vase){
                w.print(item.getValue()+"-"+item.getCreator()+"-"+((Vase)item).getHeight()+"-"+((Vase) item).getMaterial()+"-1");          
            }
            else if(item instanceof Statue){
                w.print(item.getValue()+"-"+item.getCreator()+"-"+((Statue)item).getWeight()+"-"+((Statue) item).getColour()+"-2");          
            }
            
        }
        w.close();
    }
    
    public static ArrayList<Item> loadByteData(String filename) throws Exception{
        File file=new File(filename);
        if (!file.exists()){
            FileOutputStream tmp=new FileOutputStream(filename);
            tmp.close();
        }
        FileInputStream f=new FileInputStream(filename);
        ArrayList<Item> rs=new ArrayList<>();
        if (f.available()>0){
            ObjectInputStream ff=new ObjectInputStream(f);
            rs=(ArrayList<Item>)ff.readObject();
            ff.close();
        }
        f.close();
        return rs;
    }
    public static void writeByteData(String filename,ArrayList<Item> list) throws Exception{
        FileOutputStream f= new FileOutputStream(filename);
        ObjectOutputStream ff=new ObjectOutputStream(f);
        
        ff.writeObject(list);
        
        f.close();
        ff.close();
    }
    
}
    
