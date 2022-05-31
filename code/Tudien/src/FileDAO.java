
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.TreeSet;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Razer Blade
 */
public class FileDAO {
    public static ArrayList<String> loadData(String filename) throws IOException{
        FileReader f=new FileReader(filename);
        BufferedReader bf=new BufferedReader(f);
        ArrayList<String> result=new ArrayList<>();
        while (bf.ready()){
            String s=bf.readLine();
            s=s.trim();
            if (s.length()>0){
                result.add(s);
            }            
        }
        f.close();
        bf.close();
        return result;
    }
    public static void writeData(String filename, HashMap<String, TreeSet<String>> h) throws IOException{
        PrintWriter w=new PrintWriter(filename);
        Collection<TreeSet<String>> values=h.values();
        for (TreeSet<String> value : values) {
            if (value!=null && value.size()>0){
                for (String string : value) {
                    w.println(string);
                }
            }
        }
        w.close();
    }
}
