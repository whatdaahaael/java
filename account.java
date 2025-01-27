/**
 * Project 1 Program 8
 * Write a complete java program with the following members of its class ...
 * Assume that the above operations have to be performed for a single account holder. 
 */
import java.util.*;
import java.io.*;
public class account
{
    private int acc_num;
    private String acc_name;
    private double Bal;
    account()
    {
        acc_num=0;
        acc_name="";
        Bal=0.0;
    }
    public void getValue()
    {
        Scanner rinput=new Scanner(System.in);
        System.out.println("Enter your name");
        acc_name=rinput.next();
        System.out.println("Enter your account number");
        acc_num=rinput.nextInt();
        System.out.println("Enter your account balance");
        Bal=rinput.nextInt();
    }
    public void Display()
    {
        System.out.println("");
        System.out.println("This account is owned by: "+acc_name);
        System.out.println("The account Number: "+acc_num);
        System.out.println("The balance of the account: "+Bal);
    }
    public void Deposit()
    {
        Scanner rinput=new Scanner(System.in);
        System.out.println("");
        System.out.println("How much you want to deposit?");
        int dep=rinput.nextInt();
        Bal=Bal+dep;
        System.out.println("Successfully Deposited "+dep+" INR");
        Question();
    }
    public void Withdrawal()
    {
        Scanner rinput=new Scanner(System.in);
        System.out.println("");
        System.out.println("How much you want to withdraw?");
        int with=rinput.nextInt();
        if(with<=Bal)
        {
            Bal=Bal-with;
            System.out.println("Successfully withdrawed "+with+" INR");
            Question();
        }
        else
        {
            System.out.println("Error, Terminating.");
        }
    }
    public void Question()
    {
        Scanner rinput=new Scanner(System.in);
        System.out.println("");
        System.out.println("Have you Finished depositing or withdrawing?(Y/N)");
        String response1=rinput.next();
        if(response1.equalsIgnoreCase("n"))
        {      
            System.out.println("");
            System.out.println("Do you want to deposit or withdraw?(D/W)");
            String response2=rinput.next();
            if(response2.equalsIgnoreCase("d"))
            {
                Deposit();
            }
            else if(response2.equalsIgnoreCase("w"))
            {
                Withdrawal();
            }
        }
        else if(response1.equalsIgnoreCase("y"))
        {
            System.out.println("");
            System.out.println("Bye. Have a great Day!");
            System.out.println("The Account Balance in the end is: "+Bal);
        }
    }
    public void main()
    {
        account obj=new account();
        obj.getValue();
        obj.Display();
        obj.Question();
    }
}