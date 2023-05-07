package contest;

public class most {
    
         static public int alternateDigitSum(int n) {
            int sum=0;
            int count=0;
            while(n>0)
            { count++; 
                n=n/10;
               
            }
           
                int i=count;
               while(n>0) 
               {
                   if(i%2==0)
                   {
                       sum-=n%10;
                       n=n/10;
                   }
                   else
                   {
                       sum+=n%10;
                       n=n/10;
                   }
                   i--;
                   
               }
    
            return sum;
        }
        public static void main (String args[])
        {
            int n=521;
            System.out.println(alternateDigitSum( n));
        }
    }

