/**
 *
 * Assignment 14
 * Convert a decimal number to a Roman numerical
 *
 */
public class A14_Dec_to_Roman {
    //Converts a number to Roman Number
    static String convertToRoman(int num) {
        int[] numbers = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
        String[] roman = { "M", "CM", "D", "CD", "C", "XC", "L",
                "XL", "X", "IX", "V", "IV", "I" };
        int ctr=0;
        String rnum="";
        while (num>0) {
            if(num>=numbers[ctr]){
                rnum+=roman[ctr];
                num-=numbers[ctr];
            }
            if (num<numbers[ctr]) {
                ctr++;
            }
        }

        return rnum;
    }
    public static void main(String args[]) {
        int num=3999;
        String romannum=convertToRoman(num);
        System.out.println(num);
        System.out.println(romannum);
    }
}
