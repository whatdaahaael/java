/**
 *
 * Assignment 15
 * A bank intends to design a program to display the
 * denomination of an input amount, up to 5 digits.
 * The available denomination with the bank are of rupees
 * 1000, 500, 100, 50, 20, 10,5, 2 and 1. Design a program
 * to accept the amount from the user and display the
 * break-up in descending order of denominations.
 * (i,e preference should be given to the highest denomination available)
 * along with the total number of notes. [Note: only the denomination
 * used should be displayed]. Also print the amount
 * in words according to the digits.
 * SAMPLE DATA 1:
 * INPUT: 14836
 * OUTPUT: ONE FOUR EIGHT THREE SIX DENOMINATION:
 * 1000 X 14 =14000
 * 500 X 1 =500
 * 100 X 3 =300
 * 50 X 1=50
 * 5 X 1=5
 * 1 X 1=1
 * SAMPLE DATA 2:
 * INPUT: 235001
 * OUTPUT: INVALID AMOUNT
 *
 */
import java.util.*;
public class A15_Bank_Denomination {
    //Converts a number to Roman Number
    static void countDenominations(int num) {
        int[] numbers = { 1000, 500, 100, 50, 20, 10, 5, 2, 1 };
        int ctr=0;

        System.out.println("DENOMINATION:");
        int denom=0;
        while (num>0) {
            // If the number is greater then subtracts it for the denomination and increase denomination count
            if(num>=numbers[ctr]){
                denom++;
                num-=numbers[ctr];
            }
            // If the number is lesser, it prints it and denom becomes 0
            if (num<numbers[ctr]) {
                if(denom!=0)
                    System.out.println(numbers[ctr]+" X "+denom+" = "+(numbers[ctr]*denom));
                ctr++;
                denom=0;
            }
        }
    }
    public static void main(String args[]) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=in.nextInt();
        String snum=Integer.toString(num);
        // Checks if the Amount is only till 5 digits
        if(snum.length()<=5) {
            String name="";
            String numnames[]={"zero ", "one ", "two ","three ","four ","five ","six ","seven ","eight ","nine "};
            for(int i=0; i < snum.length() ; i++)
            {
                name+=numnames[((int)snum.charAt(i)-48)].toUpperCase();
            }
            System.out.println(name);
            countDenominations(num);
        }
        else {
            System.out.println("INVALID AMOUNT");
        }
    }
}