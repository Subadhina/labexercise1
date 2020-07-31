/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise1;


import java.util.Scanner;
/**
 *
 * @author ELCOT
 */
public class min2Nos {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the number");
        int x=obj.nextInt();
        int y=obj.nextInt();
        int min=(x<y)?x:y;
        System.out.println("The minimum number is:"+min);
        
        }
    }
    

