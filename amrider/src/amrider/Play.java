/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package amrider;

/**
 *
 * @author ASHISH
 */
import java.util.Scanner;
import java.util.Random;
class game {
    int a,b;
    game()
    {
        a=0;
        b=0;
    }
   void generate_no()
    {
        a=(int)(Math.random()*10);
        b=(int)(Math.random()*10);
    }
    String comparsion(int v)
    {
        if (v==(a+b))
            return("win");
        else
            return("looser");
    }
}

/**
 *
 * @author ASHISH
 */
public class Play {

        public static void main(String [] args)
        {    
            System.out.println("Enter number for ");
             Scanner ss =new Scanner(System.in);
             int n = ss.nextInt();
            do{
            game g1=new game();
            g1.generate_no();
            System.out.println("what is the sum of "+g1.a+" and "+g1.b);
            Scanner input =new Scanner(System.in);
            int s1 = input.nextInt();
           String result = g1.comparsion(s1);
            System.out.println(result);
                 n--;  
        }while(n>0);
        }
    }

