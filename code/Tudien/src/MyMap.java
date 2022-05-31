
import java.io.IOException;
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
/*
Key:chu cai dau
Value:chua nhom tu co chung chu cai dau
vi du:
key='a'
value="apple", "a", "arm",...
*/
public class MyMap{
    private HashMap<String, TreeSet<String>> h;
    public MyMap(){
        h=new HashMap<>();
    }
    public void init(){
        TreeSet<String> g1=new TreeSet<>();
        g1.add("apple");
        g1.add("a");
        g1.add("arm");
        h.put("a", g1);
        TreeSet<String> g2=new TreeSet<>();
        g2.add("book");
        g2.add("be");
        g2.add("bundle");
        h.put("b", g2);
        TreeSet<String> g3=new TreeSet<>();
        g3.add("could");
        g3.add("can");
        g3.add("cut");
        h.put("c", g3);
    }
    public void init(String filename) throws IOException{
        try{
            ArrayList<String> result=FileDAO.loadData(filename);
            for (char key='a';key<='z';key++){
                TreeSet<String> t=new TreeSet<>();
                h.put(Character.toString(key), t);
            }
            for (String s : result) {
                String k=s.substring(0, 1).toLowerCase();
                TreeSet<String> t=h.get(k);
                if (t!=null)    t.add(s);
            }
        }catch (Exception e){
            //System.out.println("Error");
            e.printStackTrace();
        }
    }
    public void backup(String filename){
        try{
            FileDAO.writeData(filename, h);
            System.out.println("BACKUP Finish !!!");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public void displayWords(){
    Collection<TreeSet<String>> values=h.values();
        for (TreeSet<String> value : values) {
            if (value != null && value.size() > 0) {
                System.out.println("------------");
                for (String string : value) {
                    System.out.println(string);
                }
            }
        } 
    }
    public boolean addWord(String x){
        String k=x.substring(0, 1);
        TreeSet<String> t=h.get(k);
        if (t==null){            
            t=new TreeSet<String>();
            t.add(x);
            h.put(k, t);
            System.out.println("Da chen: "+x);
        }
        else{
            for (String string : t) {
                if(string.equalsIgnoreCase(x)){
                    System.out.println("Khong chen: "+x);
                    return false;
                }
            }
            System.out.println("Da chen: "+x);
            return t.add(x);
        }
        return true;
    }
    public boolean removeWord(String x){
        String k=x.substring(0, 1);
        TreeSet<String> t=h.get(k);
        if (t==null)    return false;
        else{
            for (String string : t) {
                if(string.equalsIgnoreCase(x)){
                    t.remove(string);
                    if(h.get(k).isEmpty()){
                        h.remove(k);
                    }
                    return true;
                }
            }            
        }
        return false;
    }
    
    public boolean checkWord(String x){
        String k=x.substring(0, 1);
        TreeSet<String> t=h.get(k);
        if (t==null){
            System.out.println("Khong co: "+x);
            return false;
        }
        for (String string : t) {
            if(string.equalsIgnoreCase(x)){
                System.out.println("Co: "+x);
                return true;
            }
        }
        System.out.println("Khong co: "+x);
        return false;
    }
    public TreeSet<String> getMaxGroup(){
        int max=0;       
        TreeSet<String> t=new TreeSet<>();
        Collection<TreeSet<String>> values=h.values();
        for (TreeSet<String> value : values) {            
            if(max<value.size()){
                max=value.size();
                t=value;
            } 
        }
        return t;
    }
    public TreeSet<String> getMinGroup(){
        int min=10000000;       
        TreeSet<String> t=new TreeSet<>();
        Collection<TreeSet<String>> values=h.values();
        for (TreeSet<String> value : values) {            
            if(min>value.size()){
                min=value.size();
                t=value;
            } 
        }
        return t;
    }
    public String findMaxLength(String x){
        TreeSet<String> t=h.get(x);
        if (t==null) return "Khong co nhom: "+x;
        String k="";
        for (String string : t) {
            if (k.length()<string.length()){
                k=string;
            }
        }
        return k;
    }
    public String findMinLength(String x){
        TreeSet<String> t=h.get(x);
        if (t==null) return "Khong co nhom: "+x;
        String k=t.first();
        for (String string : t) {
            if (k.length()>string.length()){
                k=string;
            }
        }
        return k;
    }
    public boolean checkPalindromeWords(String x){
        int i=0;
        int j=x.length()-1;
        while (i<=j){
            if (x.charAt(i)!=x.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
    public void displayPalindromeWords(){
        Collection<TreeSet<String>> values=h.values();
        for (TreeSet<String> value : values) {
            for (String string : value) {
                if (checkPalindromeWords(string)){
                    System.out.println(string);
                }
            }
        }
    }
    public boolean updateWords(String oldWords,String newWords){
        if (!checkWord(oldWords)) return false;
        String k=oldWords.substring(0, 1);
        TreeSet<String> t=h.get(k);
        String k1=newWords.substring(0, 1);
        TreeSet<String> t1=h.get(k);
        removeWord(oldWords);
        addWord(newWords);
        return true;
    }
}
