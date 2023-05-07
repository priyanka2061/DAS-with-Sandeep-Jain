package BinarySearch;

public class piles {
   
        static boolean find(int[] piles,int h,int mid)
        {
            int left=piles[0]-mid;
            int time=h;
            int i=0;
            time=time-1;
            while(i<piles.length && time>0)
            {
             
                if(left<=0)
                {
                    
                    i++;
                    if(i>=piles.length)
                    break;
                    left=piles[i];
                }
                else
                {
                    
                   
                    left=left-mid;
                    time=time-1;
                }
              
            }
            if(left<=0 && i==piles.length-1)
            return true;
            else
            return false;
        }
        public static  int minEatingSpeed(int[] piles, int h) {
            int max=0;
            for(int i:piles)
            {
              max=Math.max(max,i);
            }
            int low=0;
            int high=max;
            int mid=0;
            while(low<=high)
            {
                 mid=(low+high)/2;
                if(find(piles,h,mid))
                {
                  high=mid-1;
                }
                else
                {
                    low=mid+1;
                   
                }
            }
            return find(piles,h,mid)?mid:mid+1;
    
            
        }
        public static void main (String args[])
        {
            int piles[]={312884470};
            int h=312884469;
            System.out.println(minEatingSpeed(piles,h));
        }
    }
    

