package Bitmanupulation;
public class set2 {
    static int result=0;
    //Function to return sum of count of set bits in the integers from 1 to n.
    public static int countSetBits(int n){
    int temp=0;
    if(n==0)
    {
        return 0;
    }
   while(n>(temp<<1))
   {
       temp++;
   }
    int k=temp>>1;
    result+=(temp*k>>1)+k;
   result+= countSetBits(n-(temp>>1+1));
     
    
    return result;
}
        public static void main (String args[])
        {
             System.out.println(countSetBits(4));
        }
    } 

