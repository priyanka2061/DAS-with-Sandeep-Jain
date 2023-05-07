package Heap;

import java.util.PriorityQueue;

public class Connectropes {
    public static void main(String args[]) {
        int arr[] = { 1, 2, 3, 4, 5 };
        int totalcost = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < arr.length; i++) {

            pq.add(arr[i]);
        }
        while (pq.size() > 1) {

            int x = 0;
            x += pq.poll();
            x += pq.poll();
            totalcost += x;
            pq.add(x);

        }

        System.out.println(totalcost);
    }
}
