package AdvanceMath;

public class prime {
   
         static public int countPrimes(int n) {
            int count=0;
           
          if(n==1 || n==0 || n==2)
             return 0;
            for(int i=2;i<n;i++)
            {int p = (int)(Math.pow(2, i-1))%i;
                    if (p==1 || i==2)
                        count++;
                   
                }
          System.out.print(count);
           
           return count;
        }
        public static void main (String args[])
        {
            countPrimes(100);
        }
    }

