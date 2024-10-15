/**
 * Project 2 Program 3
 * Write the program to calculate the following
 * 1) Surface area of the sphere =4πr2
 * 2) Total surface area of Cylinder=2πr(r+h)
 * 3) Surface area of Cube=6a2
 * 
 */
import java.util.*;
public class surface_area_p2p3
{
    Scanner rinput=new Scanner(System.in);//rinput=runtime input
    double pi=3.14,sarea,r;//where, sarea=surface area, r=radius
    public void sphere()
    {
       System.out.println("Enter the radius of the Sphere");
       r=rinput.nextDouble();
       sarea=4*pi*Math.pow(r,2);
       System.out.println("The Surface Area of the Sphere is:"+sarea);
    }
    public void cylinder()
    {
        double h;//height
        System.out.println("Enter the radius of the Cylinder");
        r=rinput.nextDouble();
        System.out.println("Enter the height of the Cylinder");
        h=rinput.nextDouble();
        sarea=2*pi*r*(r+h);
        System.out.println("The Total Surface Area of the Cylinder is:"+sarea);
    }
    public void cube()
    {
        double a;//edges
        System.out.println("Enter the edges of the Cube");
        a=rinput.nextDouble();
        sarea=6*Math.pow(a,2);
        System.out.println("The Surface Area of the Cube is:"+sarea);
    }
    public void main()
    {
        sphere();
        cylinder();
        cube();
    }
}