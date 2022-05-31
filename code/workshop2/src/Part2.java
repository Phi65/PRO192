
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
public class Part2 {
    public static void main(String[] args) {
        boolean kt=false;
        do{
            try{
                String s="";
                String patern="^SE[0-9][0-9][0-9]$";
                Scanner sc=new Scanner(System.in);
                System.out.println("Enter the string:");
                s=sc.nextLine();
                if (!s.matches(patern))   throw new Exception();             
                System.out.println("The string is: "+s);
                kt=false;
            }catch(Exception e){
                System.out.println("The string is invalid");
                kt=true;
            }
        }while(kt);
    }
}
