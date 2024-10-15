/**
 * Write a program in java to input a sentence in uppercase and
 * frame a word by adding first alphabets of each word and also
 * display the new word after elimination duplicate alphabets.
 * Sample Input: MANMOHAN SINGH IS THE PRIME MINISTER OF INDIA
 * Sample Output: The new word MSITPMOI
 * After eliminating duplicate alphabets: MSITPO
 *
 * Sujan
 * Assignment 23
 */

import java.util.*;
public class A23_First_Letter {
    /**
     * This Function is used to remove all the duplicates in a given word.
     *
     * @param old_word
     * @return the new word after removing all the duplicates
     */
    static String remove_duplicates(String old_word) {
        String new_word="";
        char ch;
        // Gets only the first occurrences of the letters in a given word
        for (int i = 0; i < old_word.length(); i++) {
            ch=old_word.charAt(i);
            // if the new_word does not contain the 'ch' then add it
            if(new_word.indexOf(ch)==-1) {
                new_word+=ch;
            }
        }
        return new_word;
    }
    /**
     * This Function is used to get first letters of the words in
     * a given sentence. It also removes the duplicates, by calling
     * 'remove_duplicates'.
     *
     * @param old_str the user enters sentence
     * @return a new word that contains all the first letters of the words removing the duplicates
     */
    static String get_letters(String old_str) {
        String new_str="";
        char ch;

        new_str = Character.toString(old_str.charAt(0));

        // This loops gets the first letter of each word in the sentence.
        for(int i = 1; i<old_str.length(); i++) {
            ch=old_str.charAt(i);

            // Stores the characters in new_str, till the next whitespace
            if(ch==' ') {
                new_str += old_str.charAt(i+1);
            }
        }
        System.out.println("The new word is "+ new_str);
        return remove_duplicates(new_str) ;
    }
    public static void main(String args[]) {
        Scanner rinput = new Scanner(System.in);
        String ustr, new_str;

        System.out.println("Enter the Sentence.");
        ustr = rinput.nextLine();

        new_str=get_letters(ustr);

        System.out.println("After eliminating duplicate alphabets: "+new_str);
    }
}