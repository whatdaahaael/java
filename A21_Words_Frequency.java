/**
 * Write a program in java to input two String. Display the words,
 * whose frequency is more than one in  the string.
 * Sample Input:
 * 1. MAHENDER SINGH DHONI IS THE CAPTAIN OF INDIAN CRICKET TEAM
 * 2. ASRAV GANGULY IS EX-CAPTAIN OF THE INDIAN CRICKET TEAM
 *
 * Sample Output:
 * THE
 * OF
 * INDIAN
 * CRICKET
 * TEAM
 * IS
 *
 * Sujan
 * Assignment 21
 */
import java.util.*;
public class A21_Words_Frequency {
    /**
     * This Function is used to check the frequencies of a word in two sentences.
     *
     * First it stores 'ch' in 'word' as long as it is not a Whitespace...
     * When it is a Whitespace or 'i' has reached the end/last character,
     * it will then check if the 'word' is present in 'sen2'
     *
     * @param sen1 First Sentence
     * @param sen2 Second Sentence
     */
    static void check_word_frequency(String sen1, String sen2) {
        String word="";
        char ch;
        for(int i=0;i<sen1.length();i++) {
            ch=sen1.charAt(i);
            // Store 'ch' in word as long as it is not a Whitespace.
            if(ch!=' ') {
                word+=ch;
            }

            if(ch==' ' || i==(sen1.length()-1)){
                if(sen2.contains(word)) {
                    System.out.println(word);
                }
                word="";
            }
        }
    }
    public static void main(String args[]) {
        Scanner rinput = new Scanner(System.in);
        String sen1, sen2;
        System.out.println("Enter the First Sentence.");
        sen1= rinput.nextLine();
        System.out.println("Enter the Second Sentence.");
        sen2= rinput.nextLine();

        check_word_frequency(sen1, sen2);
    }
}