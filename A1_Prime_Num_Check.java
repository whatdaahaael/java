/**
 * Write a program to input an integer number. 
 * Print 15 prime numbers found after the given integer. 
 * Use a function that returns 1 if a number  passed to it 
 * is a prime number, otherwise it returns 0.
 *
 * Sujan
 * Assignment 1
 */
import java.util.Scanner;
public class A1_Prime_Num_Check
{
    /**
     * Checks whether a number is a prime number or no
     *
     * @param nums
     * @return 1 or 0
     */
    static int primeNumCheck(int nums){
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
        //If the value of 'ctr' is less than or equal to 2 then it is a prime number
        if(ctr==2)
            return 1;
        else
            return 0;
    }

    public static void main(String args[]){
        Scanner rinput = new Scanner (System.in);

        int NUMBER, primeNumber, numberctr=1;
        System.out.println("Enter a Number");
        NUMBER = rinput.nextInt(); 
        int unumcopy=NUMBER; //stores the original value of 'NUMBER'

        /*
         * This while loops checks and prints the 
         * NEXT 15 PRIME NUMBERS found after the given integer
         */
        while(numberctr<=15){
            unumcopy++;
            primeNumber=primeNumCheck(unumcopy);

            //if the 'primeNumber' is equal to 1
            if(primeNumber==1){
                System.out.println(unumcopy+" is a prime number.");
                numberctr++;
            }
        }
        rinput.close();
    }
}
