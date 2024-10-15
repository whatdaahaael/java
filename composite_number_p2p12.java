/**
 * Project 2 Program 12
 * 
 * Write menu driven program to check and display weather a number input by the user is a composite number or no
 */
import java.util.*;
public class composite_number_p2p12
{
    public static void main()
    {
        int unum,loop,ctr=0,choice;//where unum= user number, ctr=counter
        Scanner rinput=new Scanner(System.in);
        System.out.println("Choose an option"+"\n"+"1. Composite Number");
        choice=rinput.nextInt();
        switch(choice)
        {
            case 1:
                System.out.println("Enter a number");
                unum=rinput.nextInt();
                for(loop=2;loop<unum;loop++)
                {
                    if(unum%loop==2)
                    {
                        ctr++;
                    }
                }
                if(ctr>2)
                {
                    System.out.println(unum+" is a Composite Number");
                }
                else
                {
                    System.out.println(unum+" is not a Composite Number");
                }
                break;
            default:
                System.out.println("Invalid Choice");
                break;
        }
    }
}