/**
 *  Write a program to enter a range and display all the Armstrong numbers 
 *  between them (including both the numbers). An Armstrong number is the 
 *  one whose sum of the cubes of the digits is equal to the original number 
 *  itself.
 *  153 = 1^3+5^3+3^3
 *      = 1+125+27
 *      = 153
 *
 * Sujan
 * Assignment 4
 */
import java.util.*;
public class A4_Armstrong_Num
{
    public static void main(String args[]){
        Scanner rinput = new Scanner(System.in);
        System.out.println("Enter a number");
        int start_Num = rinput.nextInt();
        System.out.println("Enter a number");
        int end_Num = rinput.nextInt();
        
        // Gets numbers ranging from 'start_Num' to 'end_Num'
        for(;start_Num<=end_Num;start_Num++){
            int tot=0;
            int sdn=start_Num;

            // Checks if a given number is an Armstrong number.
            while(sdn!=0){
                tot+=Math.pow((sdn%10),3);
                sdn/=10;
            }
            if(tot == start_Num){
                System.out.println(start_Num+ " is an Armstrong Number");
            }
        }
        rinput.close();
    }
}