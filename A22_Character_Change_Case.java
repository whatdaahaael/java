/**
 * Write a program in java to input a String and without using library function
 * change upper case characters to lower case and vice-versa
 *
 * Sujan
 * Assignment 22
 */
import java.util.*;
public class A22_Character_Change_Case {
    /**
     * This Function is used to flip the cases in a given word or Sentence.
     * It changes lower case letters to uppercase
     * and vice versa
     *
     * @param word
     * @return flipped_case
     */
    static String flip_case(String word) {
        String flipped_case="";
        char ch;
        for (int i = 0; i < word.length(); i++) {
            ch=word.charAt(i);
            /* Adding +32 or -32 if it is upper or lowercase
             * because that number is the difference,
             * between UpperCase(65-90) and LowerCase(97-122) letters
             */
            if(ch>='A'&&ch<='Z') {
                ch+=32;
            }
            else if(ch>='a'&&ch<='z') {
                ch-=32;
            }
            flipped_case+=ch;
        }
        return flipped_case;
    }
    public static void main(String args[]) {
        Scanner rinput = new Scanner(System.in);
        String user_string;

        System.out.println("Enter the String");
        user_string = rinput.nextLine();

        System.out.println("The Changed case word is "+flip_case(user_string));
    }
}