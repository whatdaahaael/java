/**
 * Write a program in java to accept a string and display the new String
 * Reverting each character of the word.
 * Sample Input: India is my country
 * Sample Output: aidnI si ym yrtnuoc
 *
 * Sujan
 * Assignment 24
 */
import java.util.*;
public class A24_String_Words_Reverse {
    /**
     * This Function is used to reverse the given word.
     *
     * @param word
     * @return The reversed word
     */
    static String reverse_word(String word) {
        String new_word="";
        char ch;
        for(int i=0; i<word.length(); i++) {
            ch=word.charAt(i);
            new_word=ch+new_word;
        }
        return new_word;
    }
    /**
     * This Function is used to get a words from a sentence
     * and reverse those words, forming a new sentence.
     *
     * First it stores 'ch' in 'word' as long as it is not a Whitespace...
     * and then it sends the word to, 'reverse_word(word)' and reverses
     * the word and forms a new string with it.
     *
     * @param sen1 The sentence to be reversed
     * @return The string that is contains the reversed version of the words.
     */
    static String reverse_sen_with_words(String sen1) {
        String new_str="",word="";
        char ch;
        for(int i=0;i<sen1.length();i++) {
            ch=sen1.charAt(i);
            // Store 'ch' in word as long as it is not a Whitespace.
            if(ch!=' ') {
                word+=ch;
            }

            if(ch==' ' || i==(sen1.length()-1)){
                new_str+=reverse_word(word)+" ";
                word="";
            }

        }
        return new_str;
    }
    public static void main(String args[]) {
        Scanner rinput = new Scanner(System.in);
        String old_str, new_str;

        System.out.println("Enter the String.");
        old_str = rinput.nextLine();

        new_str= reverse_sen_with_words(old_str);

        System.out.println(new_str);
    }
}