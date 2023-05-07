package Bitmanupulation;

public class set {
    
        static void bitManipulation(int num, int i) {
            // code here
            
         
           int k=1<<i-1;
           int t=k&num;
           if(t==0)
           {
               System.out.print("0"+" ");
           }
           else
           {
                System.out.print("1"+" "); 
           }
           int p=num|k;
           System.out.print(p+" ");
           num=num&(~k);
           System.out.println(num%1000000007);
        }
        public static void main (String args[])
        {
            bitManipulation( 678883006 ,16);
        }
    }
    

