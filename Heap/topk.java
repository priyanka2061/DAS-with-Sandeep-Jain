package Heap;

import java.util.Collections;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

class Pair implements Comparable<Pair> {

    Integer key;
    Integer value;

    Pair(int key, int value) {
        this.key = key;
        this.value = value;
    }

    public int compareTo(Pair o) {
        return key - o.key;
    }
}

public class topk {
    public static void main(String args[]) {
        int arr[] = { 1, 1, 1, 3, 2, 2, 4 };
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        PriorityQueue<Pair> pq = new PriorityQueue<Pair>(Collections.reverseOrder());
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            pq.add(new Pair(entry.getValue(), entry.getKey()));
        }

        int l = 0;
        while (pq.size() > 0) {
            int k = pq.peek().key;
           
            while (k > 0) {
                arr[l++] = pq.peek().value;
                k--;
            }
            pq.remove();
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}