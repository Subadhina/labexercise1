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
public class harmonic {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the limit of harmonic series");
        int n=obj.nextInt();
        int i,j=1;
        double sum=0;
        for(i=0;i<n;i++)
        {
            sum  = sum + (double) 1 / j;
            j++;
        }
        System.out.println("The harmonic series is:"+sum);
        
        }
    }
    

