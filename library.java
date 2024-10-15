public class library
{
    public static void coneverting_to_string()
    {
        //primitive data types to string
        int a=2;
        long b=200;
        double c=20.0;
        float d=20;
        String p=Integer.toString(a);//any int value in brackets
        String n=Long.toString(b);//any long value in brackets
        Double.toString(c);//any double value in brackets
        Float.toString(d);//any float value in brackets
        
        //string to primitive data types
        String s="1";
        Integer.parseInt(s);//any string value
        Long.parseLong(s);//any string value
        Float.parseFloat(s);//any string value
        Double.parseDouble(s);//any string value
        
        System.out.println(p);
        System.out.println(n);
    }
}