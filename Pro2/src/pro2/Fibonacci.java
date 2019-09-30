/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pro2;

import java.util.Scanner;

/**
 *
 * @author ASHISH
 */
public class Fibonacci {
     public static void main(String[] args)
    {
        int i=1,n,t1=0,t2=1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n");
        n = sc.nextInt();
        System.out.println("first "+n+" term");
        while(i<=n)
        {
                System.out.print(t1 +" \t");
                int sum=t1+t2;
                t1=t2;
                t2=sum;
                i++;
         }
    }
}
