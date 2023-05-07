public class power {
      static long m=(long)1e7;
      static long power(int N,int R)
    {
        
       //Your code here
      
       if(R==0)
        return 1;
        long k=power(N,R/2);
       if(R%2==0)
       return (k%m*k%m)%m;
       else
       {
          return (N*k%m*k%m)%m;  
       }
        
    }
    public static void main (String args[])
    {
        int N=3;
        int R=61;
        System. out.println(power( N, R));
    }
}
