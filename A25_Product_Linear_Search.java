/**
 *
 * Assignment 25
 * Define a class to accept and store N product names in an array and search
 * for a product input by the user and display the position if it is found in
 * the array. otherwise display appropriate error message using Linear search
 * technique. Also display all the products that begins with a vowel.
 *
 */
import java.util.*;
public class A25_Product_Linear_Search {
    public static void main (String args[]){
        Scanner in = new Scanner(System.in);

        // Number of Products
        System.out.println("Enter the number of products.");
        int n = in.nextInt();

        // Name of the Products
        System.out.println("Enter the names of the products.");
        String a[] = new String[n];
        for (int i = 0; i < n; i++) {
            a[i]= in.next();
        }

        // Product to be searched
        System.out.println("What do you want to search for");
        String usearch = in.next();
        boolean flag=false;
        int pos=0;

        // Linear search
        for (int i = 0; i < n; i++) {
            if(usearch.equals(a[i])) {
                flag=true;
                pos=i+1;
                break;
            }
        }
        System.out.println(flag?("Found at "+pos+" position."):("Not found"));

        // Products that begin with a vowel
        System.out.println("All products that begin with a vowel are:");
        for (int i = 0; i < n; i++) {
            switch(a[i].charAt(0)) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    System.out.println(i+1+". "+a[i]);;
                    break;
            }
        }
    }
}