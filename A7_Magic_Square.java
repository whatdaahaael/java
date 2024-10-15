/**
 *
 * Assignment 7
 * Display the magic square: A magic square is a square matrix whose
 * sum of diagonal elements, row elements, column elements are same.
 *
 */
import java.util.*;
public class A7_Magic_Square {
    int magsq[][];
    int size;
    // Initializing the data
    A7_Magic_Square(int ss, int a[][]) {
        magsq=a;
        size=ss;
    }
    // Checking if the array is a magic square
    boolean checkMagicSquare() {
        int sumr, sumc, sumfs, sumbs;
        sumr=sumRow();
        sumc=sumCol();
        sumfs=sumForwardSlash();
        sumbs=sumBackslash();

        if(sumr==sumc&&sumfs==sumbs){
            return true;
        }
        return false;
    }
    // Checks if all the rows have the same sum
    int sumRow(){
        int sumrows[]=new int[size];
        // Value of each row
        for (int count = 0; count < size; count++) {
            int sum=0;
            for (int j = 0; j < size; j++) {
                sum+=magsq[count][j];
            }
            sumrows[count]=sum;
        }
        // Checking the rows
        boolean flag=false;
        for (int i = 0; i < size-1; i++) {
            if(sumrows[i]==sumrows[i+1]) {
                flag=true;
            } else {
                flag=false;
                System.out.println("The rows don't have the same sum.");
                System.exit(0);
            }
        }

        if(flag==true){
            return sumrows[0];
        } else return 0;
    }
    // Checks if all the columns have the same sum
    int sumCol(){
        int sumcols[]=new int[size];
        // Value of each row
        for (int count = 0; count < size; count++) {
            int sum=0;
            for (int j = 0; j < size; j++) {
                sum+=magsq[j][count];
            }
            sumcols[count]=sum;
        }
        // Checking the columns
        boolean flag=false;
        for (int i = 0; i < size-1; i++) {
            if(sumcols[i]==sumcols[i+1]) {
                flag=true;
            } else {
                flag=false;
                System.out.println("The columns don't have the same sum.");
                System.exit(0);
            }
        }

        if(flag==true){
            return sumcols[0];
        } else return 0;
    }
    // Gets the sum of the first diagonal, Forward Slash
    int sumForwardSlash() {
        int sum=0;
        int j=size-1;
        for (int i = 0; i < size; i++) {
            sum+=magsq[i][j--];
        }
        return sum;
    }
    // Gets the sum of the second diagonal, Backslash
    int sumBackslash() {
        int sum=0;
        for (int i = 0; i < size; i++) {
            sum+=magsq[i][i];
        }
        return sum;
    }
    void displayResult(boolean flag) {
        if(flag) {
            System.out.println("Is Magic Square");
        }
        else
            System.out.println("Not a Magic Square");
    }

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        // Getting the size of the array
        int ss;
        System.out.println("Enter the size of the array");
        ss=in.nextInt();
        // Filling the array
        int ar[][]= new int[ss][ss];
        System.out.println("Enter the array values");
        for (int i = 0; i < ss; i++) {
            for (int j = 0; j < ss; j++) {
                ar[j][i]=in.nextInt();
            }
        }
        // Creating the object of the class
        A7_Magic_Square obj= new A7_Magic_Square(ss,ar);
        obj.displayResult(obj.checkMagicSquare());
    }
}