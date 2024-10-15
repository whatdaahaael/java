/**
 *
 * Assignment 21
 * Write a program to accept a sentence which may be terminated by either
 * '.' Or "?' only. The words are to be separated by a single blank space.
 * Print an error message if the input does not terminate with '.' Or '?'.
 * You can assume that no word in the sentence exceeds 15 characters, so
 * that you get a proper formatted output. Perform the following tasks:
 * i) Convert the first letter of each word to uppercase.
 * ii) Find the number of vowels and consonants in each word and display them
 * with proper heading along with the words.
 * Test your program with the following inputs:
 * Example 1
 * Input: Intelligence plus character is education.
 * Output:
 * Intelligence plus character is education.
 * Word            Vowels   Constants
 * Intelligence    5        7
 * Plus            1        3
 * Character       3        6
 * Is              1        1
 * Education       5        4
 *
 */
import java.util.*;
public class A21_Sentence_voc_ctr
{
    // Counts the vowels and consonants
    static void printvals(String word)
    {
        int vctr=0,cctr=0;
        
        for(int chp=0;chp<word.length();chp++)
        {
            char ch=Character.toLowerCase(word.charAt(chp));
            //CHANGE FOR NUMBERS AND CHARS
            switch(ch)
            {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    vctr++;
                    break;
                default:
                    cctr++;
                    break;
            }
        }
        System.out.printf("%-15s %-8d %-8d%n",word,vctr,cctr);
    }
    // Gets the word and then calculates the vowels and consonants and prints
    static void countVAL(String sen)
    {
        System.out.printf("%-15s %-8s %-8s%n","Word","Vowels","Constants");
        String word[]=sen.split(" ");
        int len=word.length;
        for (int i = 0; i <len; i++) {
            printvals(Character.toUpperCase(word[i].charAt(0)) + word[i].substring(1, word[i].length()));
        }
    }
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter sentence");
        String MSTR=in.nextLine();
        int MSTRlen=MSTR.length()-1;
        if(MSTR.charAt(MSTRlen)=='.'||MSTR.charAt(MSTRlen)=='?')
        {
            System.out.println(MSTR);
            countVAL(MSTR.substring(0, MSTRlen).toLowerCase());
        }
        else
        {
            System.out.println("ERROR");
        }
    }
}