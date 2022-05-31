
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
public class Part3 {
    public static void main(String[] args) {
        String list[];
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap so sinh vien:");
        n=sc.nextInt();
        list=new String[n];
        for(int i=0;i<n;i++){
            System.out.println("Nhap ten sinh vien:");
            sc=new Scanner(System.in);
            list[i]=sc.nextLine();
        }
        for(int i=0;i<n;i++){
            System.out.println("Ten sinh vien: " +list[i].toUpperCase());
        }
    }
}
