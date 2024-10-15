/**
 * Project 2 Program 6
 * Design a class to overload function series()...
 *  
 */
import java.util.*;
public class fuction_overloard_series_p2p6
{
    void series(int x,int n)
    {
        int pnum;//power number in loop
        double total=0;
        for(pnum=1;pnum<=n;pnum++)
        {
            total=total+Math.pow(x,pnum);
        }
        System.out.println(total);
    }
    void series(int p)
    {
        int num;
        double total=0;
        for(num=1;num<=p;num++)
        {
            total=total+(Math.pow(num,3)-1);
        }
        System.out.println(total);
    }
    void series()
    {
        int dnum;//denominator number
        double total=0.0;
        for(dnum=2;dnum<=10;dnum++)
        {
            total+=1.0/dnum;
        }
        System.out.println(total);
    }
    public void main()
    {
        int n1,n2,n3;
        Scanner rinput=new Scanner(System.in);
        System.out.println("Enter First Number");
        n1=rinput.nextInt();
        System.out.println("Enter Second Number");
        n2=rinput.nextInt();
        System.out.println("Enter Third Number");
        n3=rinput.nextInt();
        series(n1,n2);
        series(n3);
        series();
    }
}