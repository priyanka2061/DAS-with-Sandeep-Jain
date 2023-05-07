package BinarySearch;

public class candies
{
 static boolean find(int[] candies,long k,int mid)
  {
      int total=0;
      if(mid==0)
      return true;
      else
      {
          for(int c:candies)
          {
              total+=c/mid;
          }
          if(total>=k)
          return true;
      }
      return false;
  }
public static int maximumCandies(int[] candies, long k) {
  int max=Integer.MIN_VALUE;
  for(int c:candies)
  {
      max=Math.max(max,c);
  }
  int low=0;
  int high=max;
  int mid=0;
  while(low<=high)
  {
       mid=(low+high)/2;
      if(find(candies,k,mid))
      {
          low=mid+1;
      }
      else
      {
          high=mid-1;
      }
      
  }
  return find(candies,k,mid)?low-1:low;
}
public static void main (String args[])
{
    int arr[]={5,8,6};
    int k=3;
   System.out.println( maximumCandies( arr,  k));
}
}