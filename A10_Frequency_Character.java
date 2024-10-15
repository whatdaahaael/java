/**
 *
 * Assignment 10
 * To display the frequency of each character in a string
 *
 */
public class A10_Frequency_Character {
    // Getting the frequency of each character
    static int[] getFrequency(String s) {
        // Assuming ASCII characters
        // Because we can convert the character to ascii value and then
        // increase its counts instead of checking over and over
        int[] freq = new int[256];

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            freq[ch]++;
        }
        return freq;
    }
    static void printFreq(int freq[]) {
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] > 0) {
                System.out.println((char) i + " is present " + freq[i] + " times.");
            }
        }
    }
    public static void main(String args[]) {
        String s="Bishop Cottons Boys' School";
        int freq[]=getFrequency(s);
        printFreq(freq);
    }
}
