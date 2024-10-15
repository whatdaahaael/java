import java.util.*;
public class boards_gay
{
    static Scanner rinput=new Scanner(System.in);
    public static void two()
    {
        int size,ele=0,sn,loop;//size the array, element to dup the array, number to be search, used in loops
        System.out.println("How many numbers your want to enter in the array");
        size=rinput.nextInt();
        int a[]=new int[size];//the array
        System.out.println("Enter the numbers");
        for(loop=0;loop<size;loop++)//accepting numbers
        {
            a[loop]=rinput.nextInt();
        }
        System.out.println("Enter the number you want to search");
        sn=rinput.nextInt();
        for(loop=0;loop<size;loop++)//checking the numbers
        {
            ele=a[loop];
            if(ele==sn)
            {
                break;
            }
        }
        if(ele==sn)
        {
            System.out.println(ele);
        }
        else
        {
            System.out.println("NO SUCH ELEMENT");
        }
    }
    public static void three()
    {
        int uctr=0,vctr=0,loop;//uppercase counter, vowels counter, used in loops
        char ch[]=new char[10];//the array
        char dch;//to dup the ch[] to make it easier to use
        System.out.println("Enter the characters");
        for(loop=0;loop<10;loop++)//accepting numbers
        {
            ch[loop]=rinput.next().charAt(0);
        }
        for(loop=0;loop<10;loop++)//uppercase and vowels checker
        {
            dch=ch[loop];
            if(Character.isLetter(dch))//REMEMBER TO USE WRAPPER CLASS "CHARACTER" FOR "char" 
            {
                if(Character.isUpperCase(dch))//Uppercase
                {
                    uctr++;
                }
                dch=Character.toLowerCase(dch);
                switch(dch)//vowels, there is another way with if, but this is easier
                {
                    case 'a':
                    case 'e':
                    case 'i':
                    case 'o':
                    case 'u': 
                            vctr++;
                            break;
                    default : break;
                }
            }
        }
        System.out.println("The number of Uppercase Letters are "+uctr);
        System.out.println("The number of Vowels are "+vctr);
    }
    public static void four()
    {
        double ele=0.0, hv=0.0, da;//Sum of elements, highest element in the array, duplicating the array for making it easy
        int loop;//used in for loops
        double a[]=new double[20];
        System.out.println("Enter the Data Types");
        for(loop=0;loop<20;loop++)//accepting numbers
        {
            a[loop]=rinput.nextDouble();
        }
        for(loop=0;loop<20;loop++)//calculating sum and highest number in the arrays
        {
            da=a[loop];
            ele=ele+da;
            if(da>hv)
            {
                hv=da;
            }
        }
        System.out.println("Sum = "+ele);
        System.out.println("Highest = "+hv);
    }
    public static void five()
    {
        String s1,s2;//first string, second string
        System.out.println("Enter First String");
        s1=rinput.next();
        System.out.println("Enter Second String");
        s2=rinput.next();
        s1=s1.toUpperCase();
        s2=s2.toUpperCase();
        if(s1.equals(s2))//if its true
        {
            System.out.println("The two strings are same");
        }
        else
        {
            System.out.println("No, both strings are not the same");
            if(s1.compareTo(s2)>0)//s1>s2
            {
                System.out.println(s1+" is the greater string length wise");
            }
            else if(s2.compareTo(s1)>0)//s2>s1
            {
                System.out.println(s2+" is the greater string length wise");
            }
            else if(s1.compareTo(s2)==0)//s1==s2
            {
                System.out.println("Both are equal, Length wise");
            }
        }
    }
    public static void six()
    {
        String chs= "";//for checking if it is a palindrome or not
        String us;//user string
        int len,loop;//length() of the string, used in for loop
        char ch;//to get individual letter of the string
        System.out.println("Enter String");
        us=rinput.next();
        us=us.toLowerCase();
        len=us.length();
        for(loop=len-1;loop>=0;loop--)//checking of palindrome
        {
            ch=us.charAt(loop);
            chs=chs+ch;
        }
        if(chs.equals(us))
        {
            System.out.println(us+" is a palindrome string");
        }
        else
        {
            System.out.println("Not a Palindrome String");
        }
        rinput.close();
    }
}