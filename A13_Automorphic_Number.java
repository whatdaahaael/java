/**
 * Enter a number and check wehter it is an Automorphic number or not. 
 * An Automorphic number is the numbeer if the square of the number ends 
 * in the same digits as the original number.
 * Example: 76
 *        = 76*76
 *        = 5776
 * 
 * Sujan
 * Assignment 13
 */
import java.util.*;
public class A13_Automorphic_Number {
    /**
     * To check if a number is a Automorphic number or no
     * @param number
     * @return boolean
     */
    static boolean am_num_cal(int number){
        int tot = number*number;
        // Converting a given number to a string
        String snum = Integer.toString(tot);
        // Checking if the square of the number ends with the number
        return snum.endsWith(Integer.toString(number));
    }
    public static void main(String[] args) {
        Scanner rinput = new Scanner(System.in);
        int number;
        System.out.println("Enter a Number.");
        number = rinput.nextInt();

        // Checks whether a given number is a automorphic number or no
        if(am_num_cal(number)){
            System.out.println(number+" is a Automorphic Number");
        }
        else{
            System.out.println(number+" is not a Automorphic Number");
        }
    }
}