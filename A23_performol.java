/**
 *
 * Assignment 23
 * Define a class to overload the method perform() as follows:-
 * (i) void perform () - display the following pattern
 * 1
 * 23
 * 456
 * 78910
 * (ii) boolean perform (int n) - to check whether the input number is abundant number or not.
 * An Abundant number is a number for which the sum of its proper factors is greater than the number itself.
 * Example:
 * Consider the number 12.
 * Factors of 12 = 1, 2, 3, 4, 6 Sum of factors = 1 + 2 + 3 + 4 + 6 = 16
 * As 16 > 12 so 12 is an Abundant number
 * (iii) void perform(int a, char ch) - which accepts one integer and one character argument finds and
 * displays the square root of a if ch is 's' or 'S' otherwise finds and displays the cube root of a.
 *
 */
public class A23_performol
{
    // Displays a pattern
    void perform()
    {
        int num=1;
        for(int i=1;i<=4;i++)
        {
            System.out.println();
            for(int j=1;j<=i;j++)
            {
                System.out.print(num++);
            }
        }
        System.out.println();
    }
    // Checks if a number is an Abundant number
    boolean perform(int n)
    {
        int num=0;
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                num+=i;
            }
        }
        return (num>n)?true:false;
    }
    void perform(int a, char ch)
    {
        if(ch=='s'||ch=='S')
        {
            System.out.println(Math.sqrt(a));
        }
        else
            System.out.println(Math.cbrt(a));
    }
    public void main()
    {
        perform();
        System.out.println(perform(12));
        perform(3, 's');
    }
}