/**
 *
 * Assignment 6
 * Calculate GCD using recursion
 *
 */
public class A6_GCD_Recursion {
    // Calculates GCD of 2 numbers
    public static int getGCD(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return getGCD(b, a % b);
        }
    }
    public static void main(String[] args) {
        int num1 = 30;
        int num2 = 250;
        int gcd = getGCD(num1, num2);
        System.out.println(gcd);
    }
}