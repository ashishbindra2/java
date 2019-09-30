/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testt;

/**
 *
 * @author ASHISH
 */
public class Testt {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          int x = 0;    int y = 0;
         while ( x < 5 ) {
             y = x - y;
       System.out.print(x + "" + y +" ");   
       x = x + 1; 
         } 
    }
    
}
