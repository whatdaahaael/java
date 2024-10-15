/**
 * Project 2 Program 10
 *
 * Print the appropriate stream allotted to the candidate. 
 * Write a program in Java to accept marks in English, Maths and Science from the Console.
 */
import java.util.*;
public class marks_p2p10
{
    int eng,maths,science;
    Scanner rinput=new Scanner(System.in);
    public void accept()
    {
        System.out.println("Enter marks in English");
        eng=rinput.nextInt();
        System.out.println("Enter marks in Maths");
        maths=rinput.nextInt();
        System.out.println("Enter marks in Science");
        science=rinput.nextInt();
    }
    public void stream_allocating()
    {
        if((eng+maths+science)/3>=80)
        {
            System.out.println("The stream for you is: Pure Science");
        }
        else if((eng+maths)/2>=80&&maths>=60)
        {
            System.out.println("The stream for you is: Bio, Science");
        }
        else if((eng+maths+science)/3>=60)
        {
            System.out.println("The stream for you is: Commerce");
        }
    }
    public void main()
    {
        accept();
        stream_allocating();
    }
}