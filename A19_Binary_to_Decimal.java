/**
 * Write a program in java to accept a binary equivalent(base 2 of a
 * decimal number.)
 * Convert the binary number into its decimal equivalent.
 * Sample Input     = (11100101)
 * Sample Output    = (229)10
 *
 * Sujan
 * Assignment 19
 */
import java.util.*;
public class A19_Binary_to_Decimal {
    /**
     * This Function is used to convert a binary(base 2) number
     * to decimal(base 10 num)
     *
     * @param bnum
     * @return dnum
     */
    static int convert_to_decimal(int bnum) {
        int pow = 0, dnum=0, num;

        /*
        * This code is converting a binary number to its decimal equivalent.
        * The while loop continues as long as the value of 'bnum' is not 0.
        */

        while(bnum!=0) {
            num=bnum%10;
            // 1(or 0)*2^pow
            dnum+=num*Math.pow(2, pow);
            pow++;
            bnum=bnum/10;
        }
        return dnum;
    }
    public static void main(String args[]) {
        Scanner rinput = new Scanner(System.in);
        int bnum;

        System.out.println("Enter the binary number.");
        bnum=rinput.nextInt();

        System.out.println("The decimal equivalent of binary("+bnum+") is decimal("+convert_to_decimal(bnum)+")");
    }
}