/**
 * A tech number has even number of digits.
 * If the number is split in two equal haves,
 * then the square of sum of these halves is equal to the number itself.
 *  Write a program to generate and print all four digits tech numbers.
 *  Example : 3025
 *  Square of sum of the halves = (30+25)2 
 *                              = (55)2  
 *                              = 3025
 * 
 * Sujan
 * Assignment 8
 */
public class A8_Tech_Number {
    /**
     * This functions calculates a number and a returns it to check if that number is a tech number or no.
     * Only send 4 DIGIT NUMBERS.
     * 
     * @param number
     * @return tech_Num_cal
     */
    static int tech_number_calculator(int number){
        String snum;
        int num1h, num2h, tech_Num_cal;
        
        // Converting the 'number' to  string
        snum = Integer.toString(number);

        /*
         * This:
         * Integer.parseInt(snum.substring(0, 2));
         * 
         * first gets the first half of a given 4 digit number.
         * Example: 3025
         * It returns: 30
         * 
         * It then converts it to a Integer, 'Integer.parseInt()'
         */
        num1h = Integer.parseInt(snum.substring(0, 2));

        /*
         * This:
         * Integer.parseInt(snum.substring(2, 4));
         * 
         * first gets the first half of a given 4 digit number.
         * Example: 3025
         * It returns: 25
         * 
         * It then converts it to a Integer, 'Integer.parseInt()'
         */
        num2h = Integer.parseInt(snum.substring(2, 4));

        /*
         * Convert the 'Math.pow((num1h+num2h),2)' into an 'int',
         * because it becomes a double data type.
         */
        tech_Num_cal=(int) Math.pow((num1h+num2h),2);
        return tech_Num_cal;
    }
    public static void main(String[] args) {
        
        // Generates all the 4 digit numbers...
        for(int number=1000;number<10000;number++){
            
            int tech_Num= tech_number_calculator(number);
            
            if(tech_Num == number){
                System.out.println(tech_Num + " is a Tech Number.");
            }
        }
    }
}