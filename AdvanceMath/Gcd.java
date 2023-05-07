package AdvanceMath;

public class Gcd {
    class Solution {
    static Long gcd(Long A,Long B)
    {
        if(A==0)
        return B;
        return gcd(B%A,A);
    }
    static Long[] lcmAndGcd(Long A , Long B) {
        // code here
        long gcd=0;
        Long[] result=new Long[2];
        
            result[1]=gcd(A,B); 
            result[0]=(A*B)/result[1];
            return result;
        
    }
}
    public static void main(String args[])
    {
        lcmAndGcd(35064900, 70835880);

    }
    
}
