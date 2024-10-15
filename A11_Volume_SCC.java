/**
 * Write a menu driven program to input the 
 * radius and height and calculate the following:
 * 1. Volume of sphere      = 4/3 πr3
 * 2. Volume of cylinder    = πr2h
 * 3. Volume of cone        = πr2h/3
 * 
 * Sujan
 * Assignment 11
 */
import java.util.*;
public class A11_Volume_SCC {
    static double pi = 22/7d;
    /**
     * This Function is used to calculate volume of a Sphere
     * @param r
     */
    static void sphere(double r){
        double volume=4/3d*pi*Math.pow(r,3);
        System.out.println("Volume of a Sphere = "+volume);
    }
    /**
     * This Function is used to calculate volume of a Cylinder
     * @param r
     * @param h
     */
    static void cylinder(double r, double h){
        double volume=pi*(r*r)*h;
        System.out.println("Volume of a Cylinder = "+volume);
    }
    /**
     * This Function is used to calculate volume of a Cone
     * @param r
     * @param h
     */
    static void cone(double r, double h){
        double volume=pi*(r*r)*h/3d;
        System.out.println("Volume of a Cone = "+volume);
    }
    public static void main(String[] args){
        Scanner rinput = new Scanner(System.in);
        double r,h;
        System.out.println("What do you want to find the volume of: ");
        System.out.println("1. Sphere\n2. Cylinder\n3. Cone");
        int opt=rinput.nextInt();
        switch(opt){
            /*
             * If its Sphere then:
             * Get the radius, 'r' and call 'sphere(r)'
             */
            case 1:
                System.out.println("\nEnter the Radius of a Sphere");
                r=rinput.nextDouble();
                sphere(r);
                break;

            /*
             * If its Cylinder then:
             * Get the radius and height and call 'cylinder(r, h)'
             */
            case 2:
                System.out.println("\nEnter the Radius of a Cylinder");
                r=rinput.nextDouble();
                System.out.println("\nEnter the Height of a Cylinder");
                h=rinput.nextDouble();
                cylinder(r, h);
                break;
            
            /*
             * If its Cone then:
             * Get the radius and height and call 'cone(r, h)'
             */
            case 3:
                System.out.println("\nEnter the Radius of a Cone");
                r=rinput.nextDouble();
                System.out.println("\nEnter the Height of a Cone");
                h=rinput.nextDouble();
                cone(r, h);
            break;
            
            default:
                System.out.println("Invalid Choice.");
        }
        rinput.close();
    }
}