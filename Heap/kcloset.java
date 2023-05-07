package Heap;
import java.util.Collections;
import java.util.PriorityQueue;

class Triplet implements Comparable<Triplet> {

    Integer  key;
    Integer  value;
    Integer  value2;

     public Triplet(int key, int value, int value2) {
        this.key = key;
        this.value = value;
        this.value2 = value2;

    }

    @Override
    public int compareTo(Triplet o) {
        return key - o.key;
    }

    
    
}

public class kcloset {
   

    public static void main(String args[]) {
        int[][] arr = { { 1, 3 }, { -2, 2 }, { 5, 8 }, { 0, 1 } };
        int k = 2;
        PriorityQueue<Triplet> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < arr.length; i++) {
            int x = (arr[i][0] * arr[i][0]) + (arr[i][1] * arr[i][1]);
            pq.add(new Triplet(x, arr[i][0], arr[i][1]));
            if (pq.size() > k) {
                pq.remove();
            }

        }
        while (!pq.isEmpty()) {
            System.out.println(pq.peek().value + " " + pq.peek().value2);
            pq.remove();
        }
    }

}
