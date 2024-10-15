/**
 * Project 2 Program 8
 * 
 * Write a program to input the age,Gender(male/female) and taxable income of the person. 
 * If the age is more than 65 year or gender is female, display “wrong category”. 
 * If the age is less than or equal to 65 years and the gender is male, compute and display 
 * the income tax payable as per the table given.
 */
import java.util.*;
public class tax_payable_p2p8
{
    int age,income;
    double itax=0.0;//income tax
    String gender;
    public void accept()
    {
        Scanner rinput=new Scanner(System.in);//runtime input
        System.out.println("Enter your gender:");
        gender=rinput.next();
        if(gender.equalsIgnoreCase("female"))
        {
            System.out.println("wrong category");
            System.exit(0);
        }
        else if(gender.equalsIgnoreCase("male"))
        {
            System.out.println("Enter your age:");
            age=rinput.nextInt();
            if(age>65)
            {
                System.out.println("wrong category");
                System.exit(0);
            }
            if(age<=65)
            {
                System.out.println("Enter your income");
                income=rinput.nextInt();
                incometax();
            }
        }
    }
    public void incometax()
    {
        if(income <= 160000)
        {
            itax=0.0;
        }
        else if(income>160000&&income<=500000)
        {
            itax=(income-160000)*10/100;
        }
        else if(income>500000&&income<=800000)
        {
            itax=(income-500000)*20/100;
            itax+=34000;
        }
        else if(income>800000)
        {
            itax=(income-800000)*30/100;
            itax+=94000;
        }
        System.out.println("Income tax payable: "+ itax);
    }
    public void main()
    {
        accept();
    }
}