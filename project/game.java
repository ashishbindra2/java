import java.util.Scanner;
public class game {
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
    Class play()
    {
       public static void main(String[] args)
        {
            game g1=new game();
            g1.generate_no();
            System.out.println("what is the sum of"+g1.a+"and"+g1.b);
            Scanner input =new Scanner(System.in);
            int s1=input.nextInt();
            String result=g1.comparsion(s1);
            System.out.println(result);
        }
}
