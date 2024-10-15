/**
 * Project 1 Program 2
 * 
 * Write a program to accept a four-digit number and arrange the digits of the number in ascending order 
 */
import java.util.*;
public class ascending_order_p1p2
{
    public static void main()
    {
        int unum,cnum,ctr,dnum;//unum=user number, cnum=number check for loop, ctr=counter,dnum=duplicate number
        Scanner rinput=new Scanner(System.in);//rinput=runtime input
        System.out.println("Enter a four digit number");
        unum=rinput.nextInt();
        System.out.println("The numbers in Ascending Order are:");
        for(cnum=0;cnum<=9;cnum++)
        {
            ctr=0;
            dnum=unum;
            while(dnum!=0)
            {
                if(dnum%10==cnum)
                { 
                    ctr++;
                    break;
                }
                dnum=dnum/10;
            }
            if(ctr>=1)
            {
                System.out.print(cnum+" ");
            }
        } 
    } 
}