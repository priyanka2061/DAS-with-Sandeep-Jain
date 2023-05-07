package BinarySearch;

public class bouquet {
   static  boolean findwait(int[] bloomDay, int M, int K, int wait) {
      
        int count = 0;
        for (int i : bloomDay) {
            if (wait >= i) {
                count++;
                if (count == K) {
                    M--;
                    count = 0;
                    if(M==0)
                    return true;
                }
            }
            else{
                count=0;
            }

            
        }
        if (M == 0) {
            return true;
        } else
            return false;

    }

    public  static int solve(int[] bloomDay, int M, int K) {
        int res = 0;
        int max = 0;
        for (int i : bloomDay) {
            max = Math.max(i, max);
        }
        int low = 0;
        int high = max;
         if (M * K > bloomDay.length) {
        return -1;
         }
        while (low <= high) {
            int mid = (low + high)/2;
            if (findwait(bloomDay, M, K, mid)) {
                res = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        if(res!=0)
        return res;
        else
        return -1;

    
        
    }

    

    public static void main(String args[]) {
        int bloomDay[] = {2,2 };
        int k = 1;
        int m = 1;
        System.out.println(solve(bloomDay, k, m));
    }

}
