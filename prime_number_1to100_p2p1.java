/**
 * Project 2 Porgram 1(P2P1)
 * Write a Program to print all the Prime number between 10 to 100
 * 
 */
public class prime_number_1to100_p2p1
{
    public static void main()
    {
        int pnum=0;//prime number
        int fnum=0;//factor number
        System.out.println("Prime numbers for 1 to 100 are:");
        for(pnum=1;pnum<+100;pnum++)
        {
            int counter=0;
            for(fnum=pnum;fnum>=1;fnum--)
            {
                if(pnum%fnum==0)
                {
                    counter=counter+1;
                }
            }
            if(counter==2)
            {
                System.out.println(pnum);
            }
        }
    }
}



