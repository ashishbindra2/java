
package amrider;

import java.util.Scanner;
import java.util.Random;
class Game {
    //int a,b;
    byte number;
    Game()
    {
        number=0;
    }
   void generate_no()
    {
        number=(byte)(Math.random()*100);
       
    }
    String comparsion(int v)
    {
        if (v==(number))
            return("win");
        else
            return("looser");
    }
}



public class lottery {

        public static void main(String [] args)
        {    
            
            Game g1 = new Game();
            g1.generate_no();
            System.out.println("what is the sum of "+g1);
            Scanner input =new Scanner(System.in);
            int s1 = input.nextInt();
            String result = g1.comparsion(s1);
            System.out.println(result);
           
        }
    }



