import java.util.*;
/**
 * Design a class to overload a function check() as follows:
 * void check(String str, char ch)-- print the frequency of a charecter in the string 
 * ex-
 * seccuess,s
 * output
 * 3 times
 * 
 * void check(String s1)-- to display only vowels from s1
 * ex- 
 * School
 * output
 * o
 */
public class function_overloading_check
{
    void check(String str,char ch)
    {
        int ctr=0,a;
        int len=str.length();
        for(a=0;a<len;a++)
        {
            if(str.charAt(a)==ch)
            {
                ctr++;
            }
        }
        System.out.println(ctr);
    }
    void check(String s1)
    {
        s1=s1.toLowerCase();
        int len=s1.length();
        char ch;
        int a;
        for(a=0;a<len;a++)
        {
            ch=s1.charAt(a);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
            {
                System.out.println(ch);
            }
        }
    }
    public void main()
    {
        Scanner rinput=new Scanner(System.in);
        System.out.println("Enter a word");
        String word=rinput.next();
        System.out.println("Enter the letter you want to check the frequency of");
        char letter=rinput.next().charAt(0);
        check(word,letter);
        check(word);
        rinput.close();
    }
}