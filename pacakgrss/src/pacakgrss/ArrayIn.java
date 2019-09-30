/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pacakgrss;

/**
 *
 * @author ASHISH
 */
import java.util.Scanner;
public class ArrayIn {
     public int a[],n;
    public int q[];public int i;
    Scanner sc = new Scanner(System.in);
    public void input() {
        System.out.println("Enter the size of array :----");
        n=sc.nextInt();
        System.out.println("Enter the elemt of first array");
        for (i=0;i<n;i++)
            a[i]=sc.nextInt();
        System.out.println("Enter the elemt of second array");
        for (i=0;i<n;i++)
            q[i]=sc.nextInt();
    }
    public void show(){
        for (i=0;i<n;i++) {
            System.out.print("elemt of first array"+a[i]);
            System.out.print("elemt of first array"+q[i]);
        }
    }
}
