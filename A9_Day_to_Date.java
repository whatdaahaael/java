/**
 *
 * Assignment 9
 * Display a date from entered day number
 * Input:
 * Enter day no: 123
 * Enter the year: 2009
 * Output:
 * 3rd May, 2009
 *
 */
import java.util.*;
public class A9_Day_to_Date {
    // Check if the given year is a leap year or not
    static boolean isLeapYear(int year) {
        if(year%4==0||year%400==0)
            return true;
        else
            return false;
    }
    public static void main(String args[]) {
        Scanner in=new Scanner(System.in);
        int day, year, mon;

        System.out.print("Enter day no: ");
        day= in.nextInt();
        System.out.print("Enter the year: ");
        year= in.nextInt();
        mon=0;

        String months[]="January February March April May June July August September October November December".split(" ");
        // Getting the number of days for that year
        int days[]={31,isLeapYear(year)?29:28,31,30,31,30,31,31,30,31,30,31};

        // If there are days entered greater than 365 or 366 for that year then go to the next year
        while(day>(isLeapYear(year)?366:365)){
          day-=(isLeapYear(year)?366:365);
          year++;
        }
        // Getting the day
        while(day>days[mon]) {
            day-=days[mon++];
        }
        System.out.print(day);
        String s="";
        switch (day) {
            case 1:
            case 21:
            case 31:
                s="st";
                break;
            case 2:
            case 22:
                s="nd";
                break;
            case 3:
            case 23:
                s="rd";
                break;
            default:
                s="th";
                break;
        }
        System.out.print(s+" "+months[mon]+", "+year);
    }
}