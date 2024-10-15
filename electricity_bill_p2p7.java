/**
 * Project 2 Program 7
 * Write a program to input consumer’s name, consumer number and the unit’s consumed. 
 * The program should display the following information at the time of receiving the money receipt as: 
 * Name, units consumed, amount to be paid.
 */
import java.util.*;
public class electricity_bill_p2p7
{
    int cnum,unit;//where cnum=consumer number, unit=units consumed
    String name;
    public void accept()
    {
        Scanner rinput=new Scanner(System.in);
        System.out.println("Enter Name of the Consumer");
        name=rinput.next();
        System.out.println("Enter the Consumer Number");
        cnum=rinput.nextInt();
        System.out.println("Enter the Number of units consumed by the consumer");
        unit=rinput.nextInt();
    }
    public void bill()
    {
        double bill=0;
        if(unit<=100)
        {
            bill=unit*4.80;
        }
        else if(unit>=101&&unit<300)
        {
            bill=(100*4.80)+(unit-100)*5.50;
        }
        else if(unit>=301&&unit<600)
        {
            bill=(100*4.80)+(200*5.50)+(unit-300)*6.80;
        }
        else if(unit>=600)
        {
            bill=(100*4.80)+(200*5.50)+(300*6.80)+(unit-600)*7.50;
        }
        System.out.println("Name:"+name);
        System.out.println("Units Consumed:"+unit);
        System.out.println("Amount to be paid:"+bill);
    }
    public void main()
    {
        accept();
        bill();
    }
}