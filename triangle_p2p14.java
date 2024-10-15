/**
 * Project 2 Program 14
 *
 * Triangle or Inverted Triangle
 */
import java.util.*;
public class triangle_p2p14
{
    public static void main()
    {
        int num,choice,loop1,loop2;
        Scanner rinput=new Scanner(System.in);
        System.out.println("Choose Option:"+"\n"+"1. Trianlge"+"\n"+"2. Inverted Triangle");
        choice=rinput.nextInt();
        System.out.println("Enter a Number");
        num=rinput.nextInt();
        switch(choice)
        {
            case 1:
                for(loop1=1;loop1<=num;loop1++)
                {
                    for(loop2=1;loop2<=loop1;loop2++)
                    {
                        System.out.print(loop1+" ");
                    }
                    System.out.println();
                }
                break;
            case 2:
                for(loop1=num;loop1>0;loop1--)
                {
                    for(loop2=1;loop2<=loop1;loop2++)
                    {
                        System.out.print(loop1+" ");
                    }
                    System.out.println();
                }
                break;
            default:
                System.out.println("Wrong Choice");
                break;
        }
    }
}