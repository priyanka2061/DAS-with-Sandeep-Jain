package contest;

public class GoodArray {
    public static long countGood(int[] nums, int K) {
        int l=0;
        int good=0;
        // increasing order
        for(int r=l+1;r<nums.length;r++)
        {
            int P=l;
            int R=r;
            int k=P;
            int count=0;
            while(P<=R)
            {
              if(nums[k]==nums[P])
              {
                count++;
              }
              K++;
              if(k==R)
              {
                P++;
                k++;
              }
            }
            if(count==K)
            {
                good++;
            }
        }
        //decreasing
         int r=nums.length-1;
        for(l=1;l<nums.length;l++)
        {
            int P=l;
            int R=r;
            int k=P;
            int count=0;
            while(P<=R)
            {
              if(nums[k]==nums[P])
              {
                count++;
              }
              K++;
              if(k==R)
              {
                P++;
                k++;
              }
            }
            if(count==K)
            {
                good++;
            }
        }
        return good;
    }
    public static void main (String args[])
    {
        int nums[]={1,1,1,1,1};
        int k=10;
       System.out.println( countGood(nums,10));
    }
}
