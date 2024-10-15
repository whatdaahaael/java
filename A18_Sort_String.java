/**
 *
 * Assignment 18
 * Write a program which takes a string (maximum 80 characters) terminated
 * by a full stop. The words in this string are assumed to be separately by
 * one or more blanks. Arrange the words of the input string in descending
 * order of their lengths. Same length words should be sorted alphabetically.
 * Each word must start with a n uppercase letter and the sentence should
 * be terminated by a full stop.
 * 'Test your program from the following data and some random data.
 *
 * Sample Data:
 * Input: "This is human resource department."
 * Output: Department Resource Human This Is.
 * Input: "To handle yourself use your head and to handle others use your heart."
 * Output: Yourself if Handle Handle Other Heart Head You're your And Use Use To To.
 * 
 */
public class A18_Sort_String {
    // Sorting the string
    static String[] sortString(String s) {
        String ns[]=s.split(" ");

        for (int i = 0; i < ns.length; i++) {
            for (int j = i+1; j < ns.length; j++) {
                if(ns[i].length()==ns[j].length()){
                    if(ns[i].charAt(0)>ns[j].charAt(0)) {
                        String temp = ns[i];
                        ns[i] = ns[j];
                        ns[j] = temp;
                    }
                }else if (ns[i].length()<ns[j].length()){
                    String temp=ns[i];
                    ns[i]=ns[j];
                    ns[j]=temp;
                }
            }
        }
        return ns;
    }
    // Prints the sorted string
    static void printString(String arr[]) {
        for (int i = 0; i < arr.length; i++) {
            // Converts the first letter to uppercase and then adds the rest of the word
            System.out.print((Character.toUpperCase(arr[i].charAt(0))+arr[i].substring(1,arr[i].length()))+" ");
        }
        System.out.print(".");
    }
    public static void main(String args[]) {
        String s="To handle yourself use your head and to handle others use your heart.";
        if(s.charAt(s.length()-1)=='.') {
            String arr[] = sortString(s.substring(0,s.length()-1));
            printString(arr);
        }
        else {
            System.out.println("Incorrect Sentence.");
        }
    }
}