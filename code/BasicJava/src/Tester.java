
import java.util.Scanner;

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
    public static void main(String[] args) {
        System.out.println("hom nay toi buon");
     /*   int id=1;
        String name=new String("chi pheo");
       */
        Scanner sc=new Scanner(System.in);
        //nhap id
        System.out.println("input id:");
        int id=sc.nextInt();
        System.out.println("input name:");
        sc=new Scanner(System.in);
        String name=sc.nextLine();
        
        System.out.println("id :" +id);
        System.out.println("name:"  + name);
        
    }
}
