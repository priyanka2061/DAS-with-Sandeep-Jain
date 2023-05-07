package Array;
public class Solution {
    public static  int differenceOfSum(int[] nums) {
        int sum=0;
        int digit=0;
        int i=nums.length-1;
        int k=nums[nums.length-1];
        
        while(i>0)
        {
            digit+=k%10;
            k=k/10;
           
            if(k==0)
            {
             sum+=nums[i];
                i--;
                k=nums[i];
                
            }
          
        }
        sum+=nums[0];
        while(nums[0]!=0)
        {
            digit+=nums[0]%10;
            nums[0]=nums[0]/10;
        }

        
        if(digit>sum)
            return digit-sum;
        else
        return sum-digit;
    
    }

    public static void main (String args[])
    {
        int nums[]={10,4,4,7,7,1,5,8,3,5};
       System.out.println( differenceOfSum(nums));
        
    }
}
