/**
 *
 * Assignment 20
 * While a program to declare a square matrix A[][] of order M x M where
 * "M' is the number of rows and the number of columns, such that M must
 * be greater than 2 and less than 10. Accept the value of M as user input.
 * Display an appropriate message for an invalid input. Allow the user to
 * input integers into the matrix. Perform the following tasks:
 * a) Display the original matrix.
 * b) Rotate the matrix 90° clockwise as shown below:
 * Original matrix Rotated matrix
 * 123              741
 * 456              852
 * 789              963
 * c) Find the sum of the elements of the four corners of the matrix. Test your program
 * for the following data and some random data:
 * Example 1:
 * INPUT : M=3
 * 349
 * 258
 * 167
 * OUTPUT:
 * ORIGINAL MATRIX
 * 149
 * 258
 * 167
 * MATRIX AFTER ROTATION
 * 123
 * 654
 * 789
 * Sum of the corner elements = 20
 *
 */
import java.util.*;
public class  A20_Rotate_Matrix {
    static int M;
    static int[][] set2da() {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter size.");
        M=in.nextInt();
        if(M>10) {
            System.out.println("SIZE OUT OF RANGE");
            System.exit(0);
        }
        int a[][]=iniar();
        return a;
    }
    static int[][] iniar() {
        // Initializing the array
        System.out.println("Enter the values");
        Scanner in=new Scanner(System.in);
        int a[][]=new int[M][M];
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < M; j++) {
                a[i][j]=in.nextInt();
            }
        }
        return a;
    }
    static void print2da(int a[][]) {
        // Printing the double dimension array
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < M; j++) {
                System.out.print(a[i][j]+"\t");
            }
            System.out.println();
        }
    }
    static int[][] tpose2da(int a[][]) {
        // Transpose the array
        for (int i = 0; i < M; i++) {
            for (int j = i; j < M; j++) {
                int temp = a[i][j];
                a[i][j] = a[j][i];
                a[j][i] = temp;
            }
        }
        return a;
    }
    static int corsum2da(int a[][]) {
        // Sum of the corners of the array
        return a[0][0]+a[M-1][0]+a[0][M-1]+a[M-1][M-1];
    }
    static int[][] rotate2da(int a[][]) {
        int na[][]=tpose2da(a);
        int max=M;
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < M/2; j++) {
                int temp = na[i][j];
                na[i][j] = na[i][max-j- 1];
                na[i][max-j - 1] = temp;
            }
        }
        return a;
    }
    public static void main(String args[]) {
        int a[][]=set2da();
        if(M>2&&M<10) {
            System.out.println("Original Array:");
            print2da(a);
            System.out.println("Rotated Array 90:");
            print2da(rotate2da(a));
            System.out.println("Sum of the corner elements = " + corsum2da(a));
        }
        else {
            System.out.println("Size out of range");
        }
    }
}