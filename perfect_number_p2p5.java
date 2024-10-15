/**
 * Project 2 Program 5
 * Write the program to find perfect number between 1 to1000. 
 * Perfect numbers are those numbers whose sum of the factors excluding itself is equal to the original number
 */
public class perfect_number_p2p5
{
    public static void main()
    {
        int num,fnum,pnum;//where num=numbers, fnum=factor numbers, pnum=prime numbers
        System.out.println("The Perfect Numbers Between 1 to 1000 are:");
        for(num=1;num<=1000;num++)
        {
            pnum=0;
            for(fnum=1;fnum<num;fnum++)
            {
                if(num%fnum==0)
                {
                    pnum=pnum+fnum;
                }
            }
            if(pnum==num)
            {
                System.out.println(pnum);
            }
        }
    }
}