/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Scanner;
        
        
import java.util.Scanner;
/**
 *
 * @author ELCOT
 */
public class sum7div {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("enter the number greater than 100");
        int n=obj.nextInt();
        int sum=0;
        while(n>100 && n<200)
        {
            if(n%7==0)
            {
              sum = sum + n;
              n++;
            }
            else
            {
                n++;
            }
            
        }
        System.out.println(sum);
    }    
        
        
}
    

