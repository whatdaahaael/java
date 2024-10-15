/**
 * Project 2 Program 11
 * 
 * Write a program using switch case to find the volume of a cube a sphere and a cuboid. 
 * For an incorrect choice, an appropriate error message should be displayed.
 */
import java.util.*;
public class volumw_p2p11
{
    public static void main()
    {
        int choice,s,r,l,b,h;
        double pi=3.14,total;
        Scanner rinput=new Scanner(System.in);
        System.out.println("Enter Choice"+"\n"+"1. Volume of Cube"+"\n"+"2. Volume of Sphere"+"\n"+"3. Volume of Cuboid");
        choice=rinput.nextInt();
        switch(choice)
        {
            case 1:
                System.out.println("Enter the sides of the cube");
                s=rinput.nextInt();
                total=s*s*s;
                System.out.println("The Volume of the Cube is:"+total);
                break;
            case 2:
                System.out.println("Enter the radius of the sphere");
                r=rinput.nextInt();
                total=4/3*pi*r*r*r;
                System.out.println("The Volume of the Sphere is:"+total);
                break;
            case 3:
                System.out.println("Enter the length of the cubiod");
                l=rinput.nextInt();
                System.out.println("Enter the breadth of the cubiod");
                b=rinput.nextInt();
                System.out.println("Enter the hieght of the cubiod");
                h=rinput.nextInt();
                total=l*b*h;
                System.out.println("The Volume of the Cube is:"+total);
                break;
            default:
                System.out.println("Enter the sides of the cubiod");
                break;
            }
    }
}