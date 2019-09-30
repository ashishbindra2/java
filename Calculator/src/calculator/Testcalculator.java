
package calculator;

import java.util.Scanner;

/**
 *
 * @author ASHISH
 */
public class Testcalculator {
    public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
         int n ;
         float a,b,c;
        do {
            System.out.println("1: for Airthmatic Opration ");
            System.out.println("2: for Logical  Opration ");
            System.out.println("3: for Relation Opration ");
            System.out.println("4: for bitwise Opration ");
            System.out.println("5: for  exit ");
            System.out.println("Enter your choice :--");
           n = sc.nextInt();
          Calculator cc = new Calculator();
         //tc.cal(n);      
            switch(n)
            {
                case 1 : cc.Airthmatic();
                    break;
                case 2 : cc.Logical();
                    break;
                case 3 : cc.Relation();
                    break;
                case 4 : cc.bitwise();
                    break;
                case 5 : System.exit(0);
                    break;
                default : System.out.print("Wrong Choice!!!");
                    break;
            }
            System.out.print("\n---------------------------------------\n");
        }while (n!=5);
        
    }   
} 