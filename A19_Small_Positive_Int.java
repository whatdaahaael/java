/**
 *
 * Assignment 19
 * Given two positive number M and N, such that M is between 100 and
 * 10000 and N is less than 100. Find the smallest integer that is greater
 * than M and whose digits add up to N. For example, if M = 100 and N = 11,
 * then the smallest integer greater than 100 wose digits add up to 11 is 119.
 * Write a program to accept the numbers M and N from the user and print the
 * smallest required number whose sum of all its digits is equal to N. Also,
 * print the total number of digits present in the required number. The program
 * should check for thẹ validity of the inputs and display an appropriate message
 * for an invalid input.
 * Test your program with the sample data and some random data:
 * Example 1
 * INPUT :
 * M = 100
 * N= 11
 * OUTPUT :
 * The required number = 119
 * Total number of digits = 3
 * Example 2
 * INPUT :
 * M = 1500
 * N = 25
 * OUTPUT :
 * The required number = 1699
 * Total number of digits = 4
 *
 */
import java.util.*;
public class A19_Small_Positive_Int {
    // Adds the digits of the number ex: 101 = 1+0+1 = 2
    static int checknum(int num) {
        int dnum=num;
        int nnum=0;
        while(dnum>0) {
            nnum+=dnum%10;
            dnum/=10;
        }
        return nnum;
    }
    // Gets the smallest positive integer that is equal to 'n'
    static void smallestposint(int m, int n) {
        for (int i = m; i > 0; i++) {
            if(checknum(i)==n) {
                System.out.println("The required number = "+i);
                System.out.println("Total number of digits = "+String.valueOf(i).length());
                break;
            }
        }
    }
    public static void main(String args[]) {
        Scanner in=new Scanner(System.in);
        int m,n;
        System.out.print("M : ");
        m=in.nextInt();
        System.out.print("N : ");
        n=in.nextInt();
        if(m>=100&&m<=10000&&n<=100) {
            smallestposint(m,n);
        }
        else 
            System.out.println("Invalid input");
    }
}