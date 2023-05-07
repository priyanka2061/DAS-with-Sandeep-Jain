package AdvanceMath;

import java.util.ArrayList;

public class perfectSquare {

   static   public int numSquares(int n) {
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 1; i * i <= n; i++) {
            if ((i * i) == (int) Math.pow(i,2)) {
                arr.add(i * i);
            }
        }
        int i = 0;
        int j = arr.size() - 1;
        int sum = 0;
        while (i < j) {
            sum = arr.get(i) + arr.get(j);
            if (sum == n) {
                break;
            }
           if(sum<n)
           {
            i++;
           }
           else
           {
            j--;
           }
        }
        int count = 0;
        sum=0;
        if (sum != n) {
            while (n > 0) {
                n -= arr.get(j);
                count++;

            }
            return count;
        }

        return 2;
    }
    public static void main(String args[])
    {
       System.out.println( numSquares(14)); 
    }
}
