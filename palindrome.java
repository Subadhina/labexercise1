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
public class palindrome {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the integer value");
        int n=obj.nextInt();
        int r,s=0,x;
        x=n;
        while(n!=0)
        {
            r=n%10;
            s=(s*10)+r;
            n=n/10;
        }
        if(x==s)
        {
            System.out.println("Number is palindrome");
        }
        else
        {
            System.out.println("Number is not a palindrome");
        }
    }
    
}
