/** Project 2 Porgram 2(P2P2)
 *  Write a program to calculate the sum of the following series
 *  S=1+1/2! +1/3!..................1/n! (Read the value of ‘n’ at run time)
 */
import java.util.*;
public class sumseries_p2p2
{
    public static void main()
    {
        Scanner rinput= new Scanner(System.in);
        int uinput;
        double S=1,n;
        System.out.println("Enter a Number");
        uinput=rinput.nextInt();
        for(n=2;n<=uinput;n++)
        {
            S=S+1/n;
        }
        System.out.println("The Sum of the series is="+S);
    }
}