// find maximum subarray sum in given array
package window;
public class maxi {
    static  public void solve(int arr[],int k)
    {
       int sum=0;
       int j=0;
       int i=0;
       int max=0;
       while(j<arr.length)
       {
        sum+=arr[j];
        if((j-i+1)<k)
        {
            j++;
        }
        else if((j-i+1)==k)
        {
            max=Math.max(max,sum);
            sum-=arr[i];
            i++;
            j++;
        }
       }
       System.out.println(max);
    }
    public static void main (String args[])
    {
        int arr[]={8,2,4,1,2,1,3};
        solve(arr,3);
    }
    
}
