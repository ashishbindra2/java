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
public class Exception_handle {
    public static void main(String []args) {
		try {
			int arr[]=new int[10];
			int a=0,b=6;
			arr[11]=30;
			arr[3]=12;
			arr[5]=32;
			System.out.println(arr[3]+arr[5]);
			System.out.println(arr[11]);
			
			
			
		}
		catch(NullPointerException e) {
			System.out.println("Null pointer");
			
		}
		
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Array index Out of Bound");
			
		}
		finally {
			
			System.out.println("Uncaughtable Exception");
		}

		
	}
}
