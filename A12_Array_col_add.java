/**
 *
 * Assignment 12
 * Find the sum of each column of two dimension array.
 *
 */
import java.util.*;
public class A12_Array_col_add
{
    // Gets the values to be filled in the array
    static int[][] getval(int n, int m)
    {
        int a[][]=new int[n][m];
        Scanner in=new Scanner(System.in);
        System.out.println("Enter all the values.");
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[i].length;j++) {
                a[i][j] = in.nextInt();
            }
        }
        return a;
    }
    // Prints and adds the array columns
    static void print_darray_add(int a[][],int n)
    {
        int na[]=new int[n];
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[i].length;j++)
            {
                System.out.print(a[i][j]+"\t");
                na[j]+=a[i][j];
            }
            System.out.print("\n");
        }
        print_array(na);
    }
    // Prints the sum of each column
    static void print_array(int a[])
    {
        for(int i=0;i<a.length;i++)
        {
            System.out.print("____");
        }
        System.out.println();

        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+ "\t");
        }
    }
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the number of Rows");
        int n=in.nextInt();
        System.out.println("Enter the number of Columns");
        int m=in.nextInt();
        int a[][]=getval(n,m);
        print_darray_add(a,m);
    }
}