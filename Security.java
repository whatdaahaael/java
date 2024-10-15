/**
 * Project 1 Program 9
 * Define a class Security having the following description:
 * 
 * Data members       
 * String n to store name
 * int h to store number of hours for which wages to be paid 
 * double r to store the rate of the wages 
 * double w to calculate the wages.
 * 
 * Member functions:
 * Security()         : A parameterized constructor to initialise the data     members i.e. name, rate and number of hours.
 * void calwage()     : Calculate the wage of an employee
 * void display()     : Output details of an employee
 * 
 * Number of hours        Rate
 * Up to 40hrs                Rs. 1   per hour
 * For next 20hrs        Rs. 1.5 per hour
 * For next 20 hrs        Rs. 2   per hour
 * 
 * However, the security is not allowed to work for more than 70 hours a week. 
 * Write a program to compute the wage according to the given conditions and display the output as per the given format.
 * Output:
 * Name        Hours        Wages
 * Xxxxx        xxxx        xxxxx
 * Xxxxx        xxxx        xxxxx
 */
import java.util.*;
public class Security
{
    String n;
    int h;
    double r,w;
    Security()
    {
        Scanner rinput=new Scanner(System.in);
        System.out.println("Enter your name");
        n=rinput.next();
        System.out.println("Enter the number of hours for which wages are to be paid");
        h=rinput.nextInt();
        r=2.0;
        System.out.println("");
    }
    void calwage()
    {
        if(h<=70)
        {
            if(h<=40)
            {
                w=h*(r-1.0);
            }
            else if(h>40&&h<=60)
            {  
                w=(40*(r-1))+((h-40)*(r-0.5));
            }
            else if(h>60&&h<=80)
            {
                w=(40*(r-1.0))+(20*(r-0.5))+((h-60)*r);
            }
        }
        else if(h>70)
        {
            System.out.println("The security is not allowed to work for more than 70 hours a week");
            System.out.println("");
        }
    }
    void display()
    {
        System.out.println("Name"+"\t"+"Hours"+"\t"+"Wages");
        System.out.println(n+"\t"+h+"\t"+w);
    }
    public void main()
    {
        Security obj=new Security();
        obj.calwage();
        obj.display();
    }
}