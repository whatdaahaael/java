/**
 * Write a program in java to store 20 prime numbers in a
 * Single Dimensional Array where the user enter the
 * first number(may or may not be a prime number).
 *
 * Sujan
 * Assignment 16
 */
import java.util.*;
public class A16_20_Prime_Numbers_Array {
    /**
     * Checks whether a number is a prime number or no
     *
     * @param nums
     * @return true or false
     */
    static boolean isPrimeNum(int nums){
        int ctr=0;
        /*
         * This for loop tries to find the number of factors 'nums' has,
         * and if any found it increases the value of 'ctr'
         */
        for(int numbers=1;numbers<=nums;numbers++){
            if(nums%numbers==0){
                ctr++;
            }
        }

        //If the value of 'ctr' is equal to 2 then it is a prime number
        if(ctr==2)
            return true;
        else
            return false;
    }
    public static void main(String args[]) {
        Scanner rinput = new Scanner(System.in);
        int num, arr_size, numctr=0, pos=0;
        System.out.println("Enter a Number");
        num = rinput.nextInt();

        /*
         * If the 'num' is a prime number then get the next 19 prime numbers
         * else the next 20 prime number
         */
        if(isPrimeNum(num)) {
            arr_size=19;
        }
        else {
            arr_size=20;
        }

        int arr[] = new int[arr_size];

        /*
         * This while loops checks and store the
         * NEXT 20 PRIME NUMBERS in 'arr[pos]' found after the given integer.
         *
         * If the given is a prime number, then the next 19
         * else the next 20...
         */
        while(numctr<arr_size){
            if(isPrimeNum(num)){
                arr[pos]=num;
                numctr++;
                pos++;
            }
            num++;
        }
        // Printing the array
        for (int i = 0; i < arr_size; i++) {
            System.out.println(arr[i]);
        }
    }
}