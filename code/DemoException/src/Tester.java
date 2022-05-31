
import java.io.FileReader;
import java.util.InputMismatchException;
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
        int num;
        boolean loi=false;
        do {
            try {
                Scanner sc = new Scanner(System.in);
                System.out.println("input num:");
                num = sc.nextInt();
                if (num < 0) {
                    throw new InputMismatchException();
                }
                System.out.println("num: " + num);
                loi=false;
            } catch (InputMismatchException e) { 
                System.out.println("Num nis invalid");
                loi=true;
            } catch (Exception ee){ 
                System.out.println("error");
            }
        } while (loi);
        //int mark=Integer.parseInt("5.5a");
        //System.out.println("mark: "+mark);
        //FileReader f=new FileReader("C:/Phi/dethi.txt");
    }
}
