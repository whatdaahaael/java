/**
 * Project 1 Program 10
 * Write a class with the name Area using function overloading that computes the area of a parallelogram, a rhombus and a trapezium. 
 * Formula: 
 * Area of a parallelogram (pg)     = base * ht 
 * Area of a rhombus (rh)         = (1/2) * d1 * d2 
 * (where, d1 and d2 are the diagonals) 
 * Area of a trapezium (tr)         = (1/2) * (a + b) * h 
 * (where a and b are the parallel sides, h is the perpendicular distance between the parallel sides)
 */
import java.util.*;
public class Area
{
    public double areaFinder(int base,int ht)
    {
        return base*ht;
    }
    public double areaFinder(double d,int d1,int d2)
    {
        return d*d1*d2;
    }
    public double areaFinder(double d, int a, int b, int h)
    {
        return d*(a+b)*h;
    }
    public void main()
    {
        int ba, hi, d1, d2, a, b, h;
        double pg,rh,tr;
        Scanner rinput=new Scanner(System.in);
        System.out.println("Enter the base of the parallelogram");
        ba=rinput.nextInt();
        System.out.println("Enter the height of the parallelogram");
        hi=rinput.nextInt();
        System.out.println("Enter the first diagonal of the rhombus");
        d1=rinput.nextInt();
        System.out.println("Enter the second diagonal of the rhombus");
        d2=rinput.nextInt();
        System.out.println("Enter the first parallel side of the trapezium");
        a=rinput.nextInt();
        System.out.println("Enter the second parallel side of the trapezium");
        b=rinput.nextInt();
        System.out.println("Enter the perpendicular distance between the parallel sides of the trapezium");
        h=rinput.nextInt();
        pg=areaFinder(ba,hi);
        rh=areaFinder(0.5,d1,d2);
        tr=areaFinder(0.5,a,b,h);
        System.out.println("\n"+"The Area of a parallelogram: "+pg);
        System.out.println("The Area of a rhombus: "+rh);
        System.out.println("The Area of a trapezium: "+tr);
    }
}