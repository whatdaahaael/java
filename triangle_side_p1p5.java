/**
 * Project 1 Program 5
 * Consider a right-angled triangle whose longest side is given as 6cm and the base as 4cm. 
 * Write a Java program that initialises the given sides of triangle in a constructor and computes and displays the third side. 
 */
public class triangle_side_p1p5
{
    public void main()
    {
        double side1,side2,side3;
        side1=6;
        side2=4;
        side3=compute(side1,side2);
        System.out.println("The third side of the triangle is: "+side3);
    }
    public double compute(double a,double b)
    {
        return Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
    }
}