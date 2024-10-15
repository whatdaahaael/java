/**
 * Write a program to enter a number and chech if it is a Disarium number or not.
 * A number is said to be Disarium if sum of the digits powered with the respective
 * position is equal to the original number.
 * Example: 135
 *        = 1^1+3^2+5^3
 *        = 135
 *
 * Sujan
 * Assignment 14
 */
import java.util.*;
public class A14_Disarium_Number {
    /**
     * This functions calculates a number and a returns it to check if
     * that number a desarium number or no.
     *
     * @param number
     * @return total
     */
    static int desarium_num_cal(int number){
        String snum=Integer.toString(number);
        int pow, tot=0;
        pow=1;
        // Calculates each value to their respective power, which is the position.
        for(int i=0;i<snum.length();i++){
            char ch = snum.charAt(i);

            /*
             * This part converts the 'ch' to a int data type and
             * calculating it with its power, respective to its position and
             * then stores it in 'tot'.
             */
            tot+=(int) Math.pow(Integer.parseInt(String.valueOf(ch)),pow);
            pow++;
        }
        return tot;
    }
    public static void main(String[] args) {
        Scanner rinput = new Scanner(System.in);
        int number;
        System.out.println("Enter a Number.");
        number = rinput.nextInt();

        // Checks whether a given number is a desarium number or no
        if(desarium_num_cal(number)==number){
            System.out.println(number+" is a Disarium Number");
        }
        else{
            System.out.println(number+" is not a Disarium Number");
        }
    }
}