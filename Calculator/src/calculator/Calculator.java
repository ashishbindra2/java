package calculator;
/**
 *
 * @author ASHISH
 */
import  java.util.Scanner;
public class Calculator {
   
    Scanner sc1 = new Scanner(System.in);
  
   double a,b,c;
public void Airthmatic(){
    System.out.println("Please Select Operation to Perform:");
        System.out.println("1-Addition");
        System.out.println("2-Subtraction");
        System.out.println("3-Division");
        System.out.println("4-Multiplication");
         int n = sc1.nextInt();
     switch(n)
            {
                case 1 :  System.out.print("Enter Two Number : ");
                    a = sc1.nextFloat();
                    b = sc1.nextFloat();
                    c = a + b;
                    System.out.print("Result = " + c);
                    break;
                case 2 : System.out.print("Enter Two Number : ");
                    a = sc1.nextFloat();
                    b = sc1.nextFloat();
                    c = a - b;
                    System.out.print("Result = " + c);
                    break;
                case 3 : System.out.print("Enter Two Number : ");
                    a = sc1.nextFloat();
                    b = sc1.nextFloat();
                    c = a * b;
                    System.out.print("Result = " + c);
                    break;
                case 4 : System.out.print("Enter Two Number : ");
                    a = sc1.nextFloat();
                    b = sc1.nextFloat();
                    c = a / b;
                    System.out.print("Result = " + c);
                    break;
                case 5 : System.exit(0);
                    break;
                default : System.out.print("Wrong Choice!!!");
                    break;
            }
                
}public void Logical(){
     boolean x = false;
        boolean y = false;
        int j;
        System.out.println("x\t y\t x&&y \t x||y \t !x \t !y");
        for(int i = 1 ;i<=4;i++  ){
            for (j = 1 ;j<2;j++ ){
                    System.out.print(x+"\t");
                    System.out.print(y+"\t");
            }
            if (j == 2){
                System.out.print((x&&y)+"\t"+(x||y)+"\t"+(!x)+"\t"+(!y));
            }
            System.out.print("\n");
            y = !y;
            if ( i==2){
                x=!x;
            }
        }
}public void Relation(){
  System.out.print("Enter Two Number : ");
                    a = sc1.nextFloat();
                    b = sc1.nextFloat();
  System.out.print("Enter a operator : ");
        String c= sc1.next();
        switch(c){
            case ">":
                if (a > b)
                    System.out.println("a is greater than b");
                else 
                    System.out.println("a is less than or equal to b");
                break;
            case ">=":
                if (a >= b)
                    System.out.println("a is greater than or equal to b");
                else 
                    System.out.println("a is lesser than b");
                break;
            case "<" :
                if (a < b)
                    System.out.println("a is less than b");
                else 
                    System.out.println("a is greater than or equal to b");
                break;
            case "<=" :
                if (a <= b)
                    System.out.println("a is lesser than or equal to b");
                else 
                    System.out.println("a is greater than b");
                break;
            case "==" :
                if (a == b)
                    System.out.println("a is equal to b");
                else 
                    System.out.println("a and b are not equal");
                break;
                 case "!=" :
                if (a != b)
                    System.out.println("a is not equal to b");
                else 
                    System.out.println("a is equal b");
                break;
                 default:
                     System.out.println("Please enter valid oprator ");
}
}public void bitwise()
{
    System.out.print("Enter Two Number : ");
                 int x = sc1.nextInt();
                 int  y = sc1.nextInt();
    System.out.println("Please Select Operation to Perform:");
        System.out.println("&");
        System.out.println("!");
        System.out.println(">>");
        String n = sc1.next();
        switch(n)
            {
                case "&" :
                    System.out.print("Result = " + (x&y));
                    break;
                case "!" : 
                    System.out.print("Result = " + ((x)|(y)));
                    break;
                case ">>" :
                    System.out.print("Result = " + (x>>1));
                    break;
                case " " : System.exit(0);
                    break;
                default : System.out.print("Wrong Choice!!!");
                    break;
            }
}
            
}