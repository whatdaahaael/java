/**
 *
 * Assignment 5
 * Display the Fibonacci Series using recursion
 *
 */
public class A5_Fibonacci_Series_Recursion {
    static int fibonacci(int add, int b, int ctr) {
        if(ctr==0) return add;
        return fibonacci(b,add+b,ctr-1);
    }

    public static void main(String args[]) {
        int max=15;
        int sum= fibonacci(0,1,max);
        System.out.println(sum);
    }
}
