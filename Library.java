/**
 * Project 1 Program 12
 * Define a class called Library with the following description: 
 * Instance variables/data members: 
 * int acc_num – stores the accession number of the book 
 * String title – stores the title of the book stores the name of the author 
 * Member Methods: 
 * (i) void input() – To input and store the accession number, title and author. 
 * (ii)void compute() – To accept the number of days late, calculate and display and fine charged at the rate of Rs.2 per day. 
 * (iii) void display() - To display the details in the following format: 
 * Accession No.         Title         Author          Days_Late               Fine
 * xxxxx                     xxxx         xxxx             xx           xxx
 * Write a main method to create an object of the class and call the above member methods. 
 */
import java.util.*;
public class Library
{
    int acc_num,days,fine;
    String title,author;
    void input()
    {
        Scanner rinput=new Scanner(System.in);
        System.out.println("Enter the Title of the Book");
        title=rinput.nextLine();
        System.out.println("Enter the name of Author");
        author=rinput.nextLine();
        System.out.println("Enter the accession number of the Book");
        acc_num=rinput.nextInt();
    }
    void compute()
    {
        Scanner rinput=new Scanner(System.in);
        System.out.println("Enter the number of days late");
        days=rinput.nextInt();
        fine=days*2;
        System.out.println("\n"+"You have been fined "+fine+" INR");
    }
    void display()
    {
        System.out.println("\n"+"Accession No."+"\t \t"+"Title"+"\t"+"Author"+"\t"+"Days_Late"+"\t"+"Fine");
        System.out.println(acc_num+"\t \t"+title+"\t"+author+"\t"+days+"\t \t"+fine);
    }
    public void main()
    {
        Library obj=new Library();
        obj.input();
        obj.compute();
        obj.display();
    }
}