/**
 * Write a program in java to store 20 numbers of the Fibonacci series in a Single
 * Dimensional Array, when the user supplies first two numbers. Display only those
 * numbers, which are Prime Fibonacci.
 * Sample Input         : 1, 1
 * Sample Fib Series    : 1, 1, 2, 3, 5, 8, 13...
 * Sample Output        : 2, 3, 5, 13...
 *
 * Sujan
 * Assignment 17
 */
import java.util.*;
public class A17_Prime_Fibonacci_Series {
    static int numbers[] = new int[20];
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
    /**
     * This Function is used to Get the Fibonacci Series
     * and Print only the Prime Numbers of that series.
     */
    static void getFibonacciSeries() {
        int ctr = 2;

        /*
         * This loop gets the Fibonacci Series of the initial 2 numbers...
         * First adding the initial number at the index and the prev number
         * at the given index... and then it assigns it to the next
         * index position in the array...
         */
        for (int i = 1; i <= 18; i++) {
            numbers[i+1] = numbers[i] + numbers[i-1];
        }

        // This loops prints all the prime numbers in the array.
        for (int i = 0; i < 20; i++) {
            if(isPrimeNum(numbers[i])){
                System.out.print(numbers[i]+", ");
            }
        }

    }
    public static void main(String args[]) {
        Scanner rinput = new Scanner(System.in);

        System.out.println("Enter the first number");
        numbers[0] = rinput.nextInt();
        System.out.println("Enter the second number");
        numbers[1] = rinput.nextInt();

        getFibonacciSeries();
    }
}