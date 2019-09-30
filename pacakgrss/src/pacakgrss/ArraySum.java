package pacakgrss;


public class ArraySum {
    ArrayIn aa= new ArrayIn();
    public int c[];
    public void SumArray(){
        aa.input();
        for (aa.i=0;aa.i<aa.n;aa.i++)
        {
            c[aa.i] = aa.a[aa.i]+aa.q[aa.i];
            // System.out.println();
        }
        aa.show();
    }
    public void display(){
        for (aa.i=0;aa.i<aa.n;aa.i++)
        {
            aa.show();
            //c[aa.i] = aa.a[aa.i]+aa.q[aa.i];
             System.out.println(c[aa.i]);
        }
    }

}
