/**
 *
 * Assignment 8
 * A unique-digit integer is a positive integer(without leading zeros) with no
 * duplicate digits. For example 7,135,214 are all unique-digit integers whereas
 * 33, 3121, 300 are not. Given two positive integers m and n, where m<n, write
 * a program to determine how many unique-digit integers are there in the range
 * between m and n (both inclusive) and output them. The input contains two
 * positive integers m and n. Assume m<30000 and n<30000. You are to output
 * the number of unique-digit integers in the specified range along with their
 * values in the format specified below:
 *
 * SAMPLE DATA:
 * INPUT:
 * M = 100, N = 120
 * OUTPUT:
 * THE UNIQUE-DIGIT INTEGERS ARE: 102, 103, 104, 105, 106, 107, 108, 109, 120.
 * FREQUENCY OF UNIQUE-DIGIT INTEGERS IS: 9.
 *
 */

import java.util.*;
public class A8_Unique_Dig_Num {
    static boolean check_udn(int num) {
        String snum=Integer.toString(num);
        int slen=snum.length();
        // Checks if there are no recurring numbers in the given number.
        for(int i=0;i<slen;i++){
            char chi=snum.charAt(i);
            for (int j = 0; j < slen; j++) {
                char chj=snum.charAt(j);
                if(chi==chj) {
                    if(i!=j) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
    public static void main(String args[]) {
        Scanner in=new Scanner(System.in);
        int m,n;
        System.out.println("Enter the range: ");
        System.out.println("m:");
        m=in.nextInt();
        System.out.println("n:");
        n=in.nextInt();
        System.out.println("THE UNIQUE-DIGIT INTEGERS ARE: ");
        int uctr=0;
        // Getting the numbers in the range of m to n
        for(int i=m;i<=n;i++) {
            // Checks if the number is a unique digit number
            if(!check_udn(i)){
                System.out.println(i);
                uctr++;
            }
        }
        System.out.println("FREQUENCY OF UNIQUE-DIGIT INTEGERS IS: "+uctr);
    }
}
