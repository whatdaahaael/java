/**
 *
 * Assignment 1
 * Display the entered number in words.
 * eg:
 * INPUT: 29
 * OUTPUT: TWENTY NINE
 *
 */

import java.util.*;
public class A1_num_to_str
{   
    static String sstr="";
    public static void singled(String str,int pos)
    {
        String num[]={"zero ", "one ", "two ","three ","four ","five ","six ","seven ","eight ","nine "};
        for(int i=pos; i < str.length() ; i++)
        {
            int n=Integer.parseInt(String.valueOf(str.charAt(pos)));
            sstr+=num[n];
        }
    }
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int num=s.nextInt();
        String str=String.valueOf(num);
        String a[]={"twenty ", "thirty ","forty ", "fifty ", "sixty ", "seventy ", "eighty ", "ninty "};
        boolean flag=true;
        if(num>9999){
            System.out.println("Invalid Input");
            System.exit(0);
        }
        if(num>999&&num<=9999)
        {
            singled(String.valueOf(str.charAt(0)), 0);
            sstr+="thousand ";
            str=str.substring(1);
            num=Integer.parseInt(str);
        }
        if(num>99&&num<=999)
        {
            singled(String.valueOf(str.charAt(0)), 0);
            sstr+="hundred and ";
            str=str.substring(1);
            num=Integer.parseInt(str);
        }
        if(num>=10&&num<=19)
        {
            switch(num)
                {
                    case 10:
                        sstr+="ten ";
                        break;
                    case 11: 
                        sstr+="eleven ";
                        break;
                    case 12: 
                        sstr+="twelve ";
                        break;
                    case 13: 
                        sstr+="thirteen ";
                        break;
                    case 14: 
                        sstr+="fourteen ";
                        break;
                    case 15: 
                        sstr+="fifteen ";
                        break;
                    case 16: 
                        sstr+="sixteen ";
                        break;
                    case 17: 
                        sstr+="seventeen ";
                        break;
                    case 18: 
                        sstr+="eighteen ";
                        break;
                    case 19: 
                        sstr+="nineteen ";
                        break;
            }
            flag=false;
        }
        else if(num>19&&num<=29)
        {
            sstr+=a[0];
        }
        else if(num>29&&num<=39)
        {
            sstr+=a[1];
        }
        else if(num>39&&num<=49)
        {
            sstr+=a[2];
        }
        else if(num>49&&num<=59)
        {
            sstr+=a[3];
        }
        else if(num>59&&num<=69)
        {
            sstr+=a[4];
        }
        else if(num>69&&num<=79)
        {
            sstr+=a[5];
        }
        else if(num>79&&num<=89)
        {
            sstr+=a[6];
        }
        else if(num>89&&num<=99)
        {
            sstr+=a[7];
        }
        if(flag)
        {
            singled(str, 1);
        }
        System.out.println(sstr);
    }
}
