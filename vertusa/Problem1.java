package vertusa;

public class Problem1 {
    public static void main(String args[])
    {
        int x=0;
        int  n=25;
        while(n>1 || n>0)
        {
            x=((x*10)+n%8);
            n=n/8;
        }
        n=0;
     
        while(x>0)
        {
            n=((n*10)+x%10);
            x=x/10; 
        }
        System.out.println(n);
    }
}
