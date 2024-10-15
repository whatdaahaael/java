/**
 * Project 2 Program 9
 * Write the menu driven program to find the area of an Equilateral Triangle, 
 * an Isosceles triangle and a scalene triangle as per user’s choice
 */
import java.util.*;
public class area_p2p9
{
    Scanner rinput=new Scanner(System.in);//rinput=runtime input
    int opt;//opt=option
    public void calculation()
    {
        double area,s,a,b,m,n,p;
        switch(opt)
        {
            case 1: 
                System.out.println("Enter side of an equilateral triangle");
                s=rinput.nextDouble();
                area= Math.sqrt(3*s*s)/4;
                System.out.println("The area of the Equilateral triangle is:"+area);
                break;
            case 2:
                System.out.println("Enter the value of a");
                a=rinput.nextDouble();
                System.out.println("Enter the value of b");
                b=rinput.nextDouble();
                area=(b/4)*Math.sqrt((4*a*a)-(b*b));
                System.out.println("The area of the Isoceles triangle is:"+area);
                break;
            case 3:
                System.out.println("Enter the value of m");
                m=rinput.nextDouble();
                System.out.println("Enter the value of n");
                n=rinput.nextDouble();
                System.out.println("Enter the value of p");
                p=rinput.nextDouble();
                s=(m+n+p)/2;
                area=Math.sqrt((s*(s-m)*(s-n)*(s-p)));
                System.out.println("The area of the Scalene triangle is:"+area);
                break;
            default:
                System.out.println("Invalid choice");
                break;
        }
    }
    public void main()
    {
        System.out.println("Select Option");
        System.out.println("1. Equilateral Triangle"+"\n"+"2. Isosceles Triangle"+"\n"+"3. Scalene Trianle");
        opt=rinput.nextInt();
        calculation();
    }
}