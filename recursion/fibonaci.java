public class fibonaci {
    
    int fibo(int n)
    {
        if(n==1)
         return 1;
         if(n==0)
         return 0;
       
         int k=  fibo(n-1)+ fibo(n-2);
         return k;
        //System.out.println(k); 
        
    }
    public static void main( String args[])
    {
        fibonaci obj=new fibonaci();
         System.out.println(obj.fibo(6));
    }
}
