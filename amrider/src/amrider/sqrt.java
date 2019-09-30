package amrider;
import java.util.Scanner;
import java.util.SortedSet;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

class Coordinate{
    private double x,y;
    Coordinate(){
        x = 0;
        y = 0;
    }
    Coordinate(double x,double y){
            this.x = x;
            this.y = y;
    }
    void geerate(){
         x = (Math.random()*100);
         y = (Math.random()*100);
        
    }
   
   
     
   void setX( int X){x = X;}
   void setY(int Y) { y = Y;}
   double getX()    { return x;}
   double getY()    {return y;}

   double  sqr(double x2,double y2){
       
        double a,z,result;
        a = ((x2-x)*(x2-x));
        z =((y2-y)*(y2-y));
        result= Math.sqrt(a+z);
        return result; 
 }
   
}
public class sqrt {
    public static void main(String[] args) {
         double x2, y2 ;
        Scanner sc = new Scanner(System.in);
        Coordinate c= new Coordinate();
        
        String x= JOptionPane.showInputDialog("Please input the value of x2: ");
        x2= Double.parseDouble(x);
        String y= JOptionPane.showInputDialog("Please input the value of Y2: ");
        y2 = Double.parseDouble(y);
        c.geerate();
        JOptionPane.showMessageDialog(null,"The value of X1:"+c.getX()+"\nThe value of Y1:"+c.getY()+"\nThe value of X2:"+x2+"\nThe value of Y2:"+y2,"Points",JOptionPane.PLAIN_MESSAGE);
        JOptionPane.showMessageDialog(null,"The result is "+c.sqr(x2, y2),"Result",JOptionPane.PLAIN_MESSAGE);
       
    }
}
