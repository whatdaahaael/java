/**
 * Write a program in Java to input a name containing three words and display
 * the Surname followed by the first name and middle name.
 *
 * Sample Input: MAHENDRA SINGH DHONI
 * Sample Output: DHONI, MAHENDRA SINGH
 *
 * Sujan
 * Assignment 20
 */
import java.util.*;
public class A20_Surname {
    /**
     * This Function is used to convert a regular name to a surname followed by the name
     * Example:
     * MAHENDRA SINGH DHONI --> DHONI, MAHENDRA SINGH
     *
     * @param name
     * @return new_name
     */
    static String surname(String name) {
        int len, lws;
        String new_name;

        len=name.length();
        lws=name.lastIndexOf(" ");
        
        /* First takes the string after the last Whitespace.
         * Here we are taking 'lws+1' because it takes its
         * index position.
         */
        new_name = name.substring(lws+1, len)+", ";

        /* Then takes the string from '0' index to the last Whitespace.
         * Here we are not take 'lws-1' because we do not need the Whitespace
         * and that it uses index position.
         */
        new_name += name.substring(0,lws);

        return new_name;
    }
    public static void main(String args[]) {
        Scanner rinput = new Scanner(System.in);
        String name;

        System.out.println("Enter the name, 3 words.");
        name = rinput.nextLine();

        System.out.println(surname(name));
    }
}