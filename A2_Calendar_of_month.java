/**
 *
 * Assignment 2
 * Display calendar of any month in a year.
 *
 */
import java.util.Scanner;
public class A2_Calendar_of_month {
    int m,y;
    // Initialization of values
    A2_Calendar_of_month(int month,int year) {
        m=month;
        y=year;
    }
    // Displaying the Calendar of the Month
    void displayMonthCalendar(){
        String month=getMonthName();
        int monthDaysCount=getDaysInMonth();
        int startDay=getFirstDay();

        // to go to next line after printing 7 numbers
        int nextItr=0;

        System.out.println("Month = "+month);
        System.out.println("Sun\tMon\tTue\tWed\tThu\tFri\tSat");
        // Print the number of spaces
        for(int i=1;i<startDay;i++){
            System.out.print("\t");
            nextItr++;
        }

        // Printing the Calendar
        for(int i=1;i<=monthDaysCount;i++) {
            System.out.print(i + "\t");
            nextItr++;
            if (nextItr == 7) {
                System.out.println();
                nextItr = 0;
            }

        }

    }
    // Getting the month name
    String getMonthName(){
        String monname[]={"January", "February", "March", "April", "May", "June",
                          "July", "August", "September", "October", "November", "December"};
        return monname[m-1];
    }
    // Getting the starting day of the Month
    int getFirstDay() {
        // Use Zeller's algorithm to calculate the day of the month
        if (m < 3) {
            m += 12;
            y -= 1;
        }
        int k = y % 100;
        int j = y / 100;

        // 1 because we need the starting day
        int day = 1;
        int mm = m;
        int h = (day + 13 * (mm + 1)) / 5 + k + (k / 4) + (j / 4) - 2 * j;
        return (h % 7 + 7) % 7 + 1;
    }
    // Getting the number of days in a month
    int getDaysInMonth(){
        int days[]={31,28,31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        // Check if the year is a leap year
        if(y%4==0||y%400==0) {
            days[1]=29;
        }
        return days[m-1];
    }

    public static void main(String args[]) {
        Scanner in=new Scanner(System.in);
        int mon, yr;

        System.out.println("Enter the year.");
        yr=in.nextInt();
        System.out.println("Enter the month.");
        mon=in.nextInt();

        A2_Calendar_of_month obj= new A2_Calendar_of_month(mon,yr);
        obj.displayMonthCalendar();
    }
}
