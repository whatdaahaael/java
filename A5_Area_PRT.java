/**
 * Write a program by using function overloading technique that computes and displays the area of
 * a Parallelogram, a rhombus and a Trapezium.
 * Area of Parallelogram = b*h
 * Area of Rhombus       = 1/2 d1*d2 (d1 and d2 are diagonals)
 * Area of Trapezium     = 1/2 (a+b)*h
 * 
 * Sujan
 * Assignment 5
 */
import java.util.*;
public class A5_Area_PRT{
    /**
     * This Function is used to calculate area of a Parallelogram
     * @param b
     * @param h
     */
    static void areaCal(double b, double h){
        double Area=b*h;
        System.out.println("Area of a Parallelogram = "+Area);
    }
    /**
     * This Function is used to calculate area of a Rhombus
     * @param d1
     * @param d2
     */
    static void areaCal(String d1, String d2){
        double d1s= Double.parseDouble(d1);
        double d2s= Double.parseDouble(d2);
        double Area=1/2d*d1s*d2s;
        System.out.println("Area of a Rhombus = "+Area);
    }
    /**
     * This Function is used to calculate area of a Trapezium
     * @param a
     * @param b
     * @param h
     */
    static void areaCal(double a, double b,double h){
        double Area=1/2d*(a+b)*h;
        System.out.println("Area of a Trapezium = "+Area);
    }
    public static void main(String[] args){
        Scanner rinput = new Scanner(System.in);

        // Initialization of all the values
        double bP,hP,d1,d2,b1,b2,hT;
        System.out.println("\nEnter the Breadth of a Parallelogram");
        bP=rinput.nextDouble();
        System.out.println("\nEnter the Height of a Parallelogram");
        hP=rinput.nextDouble();
        System.out.println("\nEnter the First Diagonal of a Rhombus");
        d1=rinput.nextDouble();
        System.out.println("\nEnter the Second Diagonal of a Rhombus");
        d2=rinput.nextDouble();
        System.out.println("\nEnter the Base1 of a Trapezium");
        b1=rinput.nextDouble();
        System.out.println("\nEnter the Base2 of a Trapezium");
        b2=rinput.nextDouble();
        System.out.println("\nEnter the Height of a Trapezium");
        hT=rinput.nextDouble();

        rinput.close();

        // Parallelogram
        areaCal(bP, hP);

        /*
         * Rhombus
         * This data type conversion 
         * is done so that the type sent to the SECOND areaCal() function remains aDouble type.
         */
        String d1s=Double.toString(d1);
        String d2s=Double.toString(d2);
        areaCal(d1s, d2s);

        // Trapezium
        areaCal(b1,b2,hT);
    }
}