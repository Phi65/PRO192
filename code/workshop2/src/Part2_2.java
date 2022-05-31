
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
public class Part2_2 {
    public String inputString(String patern) throws Exception
    {
        String s="";
        Scanner sc=new Scanner(System.in);
        System.out.println("Input the string");
        s=sc.nextLine();
        if (!s.matches(patern))   throw new Exception();
        return s;
    }
    public static void main(String[] args) {  
        Part2_2 obj=new Part2_2();
        boolean kt=false;
        do{
            try{
                String s=obj.inputString("^SE[0-9][0-9][0-9]$");
                System.out.println("The string is: "+s);
                kt=false;
            }catch(Exception e){
                System.out.println("The string is invalid");
                kt=true;
            }
        }while (kt);
    }
}
