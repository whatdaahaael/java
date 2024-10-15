import java.util.*;
/**
 * Design a class to overload a function joyString() as follows: 
 * void joyString(String s,char ch1,char ch2) - replace character ch1 with ch2 and print the new string. 
 * void joyString(String s)  ---print the first space and the last space from the string. 
 */
public class function_overload_joystring
{
    void joyString(String s,char ch1,char ch2)
    {
        int a;
        int len=s.length();
        String newStr="";
        for(a=0;a<len;a++)
        {
            if(s.charAt(a)==ch1)
            {
                newStr=newStr+ch2;
            }
            else
            {
                newStr=newStr+s.charAt(a);
            }
        }
        System.out.println(newStr);
    }
    void joyString(String s)
    {
    }
    public void main()
    {
        Scanner rinput=new Scanner(System.in);
        System.out.println("Enter the sentence");
        String sen=rinput.nextLine();
        System.out.println("Enter the letter you want to replace");
        char a=rinput.next().charAt(0);
        System.out.println("Enter the letter you want it to be replaced with");
        char b=rinput.next().charAt(0);
        joyString(sen,a,b);
        joyString(sen);
        rinput.close();
    }
}