/**
 *
 * Assignment 16
 * Given the two positive integers p and q, where p < q.
 * Write a program to determine how many kaprekar numbers are there
 * in the range between 'p' and 'q'(both inclusive) and output them.
 * About 'kaprekar' number: A positive whole number 'n' that has 'd'
 * number of digits is squared and split into 2 pieces, a right hand
 * piece that has 'd' digits and a left hand piece that has remaining
 * 'd' or 'd-1' digits. If sum of the pieces is equal to the number then
 * it's a kaprekar number.
 * Sample Data:
 * Input:
 * p=1 q=1000
 * Output
 * THE KAPREKAR NUMBERS ARE: 1,9,45,55,99,297,703,999
 * FREQUENCY OF KAPREKAR NUMBERS IS: 8
 *
 */
import java.util.*;
public class A16_Kaprekar_Number {
    // Checks if the number is a kaprekar number
    static boolean checkkapnum(int num) {
        String snum=Integer.toString(num);
        int numlen=snum.length();
        int sqnum=num*num;
        double posdiv=Math.pow(10, numlen);
        int nnum=0;
        while(sqnum>0) {
            nnum+=sqnum%posdiv;
            sqnum/=posdiv;
        }
        if(num==nnum){
            return true;
        }
        else {
            return false;
        }
    }
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int p,q,kctr=0;
        System.out.println("Enter range");
        System.out.println("p:");
        p=in.nextInt();
        System.out.println("q:");
        q=in.nextInt();
        System.out.println("The Kaprekar Numbers are: ");
        // Gets numbers in range of p-q
        for (int i = p; i <= q; i++) {
            if(checkkapnum(i)){
                System.out.println(i);
                kctr++;
            }
        }
        System.out.println("Frequency of Kaprekar Numbers is: "+kctr);
    }
}
