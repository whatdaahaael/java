/**
 * Project 1 Program 4
 * Write a program in Java to convert a binary number (base 2) to its decimal (base 10) equivalent.  
 */
import java.util.*;
public class binary_decimal_p1p4
{
    public static void main()
    {
        int bnum,dnum=0,b=0;
        Scanner rinput=new Scanner(System.in);
        System.out.println("Enter the binary number:");
        bnum=rinput.nextInt();
        int dunum=bnum;
        while(bnum>=1 &&bnum>=0)
        {
            int a=  bnum%10;
            dnum=dnum+(int)(a*Math.pow(2,b));
            b=b+1;
            bnum=bnum/10;
        }
        System.out.println("The decimal (base 10) qequivalent of binary number (base 2) "+dunum+" is: "+dnum);
    }
}