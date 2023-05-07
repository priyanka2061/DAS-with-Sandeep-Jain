public class printnumber {

   static  void print(int n)
    {
        if(n==0)  // base condition
        {
            return ;
        }
       
        print(n-1);  // hypothesis
        System.out.println(n); // induction
    }
    public static void main (String args[])
    {
        int n=10;
        print(n);
    }
}
