/**
 * Project 2 Program 13
 * Write a program to find the smallest digit of an integer
 */
import java.util.*;
public class smallest_number_p2p13
{
    public static void main()
    {
        int unum,snum,rnum;//wher unum=user number,snum=smallest number
        Scanner rinput=new Scanner(System.in);
        System.out.println("Enter a Number");
        unum=rinput.nextInt();
        snum=unum%10;
        unum=unum/10;
        while(unum>0)
        {
            rnum=unum%10;
            if(rnum<snum)
            {
                snum=rnum;
            }
            unum=unum/10;
        }
        System.out.println("The smallest number is: "+snum);
    }
}