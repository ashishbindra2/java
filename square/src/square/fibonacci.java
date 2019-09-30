import java.util.Scanner;
public class fibonacci 
{
    public static void main(String[] args)
    {
        Scanner num=new Scanner(System.in);
        System.out.println("Enter nth term");
        int n=num.nextInt();
        int i=1,t1=0,t2=1;
        System.out.println("first"+num+"term");
        while(i<=n)
        {
                System.out.print(t1 +" \t");
                int sum=t1+t2;
                t1=t2;
                t2=sum;
                i++;
         }
    }
}
