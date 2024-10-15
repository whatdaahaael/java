/**
 * Write a program to input a number and print
 * if the number is a Duck number or not.
 * A Duck number is a number which has at least 1 zero present in it.
 * 
 * Sujan
 * Assignment 12
 */
import java.util.*;
public class A12_Duck_Number {
    /**
     * To check whether a number is a duck number or no.
     * @param number
     * @return boolean false or true
     */
    static boolean duck_number_checker(int number){
        String snum=Integer.toString(number);
        /*
         * Checks whether the given number contains a 0.
         * If it does then it returns "true", 
         * else "false".
         */
        return snum.contains("0");
    }
    public static void main(String[] args) {
        Scanner rinput = new Scanner(System.in);
        int number;
        System.out.println("Enter a Number");
        number = rinput.nextInt();
        
        // Checks whether a given number is a duck number or no
        if(duck_number_checker(number)){
            System.out.println(number+" is a Duck Number");
        }
        else{
            System.out.println(number+" is not a Duck Number");
        }
    }
}