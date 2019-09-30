import java.util.Scanner;
/**
 *
 * @author ASHISH
 */
public class Switch {
    public static void main(String[] args){
     boolean x = false;
     boolean y = false;
        int j;
        System.out.println("Enter the oprator to perform operation:--");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        switch(s)
        {
            case "&" :
            {
                 System.out.println("x\t y\t x&&y");
                 for(int i = 1 ;i<=4;i++  )
                 {
                    for (j = 1 ;j<2;j++ )
                    {
                        System.out.print(x+"\t");
                        System.out.print(y+"\t");
                    }
                if (j == 2)
                    System.out.println(x&&y);
                y = !y;
                if ( i == 2)
                 x=!x;
                 }
            }
            break;
            case "|" :
            {
                 System.out.println( "x\t y\t x||y" );
                 for(int i = 1 ;i<=4;i++  )
                 {
                    for (j = 1 ;j<2;j++ )
                    {
                        System.out.print(x+"\t");
                        System.out.print(y+"\t");
                    }
                if (j == 2)
                    System.out.println(x||y);
                y = !y;
                if ( i==2)
                 x=!x;
                 }
            } break;
            case "!" :
            {
                 System.out.println("x\t y\t !x \t !y");
                 for(int i = 1 ;i<=4; i++  )
                 {
                    for (j = 1 ;j<2; j++ )
                    {
                        System.out.print(x+"\t");
                        System.out.print(y+"\t");
                    }
                if (j == 2)
                    System.out.print(!x+"\t"+!y);
                     System.out.println(" ");
                y = !y;
                if ( i==2)
                 x=!x;
                 }
            } break;
            case "^" :
            {
                 for(int i = 1 ;i<=4; i++  )
                 {
                    for (j = 1 ;j<2;j++ )
                    {
                        System.out.print(x+"\t");
                        System.out.print(y+"\t");
                    }
                if (j == 2)
                    System.out.println(x^y);
                y = !y;
                if ( i==2 )
                 x=!x;
                 }
            } break;
            default:
                System.out.println("Please Enter valid operator:--");
        }  
    }
}
