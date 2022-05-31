
import java.io.IOException;
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
public class Tester {
    public static void main(String[] args) throws IOException {
        MyMap m=new MyMap();
        m.init();
        m.displayWords();
        m.addWord("zoo");
        m.addWord("zoo");
        m.addWord("apple");
        m.addWord("anonymous");
        m.displayWords();
        m.removeWord("van");
//        m.removeWord("apple");
//        m.removeWord("internet");
//        System.out.println("-------------");
        System.out.println("After remove");
        m.displayWords();
//        System.out.println("-------------");
//        m.checkWord("a");
//        m.checkWord("apple");
//        m.checkWord("ghi");
//        System.out.println("-------------");
//        TreeSet<String> k=m.getMaxGroup();      
//        System.out.println("Max Group: "+k);
//        System.out.println("-------------");
//        String rs=m.findMaxLength("a");
//        System.out.println("Max Length: "+rs);
//        System.out.println("-------------");
//        rs=m.findMinLength("a");
//        System.out.println("Min Length: "+rs);
//        System.out.println("-------------");
//        System.out.println("PalindromeWords");
//        m.displayPalindromeWords();
//        System.out.println("-------------");
//        m.updateWords("a", "ant");
//        m.updateWords("can", "urgot");
//        m.displayWords();
//        String filename="WordsList.txt";
//        String filename2="Backup.txt";
//        m.init(filename);
//        m.displayWords();
//        m.backup(filename2);
    }
}
