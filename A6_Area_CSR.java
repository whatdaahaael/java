/**
 * Write a program using a function overloading to compute the area of
 * circle = πr2
 * square = side * side
 * rectangle = l*b
 * Display the menu and calculate and print the area according to the user’s choice.
 * 
 * Sujan
 * Assignment 6
 */
import java.util.*;
public class A6_Area_CSR{
    /**
     * This Function is used to calculate area of a Circle
     * @param r
     */
    static void areaCal(double r){
        double Area=22/7d*(Math.pow(r,2));
        System.out.println("Area of a Circle = "+Area);
    }
    /**
     * This Function is used to calculate area of a Square
     * @param side
     */
    static void areaCal(String side){

        // Converts the 'side' int a double data type, s
        double s= Double.parseDouble(side);
        double Area=s*s;
        System.out.println("Area of a Square = "+Area);
    }
    /**
     * This Function is used to calculate area of a Rectangle
     * @param l
     * @param b
     */
    static void areaCal(double l, double b){
        double Area=l*b;
        System.out.println("Area of a Rectangle = "+Area);
    }
    public static void main(String[] args){
        Scanner rinput = new Scanner(System.in);
        double r,s,l,b;
        System.out.println("What do you want to find the area of: ");
        System.out.println("1. Circle\n2. Square\n3. Rectangle");
        int opt=rinput.nextInt();
        switch(opt){
            /*
             * If its circle then:
             * Get the radius, 'r' and call 'areaCal(r)'
             */
            case 1:
                System.out.println("\nEnter the Radius of a Circle");
                r=rinput.nextDouble();
                areaCal(r);
                break;

            /*
             * If its Square then:
             * Get the sides, 's' and convert it to a String data Type
             * because a function cannot have the same data type,
             * so we here are converting the double 's' into a
             * String 'sides' and passing it to 'areaCal(sides)'.
             */
            case 2:
                System.out.println("\nEnter the side of a Square");
                s=rinput.nextDouble();
                String sides=Double.toString(s);
                areaCal(sides);
                break;
            
            /*
             * If its Rectangle then:
             * Get the length, 'l' and breadth, 'b' and pass it to 'areaCal(l,b)'
             */
            case 3:
                System.out.println("\nEnter the Length of a Rectangle");
                l=rinput.nextDouble();
                System.out.println("\nEnter the Breadth of a Rectangle");
                b=rinput.nextDouble();
                areaCal(l,b);
                break;
            
            default:
                System.out.println("Invalid Choice.");
        }
        rinput.close();
    }
}