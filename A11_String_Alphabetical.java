/**
 *
 * Assignment 11
 * Display the entered string in Alphabetical order
 *
 */
public class A11_String_Alphabetical {
    // Sorts the string in Alphabetical order
    static char[] setAscend(String sen) {
        char a[]=sen.toCharArray();
        for (int i = 0; i < a.length; i++) {
            for (int j = i+1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    char temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        return a;
    }
    // Prints the sorted string
    static void printArr(char arr[]) {
        for (int i = 0; i < arr.length; i++) {
            if(Character.isLetter(arr[i]))
                System.out.print(arr[i]);
        }
    }
    public static void main(String args[]) {
        String sen="A quick brown fox jumps over the lazy dog.";
        char arr[]=setAscend(sen.toLowerCase());
        printArr(arr);
    }
}
