/**
 * Project 2 Program 15
 *
 * Write a class with name perimeter using function overloading 
 * that computes the perimeter of a square, a rectangle and the circle.
 */
import java.util.*;
public class perimeter
{
    public void perimeter(double s)
    {
        double p=4*s;
        System.out.println("The Perimeter of the Square is: "+p);
    }
    public void perimeter(double l,double b)
    {
        double p=2*(l+b);
        System.out.println("The Perimeter of the Rectangle is: "+p);
    }
    public void perimeter(double pi,double r,double c)
    {
        double p=c*pi*r;
        System.out.println("The Perimeter of the Circle is: "+p);
    }
    public void main()
    {
        Scanner rinput=new Scanner(System.in);
        double s,l,b,pi,r,c;//where s=side,l=lenght,b=breadth,r=radius
        System.out.println("Enter the side of the Square");
        s=rinput.nextDouble();
        System.out.println("Enter the length of the Rectangle");
        l=rinput.nextDouble();
        System.out.println("Enter the breadth of the Rectangle");
        b=rinput.nextDouble();
        System.out.println("Enter the radius of the Circle");
        r=rinput.nextDouble();
        perimeter obj= new perimeter();
        obj.perimeter(s);
        obj.perimeter(l,b);
        obj.perimeter(3.14,r,2);
    }
}