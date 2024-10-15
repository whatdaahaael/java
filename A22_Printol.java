/**
 *
 * Assignment 22
 *Define a class to overload the method print () as follows:
 * (i) void print (int n) - prints all the factors of n, excluding itself.
 * (ii) boolean print (int x, int y) - returns true, if square of x is equal to y,
 * otherwise returns false.
 * (iii) void print () - display the following pattern
 * ABCDE
 * CDEF
 * EFG
 * GH
 * I
 *
 */
public class A22_Printol
{
    // Prints factors of n, excluding itself.
    void print(int n)
    {
        System.out.println("The factors of "+n+" are:");
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                if(n!=i)
                    System.out.print(i);
            }
        }
        System.out.print("\n");
    }
    // Returns true, if square of x is equal to y. otherwise returns false
    boolean print(int x, int y)
    {
        if(Math.pow(x,2)==y)
        {
            return true;
        }
        else
            return false;
    }
    // Displays a pattern
    void print()
    {
        char ch='A';
        for(int i=5;i>=1;i--)
        {
            char nch=ch;
            System.out.print("\n");
            for(int j=1;j<=i;j++)
            {
                System.out.print(nch++);
            }
            ch++;
            ch++;
        }
    }
    public void main()
    {
        print(4);
        System.out.println(print(3,9));
        print();
    }
}