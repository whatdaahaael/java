/**
 *
 * Assignment 3
 * A smith number is a composite number, the sum of whose digits is the sum of the digits of its
 * prime factors obtained as a result of prime factorization (excluding 1).
 * The first few such numbers are 4, 22, 27...
 * Write a program to input a number and check wheter it is a smith number or not
 * Sample data:
 * Input: 94
 * Output: SMITH Number
 *
 */
public class A3_Smith_Number {
    // To check if a number has more than 2 factors
    static boolean isCompositeNumber(int num) {
        int ctr=0;
        for (int i = 1; i <= num; i++) {
            if(num%i==0) {
                ctr++;
            }
        }

        if(ctr>2)
            return true;
        else return false;
    }
    // To check if the number is a prime number or not
    static boolean isPrimeNumber(int num) {
        int ctr=0;
        for (int i = 1; i <= num; i++) {
            if(num%i==0) {
                ctr++;
            }
        }

        if(ctr<=2)
            return true;
        else return false;
    }
    // To get the sum of the prime factors of the number
    static String getDigitsOfPrimeFactors(int num) {
        String sum="";
        int divnum=num;

        // gets the sum of the digits of the prime factors excluding 1
        while(divnum!=1) {
            for (int i = 2; i <= divnum; i++) {
                if (isPrimeNumber(i)) {
                    if (divnum % i == 0) {
                        sum += i;
                        divnum /= i;
                        break;

                    }
                }
            }
        }
        return sum;
    }
    // Adds the sum of the digits of the given number
    static int getSumOfDigits(String num) {
        char nums[]=num.toCharArray();
        int sum=0;
        for (int i = 0; i < nums.length; i++) {
            sum+=(int)nums[i]-48;
        }
        return sum;
    }
    public static void main(String args[]) {
        int num=1086;
        if(isCompositeNumber(num)) {
            String primefactors=getDigitsOfPrimeFactors(num);

            // Getting the sum of the digits of the orginal number and
            // the digits obtained as prime number from
            // prime factorization
            int sumOfNum=getSumOfDigits(Integer.toString(num));
            int sumOfPrimeNum=getSumOfDigits(primefactors);

            // Checking if the number is a Smith number or no
            if(sumOfNum==sumOfPrimeNum) {
                System.out.println("SMITH Number");
            }
            else {
                System.out.println("NOT SMITH Number");
            }
        }
        else {
            System.out.println("NOT SMITH number");
        }
    }
}
