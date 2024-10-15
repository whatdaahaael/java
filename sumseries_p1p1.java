/**
 * Project 1 Program 1
 *
 * Write a program in Java to find the sum of the given series...
 */
public class sumseries_p1p1
{
    public static void main()
    {
        int n;
        double S=0;
        for(n=10;n>0;n--)
        {
            S=S+n/n;
        }
        System.out.println("The Sum of the series is="+S);
    }
} 