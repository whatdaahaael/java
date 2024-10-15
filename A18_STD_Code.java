/**
 * Write a program in Java to enter the STD Code of important cities in two
 * different Single Dimensional Arrays.
 * Write program in java to know the STD Code of a particular city entered
 * by the user. If it is present then display the STD code along with city
 * otherwise display "not found".
 *
 * City         STD Code
 * Faridabad    0129
 * Guwahati     0361
 * Jamshedpur   0657
 * Jaipur       0141
 * Kolkata      033
 * Mumbai       022
 * New Delhi    011
 * Pune         0212
 *
 * Sample Input     : Ranchi
 * Sample Output    : "Not Found"
 *
 * Sujan
 * Assignment 18
 */
import java.util.*;
public class A18_STD_Code {
    public static void main(String[] args) {
        Scanner rinput = new Scanner(System.in);
        String ucity;
        String cities[]= {
                "Faridabad",
                "Guwahati",
                "Jamshedpur",
                "Jaipur",
                "Kolkata",
                "Mumbai",
                "New Delhi",
                "Pune"
        };
        String std_codes[]= {
                "0129",
                "0361",
                "0657",
                "0141",
                "033",
                "022",
                "011",
                "0212"
        };

        int pos=0;
        boolean flag = false;
        System.out.println("Enter the city");
        ucity = rinput.next();

        /*
        * Checks whether the city name entered by the is available
        * in the 'cities' array, if it is available then change flag to 'true',
        * else 'false'.
        */
        for(int i =0; i<cities.length; i++){
            if(ucity.equalsIgnoreCase(cities[i])){
                flag = true;
                pos = i;
                break;
            }
        }

        if(flag){
            System.out.println("City"+"\t"+"STD Code");
            System.out.println(cities[pos]+"\t"+std_codes[pos]);
        }
        else{
            System.out.println("Not Found");
        }
    }
}