import java.util.*;
public class double_letter_sequence
{
    public static void main()
    {
        Scanner rinput =new Scanner(System.in);
        String sen=rinput.next();
        String usen=sen.toUpperCase();
        char ch1,ch2;
        int len=usen.length();
        int a,ctr=0;
        for(a=0;a<len;a++)
        {
            ch1=usen.charAt(a);
            ch2=usen.charAt(a+1);
            if(Character.isLetter(ch1)&&Character.isLetter(ch2)&&ch1==ch2)
            {
                ctr++;
            }
        }
        System.out.println("There are total of "+ctr+" double letter sequence(s)");
        rinput.close();
        
    }
}