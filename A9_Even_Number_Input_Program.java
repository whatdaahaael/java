/**
 * Write a program that inputs maximum 10 numbers 
 * but stops as soon as 4 even numbers have been entered.
 * 
 * Sujan
 * Assignment 9
 */
import java.util.*;
public class A9_Even_Number_Input_Program{
    public static void main(String args[]){
        Scanner rinput = new Scanner(System.in);
        int number, ectr=0;
        boolean flag=false;

        // Accepts only 10 numbers and if 4 even numbers have been detected it will stop.
        for(int i = 1; i<=10; i++){
            System.out.println("Enter the "+i+" number.");
            number=rinput.nextInt();

            // If its an even number, increase ectr by one
            if(number%2==0){
                ectr++;
            }
            // If there are 4 even numbers then stop the loop and set 'flag' to 'true'
            if(ectr==4){
                flag=true;
                break;
            }
        }
        if(flag){
            System.out.println("4 Even Numbers have been detected");
        }
        else{
            System.out.println("You only have "+ectr+" even numbers.");
            System.out.println("Rest all "+(10-ectr)+" are odd numbers.");
        }
    }
}