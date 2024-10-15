/**
 * Design a class to overload a function compare() as follows:
 * void compare(int, int) – to compare two integers and print the greater of the 
 * two integers.
 * void compare(char,char) - to compare the numeric value of two characters 
 * and print the character with higher numeric value.
 * Write the main method and create the object to call the above methods.
 * 
 * Sujan
 * Assignment 7
 */
import java.util.*;
public class A7_Compare_Values {
    /**
     * Compares 2 integers and prints the greater of those 2
     * @param a
     * @param b
     */
    void compare(int a, int b){
        System.out.println(Math.max(a, b)+" is Greater.");
    }
    /**
     * Compares 2 Characters and prints the greatest of those 2
     * @param a
     * @param b
     */
    void compare(char a,char b){
        // Prints the greater Charecter with greater numeric value
        System.out.println((char)(Math.max((int)a, (int)b)) + " is Greater.");
    }
    public static void main(String[] args) {
        Scanner rinput = new Scanner(System.in);
        int n1, n2;
        char ch1, ch2;

        //Getting the numeric values
        System.out.println("\nEnter the first number");
        n1=rinput.nextInt();
        System.out.println("\nEnter the Second number");
        n2=rinput.nextInt();

        //Getting the Character values
        System.out.println("\nEnter the first character");
        ch1=rinput.next().charAt(0);
        System.out.println("\nEnter the Second character");
        ch2=rinput.next().charAt(0);

        // Creating object 'obj' to call the  methods
        A7_Compare_Values obj = new A7_Compare_Values();
        // sending the values to their respective 'compare' function
        obj.compare(n1, n2);
        obj.compare(ch1, ch2);
    }
}