/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package truthta;
/**
 *
 * @author ASHISH
 */
public class Truthta {

    public static void main(String[] args) {
        // TODO code application logic here
        boolean x = false;
        boolean y = false;
        int j;
        System.out.println("x\t y\t x&&y \t x||y \t !x \t !y");
        for(int i = 1 ;i<=4;i++  ){
            for (j = 1 ;j<2;j++ ){
                    System.out.print(x+"\t");
                    System.out.print(y+"\t");
            }
            if (j == 2)
                System.out.println((x&&y)+"\t"+(x||y)+"\t"+(!x)+"\t"+(!y));
            y = !y;
            if ( i==2){
                x=!x;
            }
        }
    }
}
