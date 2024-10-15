/**
 * Project 1 Program 7
 * Define a java class Employee with the following members:
 * Data members        : emp_code, name, basic ,hra, da, PF
 * Default constructor    : Initialises code, basic, hra, da and PF to zero.
 * Parameterized constructor: Initialises basic, computes hra, da and PF as per the following criteria:
 * hra=10% of basic
 * da=55% of basic
 * pf=Rs.1000 
 * Main method        : Computes and displays the net salary.
 * NetSalary=basic +da+hra – pf.
 */
import java.util.*;
import java.io.*;
public class Employee
{
    double basic, hra, da, pf,emp_code;
    String name;
    Employee()
    {
        emp_code=0;
        pf=0;
        basic=0.0;
        hra=0.0;
        da=0.0;
    }
    Employee(double basic)
    {
        this.basic = basic;
        hra=(basic*10)/100.0;
        da=(basic*55)/100.0;
        pf=1000.0;
    }
    public void main()
    {
        double NetSalary=basic+da+hra-pf;
        System.out.println("The Net Salary of the employee is: "+NetSalary);
    }
    public void execute()
    {
        Scanner rinput=new Scanner(System.in);
        System.out.println("Enter the name of the employee");
        name=rinput.next(); 
        System.out.println("Enter the employee code");
        emp_code=rinput.nextDouble();
        System.out.println("Enter salary");
        basic=rinput.nextDouble();
        Employee obj=new Employee(basic);
        obj.main();
    }
}