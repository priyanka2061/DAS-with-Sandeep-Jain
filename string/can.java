package string;

public class can {
   
    static void output(String s)
    {
        String st="";
        for(int i=0;i<s.length();i++)
        {
            st=s.charAt(i)+st;
           

        }
        System.out.println(st);
    }
    public static void main (String args[])
    {
        String s="I LOVE INDIA";
        output( s);

    }
    
}
