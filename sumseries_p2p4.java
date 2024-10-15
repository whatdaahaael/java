/**
 * Project 2 Program 4
 * WAP to compute the sum of the given series:
 * (1+2)+ (1+2+3) + (1+2+3+4) +……… (1+2+3+……………+n)
 *
 */
import java.util.*;
public class sumseries_p2p4
{
    public static void main()
    {
        int loop,sum=1,fsum=0,n;//where sum has 1 because in the question it says from ("1"+2),fsum=final sum, n=user input
        Scanner rinput=new Scanner(System.in);//rinput=runtime input
        System.out.println("Enter a Number");
        n=rinput.nextInt();
        for(loop=2;loop<=n;loop++)//loop start from 2 because in the question it says from (1+"2")...
        {
            sum=sum+loop;
            fsum=fsum+sum;
        }
        System.out.println("The Sum is:"+fsum);
    }
}
