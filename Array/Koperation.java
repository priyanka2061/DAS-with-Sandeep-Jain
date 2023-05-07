package Array;

import java.util.*;

public class Koperation {

    public void maxKelements(int[] nums, int k) {
        long maxi = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>(
                Collections.reverseOrder());
        for (int i : nums) {
            pq.add(i);
        }
        while(k>0)
        {
        maxi += pq.peek();

        long pk = pq.peek();
        pq.poll();
        pq.add((int) Math.ceil(pk / 3.0));
       
        k--;
        }
        System.out.println(maxi);
    }
}