package string;

public class balance {
    static boolean ispar(String x)
    {
        // add your code here
        if(x.length()==1)
        return false;
        int mid=(x.length()-1)/2;
        int i=mid;
        int j=mid+1;
        while(i>=0 && j<=x.length()-1)
        {
            if(x.charAt(i)=='(' && x.charAt(j)==')')
            {
             i--;
             j++;
            }
            else if(x.charAt(i)=='[' && x.charAt(j)==']')
            {
            i--;
            j++;
            }
            else if(x.charAt(i)=='{' && x.charAt(j)=='}')
            {
            i--;
            j++;
            }
            else
            {
                return false;
            }
        }
         return true;
    }
    public static void main (String args[])
    {
        String s="((}";
        System.out.println(ispar(s));
    }
}

