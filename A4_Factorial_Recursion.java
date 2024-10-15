/**
 *
 * Assignment 4
 * Calculate and display the factional of number using recursion.
 *
 */
public class A4_Factorial_Recursion {
    static int factorial(int prod, int ctr) {
        if (ctr == 1) {
            return prod;
        }
        return factorial(prod*ctr, ctr-1);
    }
    public static void main(String args[]) {
        int n=6;
        int fact=factorial(1, n);
        System.out.println(fact);
    }
}
