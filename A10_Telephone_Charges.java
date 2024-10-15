/**
 * The telephone department charges from the subscribers for the number of calls made as per the given tariff:
 * Calls                     Rate per call
 * first 50                  no charge
 * next 100                  Rs.1
 * next 200                  Rs.2.50
 * next 300                  Rs.3
 * However every subscriber has to pay a fixed monthly charge of Rs.200.
 * Write a program in Java to input the number of calls and print the monthly bill.
 * 
 * Sujan
 * Assignment 10
 */
import java.util.*;
public class A10_Telephone_Charges {
    public static void main(String[] args) {
        Scanner rinput = new Scanner(System.in);
        int calls;
        double bill = 200;
        System.out.println("Enter the number of calls");
        calls = rinput.nextInt();
        
        // Calculates the bill.
        if(calls>50 && calls <=150){
            bill += (calls-50) * 1;
        }
        else if(calls>150 && calls <=350){
            bill += 100*1 + (calls - 150)*2.50;
        }
        else if(calls >350){
            bill += 100*1 + 200*2.50 + (calls - 350)*3;
        }

        System.out.println("Montly Bill = "+bill);
    }
}