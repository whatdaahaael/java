/**
 * Project 1 program 6
 * 
 * A company announces annual bonus to their employees as per the grades. 
 * However, 
 * for officers, maximum amount payable as bonus is Rs.50,000.
 * for supervisors, maximum amount payable as bonus is Rs.40,000.
 * for workers, maximum amount payable as bonus is Rs.30,000.
 * Write a program in Java to perform the above task as per the User’s choice taking grade as input.
 */
import java.util.*;
public class grade_sal_p1p6
{
    public static void main()
    {
        int sal;//salary
        double bsal,tsal;//where bsal=basic salary,tsal= total salary
        String grade;
        Scanner rinput=new Scanner(System.in);//rinput= runtime input
        System.out.println("Enter your salary");
        sal=rinput.nextInt();
        System.out.println("Enter your grade");
        grade=rinput.next();
        if(grade.equalsIgnoreCase("a"))
        {
            bsal=(sal*12)/100;
            tsal=bsal+sal;
            if(tsal<=50000)
            {
                System.out.println("For Officers the bonus is: "+tsal);
            }
            else
            {
                System.out.println("Invalid Salary amount entered.");
            }
        }
        else if(grade.equalsIgnoreCase("b"))
        {
            bsal=(sal*10)/100;
            tsal=bsal+sal;
            if(tsal<=40000)
            {
                System.out.println("For Supervisors the bonus is: "+tsal);
            }
            else
            {
                System.out.println("Invalid Salary amount entered.");
            }
        }
        else if(grade.equalsIgnoreCase("c"))
        {
            bsal=(sal*8.33)/100;
            tsal=bsal+sal;
            if(tsal<=30000)
            {
                System.out.println("For Workers the bonus is: "+tsal);
            }
            else
            {
                System.out.println("Invalid Salary amount entered.");
            }
        }
    }
}