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
public class NotoWord {
    public static void main(String[] args) {
        int x,s=0,r,a=0;
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the n value");
        int n=obj.nextInt();
        while(n!=0)
        {
            r=n%10;
            s=(s*10)+r;
            n=n/10;    
        }
        while(s!=0)
        {
            r=s%10;
            s=s/10;
            if(r==0)
                System.out.println("zero");
            else if(r==1)
                System.out.println("one");
            else if(r==2)
                System.out.println("two");
            else if(r==3)
                System.out.println("three");
            else if(r==4)
                System.out.println("four");
            else if(r==5)
                System.out.println("five");
            else if(r==6)
                System.out.println("six");
            else if(r==7)
                System.out.println("seven");
            else if(r==8)
                System.out.println("eight");
            else
                System.out.println("nine");
        
        
        }
            
            
        }
    }
    

