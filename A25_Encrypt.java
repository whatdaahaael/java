/**
 * Write a program in java to accept a word and encrypt as follows:
 * Word     Encrypted Form
 * Delhi    eFmiJ
 * Kolkata  LPmLBuB
 * Patna    qBuoB
 *
 * Sujan
 * Assignment 25
 */
import java.util.*;
public class A25_Encrypt {
    /**
     * This Function is used to encrypt the given word.
     * First it adds 1 to the characters of the word and
     * then if it is an even number, it makes it Uppercase
     * or if it is odd numbers, then Lowercase.
     *
     * @param word
     * @return encrypted_word
     */
    static String encrypt(String word){
        char ch;
        String encrypted_word="";
        for (int i = 0; i < word.length(); i++) {
            ch=word.charAt(i);
            ch++;
            if(Character.isLetter(ch)){
                // If the character 'ch' is even, then make it uppercase, and vice versa
                ch=(ch%2==0)?Character.toUpperCase(ch):Character.toLowerCase(ch);
            }
            encrypted_word+=ch;
        }
        return encrypted_word;
    }
    public static void main(String args[]) {
        Scanner rinput = new Scanner(System.in);
        String word;
        System.out.println("Enter the Word");
        word = rinput.next();
        System.out.println("Word"+"\t"+"Encrypted Form");
        System.out.println(word+"\t"+encrypt(word));
    }
}