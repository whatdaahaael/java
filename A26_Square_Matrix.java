/**
 *
 * Assignment 26
 * Write a program to declare a square matrix A[][] of order (M × M) where 'M' must be
 * greater than 3 and less than 10. Allow the user to input positive integers into this 
 * matrix. Perform the following tasks on the matrix:
 * (a) Sort the non-boundary elements in ascending order using any standard sorting 
 * technique and rearrange them in the matrix.
 * (b) Calculate the sum of both the diagonals.
 * (c) Display the original matrix, rearranged matrix and only the diagonal elements of 
 * the rearranged matrix with their sum.
 * Example 1
 * INPUT :M= 4
 * 9 2 1 5
 * 8 13 8 4
 * 15 6 3 11
 * 7 12 23 8
 * OUTPUT:
 * ORIGINAL MATRIX
 * 9 2 1 5
 * 8 13 8 4
 * 15 6 3 11
 * 7 12 23 8
 * REARRANGED MATRIX
 * 9 2 1 5
 * 8 3 6 4
 * 15 8 13 11
 * 7 12 23 8
 * DIAGONAL ELEMENTS
 * 9 5
 * 3 6
 * 8 13
 * 7 8
 * SUM OF THE DIAGONAL ELEMENTS = 59
 *
 */
import java.util.Scanner;
public class A26_Square_Matrix {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size (M): ");
        int M = scanner.nextInt();

        if (M < 4 || M >= 10) {
            System.out.println("M must be greater than 3 and less than 10.");
            System.exit(0);
        }

        int arr[][] = new int[M][M];

        System.out.println("Enter positive values");
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < M; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }

        System.out.println("ORIGINAL MATRIX");
        printAr(arr);

        // Sort the non-boundary elements in ascending order
        int[] sortedele = sortNonBoundaryElements(arr);

        // Rearrange the arr with sorted elements
        rearrangeAr(arr, sortedele);

        System.out.println("REARRANGED MATRIX");
        printAr(arr);

        // Calculate the sum of both diagonals and display diagonal elements
        int sum = sumDiagonals(arr);

        System.out.println("DIAGONAL ELEMENTS");
        printDiagonals(arr);

        System.out.println("SUM OF THE DIAGONAL ELEMENTS = " + sum);
    }
    // Prints the array
    static void printAr(int arr[][]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    // Sorts the non boundary elements
    static int[] sortNonBoundaryElements(int arr[][]) {
        // Extract non-boundary elements into a 1D array
        int size = (arr.length - 2) * (arr.length - 2);
        
        int[] bele = new int[size];
        int ctr = 0;
        for (int i = 1; i < arr.length - 1; i++) {
            for (int j = 1; j < arr[i].length - 1; j++) {
                bele[ctr] = arr[i][j];
                ctr++;
            }
        }

        // Sort the 1D array
        for (int i = 0; i < bele.length; i++) {
            for (int j = i+1; j < bele.length; j++) {
                if(bele[i]>bele[j]) {
                    int temp=bele[i];
                    bele[i]=bele[j];
                    bele[j]=temp;
                }
            }
        }

        return bele;
    }
    // Rearranges the 2D array with sorted values
    static void rearrangeAr(int arr[][], int sortedele[]) {
        int ctr = 0;
        for (int i = 1; i < arr.length - 1; i++) {
            for (int j = 1; j < arr[i].length - 1; j++) {
                arr[i][j] = sortedele[ctr];
                ctr++;
            }
        }
    }
    // Gets the sum of the diagonals
    static int sumDiagonals(int arr[][]) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i][i];           // Main diagonal
            sum += arr[i][arr.length - i - 1]; // Other diagonal
        }
        return sum;
    }
    // Prints the diagonals
    static void printDiagonals(int arr[][]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i == j || j == arr.length - i - 1) {
                    System.out.print(arr[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}