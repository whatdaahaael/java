/**
 *
 * Assignment 13
 * Convert Celsius into Fahrenheit using Inheritance
 *
 */
import java.util.*;
class Farenheit {
    // Converts Celsius to Fahrenheit
    double tofar(double num) {
        return (num * 9/5) + 32;
    }
}
class Convert extends Farenheit {
    double convert(double celsius) {
        return tofar(celsius);
    }
}
public class A13_Cel_to_Fahren {
    public static void main(String args[]) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the Celsius Degree");
        double cel=in.nextDouble();

        Convert con=new Convert();
        System.out.println("Fahrenheit = "+con.convert(cel));
    }
}
