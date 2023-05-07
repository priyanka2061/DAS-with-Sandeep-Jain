package Graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

class Pair {
    int des;
    int time;

    Pair(int des, int time) {
        this.des = des;
        this.time = time;
    }
}

public class srt {
    private static final int MOD = 1000000007;

     static public int countPaths(int n, int[][] roads) {
        List<List<int[]>> graph = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }
        int[] distance = new int[n];
        int[] count = new int[n];
        Arrays.fill(distance, Integer.MAX_VALUE);
        distance[0] = 0;
        count[0] = 1;
        for (int i = 0; i < roads.length; i++) {
            graph.get(roads[i][0]).add(new int[] { roads[i][1], roads[i][2] });
            graph.get(roads[i][1]).add(new int[] { roads[i][0], roads[i][2] });
        }
        PriorityQueue<Pair> pq = new PriorityQueue<>((a, b) -> a.time - b.time);
        pq.add(new Pair(0, 0));
        while (!pq.isEmpty()) {
            Pair temp = pq.poll();
            if (temp.time > distance[temp.des]) {
                continue;
            }
            for (int[] edge : graph.get(temp.des)) {
                int newDist = temp.time + edge[1];
                if (newDist < distance[edge[0]]) {
                    distance[edge[0]] = newDist;
                    count[edge[0]] = count[temp.des];
                    pq.add(new Pair(edge[0], newDist));
                } else if (newDist == distance[edge[0]]) {
                    count[edge[0]] = (count[edge[0]] + count[temp.des]) % MOD;
                }
            }
        }
        return count[n - 1];
    }

    public static void main(String args[]) {
        srt obj = new srt();
        int n = 7;
        int roads[][] = { { 0, 6, 7 }, { 0, 1, 2 }, { 1, 2, 3 }, { 1, 3, 3 }, { 6, 3, 3 }, { 3, 5, 1 }, { 6, 5, 1 },
                { 2, 5, 1 }, { 0, 4,5 }, { 4, 6, 2 } };
                countPaths(n, roads);
    }
}
