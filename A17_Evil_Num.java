/**
 *
 * Assignment 17
 * An Evil number is a positive whole number which has even number of 1's
 * in its binary equivalent. Example: Binary equivalent of 9 is 1001,
 * which contains even number of l's. Thus, 9 is an Evil Number.
 * A few Evil numbers are 3, 5, 6, 9.... Design a program to accept a
 * positive whole number 'N' where N>2 and N<100. Find the
 * binary equivalent of the number and count the number of ls in it
 * and display whether it is an Evil number or not with an appropriate
 * message. Test your program with the following data and some random data:
 * Example 1
 * INPUT: N = 15
 * BINARY EQUIVALENT: 1111
 * NUMBER OF 1's: 4
 * OUTPUT: EVIL NUMBER
 * Example 2:
 * INPUT: N = 26
 * BINARY EQUIVALENT: 11010
 * NUMBER OF 1's: 3
 * OUTPUT: NOT AN EVIL NUMBER
 * 
 */
import java.util.*;
public class A17_Evil_Num
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int num=in.nextInt();
        String bstr="";
        int ctr=0;
        // Gets the binary count and the count of 1's
        while(num>0)
        {
            int x=num%2;
            if(x==1)
            {
                ctr++;
            }
            bstr=num%2+bstr;
            num=num/2;
        }
        System.out.println("BINARY EQUIVALENT: "+ bstr);
        System.out.println("Number of 1's: "+ ctr);
        if(ctr%2==0)
        {
            System.out.println("EVIL NUMBER");
        }
        else
            System.out.println("NOT AN EVIL NUMBER");
    }
}