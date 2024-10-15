/**
 * Project 1 Program 11
 * N is a perfect number if the sum of all factors of the number (including 1 but excluding the number) 
 * is equal to N (for e.g. 6 = 1+2+3). N is a prime number if it is divisible by 1 and itself. 
 * Define a class numProblem that has the following functions. 
 * int nthPrime(int N)          -> which return the nth prime number(first prime number is 2) (e.g. 3rd prime number is 5) 
 * void perfectNosBelow(int N)  -> which first print out the nth prime number and 
 * then print out all perfect numbers less than the nth prime number.
 */
import java.util.Scanner;
public class numProblem
{
    int nthPrime(int N)
    {
        int ctr = 0,Prime = 2;
        while (true)
        {
            boolean flag = true;
            for ( int i = 2;i<Prime;i++)
            {
                if ( Prime%i == 0)
                {
                    flag = false;
                    break;
                }
              }
            if ( flag == true) 
            {
                ctr++;
            }
            if ( ctr == N) 
            {
                break;
            }
            Prime++;
        }
        return (Prime);
    }
    void perfectNosBelow(int N)
    {
        System.out.println("The nth prime number is: "+N+"\n");
        System.out.println("All perfect numbers less than the "+N+" nth prime number are :");
        for(int i=1;i<N;i++)
        {
            int sum = 0;
            for( int j=1;j<i;j++)
            {
                if(i%j==0)
                {
                    sum+= j;
                }
            }
            if(sum==i)
            {
                System.out.println(i);
            }
        }
    }
    public void main()
    {
        Scanner rinput=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=rinput.nextInt();
        int pnb=nthPrime(num);
        perfectNosBelow(pnb);
    }
}