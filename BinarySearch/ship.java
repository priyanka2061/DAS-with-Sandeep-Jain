package BinarySearch;

public class ship{
public static  int shipWithinDays(int[] weights, int days) {
    int sum=0;
    int max=0;
    int res=0;
    for(int i:weights)
    {
        max=Math.max(max,i);
        sum+=i;
    }
    int low=max;
    int high=sum;
    while(low<=high)
    {
        int mid=(low+high)/2;
        if(find(weights,days,mid))
        {
          res=mid;
          high=mid-1;
        }
        else
        {
            low=mid+1;
        }
    }
    return res;
        
    }

 static boolean find(int[] weights, int days, int capacity) {
    int sum=capacity;
    int i=0;
  for( i=0;i<weights.length;i++)
    {
        sum-=weights[i];
        if(sum<=0)
        {
            days-=1;
            sum=capacity;
            sum-=weights[i];
        }
        if( sum>0 && days==0 && i==weights.length-1)
             {
                 return false;
             }
    }
    return true;
}
/**
 * @param args
 */
public static void main (String args[])
{
    int weights[]={1,2,3,4,5,6,7,8,9,10};
    int days=5;
    System.out.println(shipWithinDays( weights,days));
}
}