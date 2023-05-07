package Heap;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class sort {

    // Function to merge k sorted arrays.
    public static ArrayList<Integer> mergeKArrays(int[][] arr, int K) {
        // Write your code here.
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < K; i++) {
            for (int j = 0; j < arr[i].length; i++) {
                pq.add(arr[i][j]);
            }
        }
        return new ArrayList<>(pq);
    }

    public static void main(String args[]) {
        int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};
        int k=3;
        mergeKArrays(arr,k);
    }
}
