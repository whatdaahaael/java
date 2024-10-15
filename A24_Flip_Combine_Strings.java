/**
 *
 * Assignment 24
 * Define a class to accept two strings and convert both the strings to
 * lowercase and check whether both the strings have even number of characters, 
 * If so, then reverse both the strings and frame a new string by joining the 
 * first reversed string followed by the second reversed string.
 * Example:
 * Input string1: exam
 * Input string2: exit
 * Output: maxetixe
 *
 */
import java.util.*;
public class A24_Flip_Combine_Strings {
    static String reverse_word(String word) {
        String rword="";
        for(int i=word.length()-1;i>=0;i--) {
            char ch=word.charAt(i);
            rword+=ch;
        }
        return rword;
    }
    public static void main(String args[]) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter first Word");
        String word1=in.next().toLowerCase();
        System.out.println("Enter Second Word");
        String word2=in.next().toLowerCase();
        if(word1.length()%2==0&&word2.length()%2==0) {
            System.out.println(reverse_word(word1)+reverse_word(word2));
        }
        else
            System.out.println("Not even.");
    }
}