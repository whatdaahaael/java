/**
 * Input two numbers m and n, find and print S where,
 * S= 𝑛!/(𝑚!(𝑛−𝑚)!)
 * 
 * Sujan
 * Assignment 2
 */
import java.util.Scanner;
 class A2_Factorial_Find_S{
    /**
     * This function returns a INTEGER, int data type number.
     * 
     * @return an INT number
     */
    static int getIntNum(){
        Scanner in = new Scanner(System.in);
        int number;
        System.out.println("Enter a number");
        number = in.nextInt();
        return number;
    }

    /**
     * This method calculates the factorial value of a given INTERGER, INT DATA TYPE NUMBER.
     * 
     * eg:
     * 3! = 1*2*3 = 6
     * @param num
     * @return the factorial value of num!
     */
    static int factorial(int num){
        int tot = 1;
        for(int loop=1;loop<=num;loop++){
            tot *= loop;
        }
        return tot;
    }
    
    public static void main(String args[]){
        int n, m, fn, fm;
        double S;
        
        // You have to give greater value for 'n' than 'm'
        n = getIntNum();
        m = getIntNum();

        //finds the factorial of a given 'int' value passed.
        fn = factorial(n);
        fm = factorial(m);
        
        S = fn/(fm*factorial((n-m)));

        System.out.println(S);
    }
 }