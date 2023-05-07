package Heap;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

class Pair {
    Integer key;
    Integer value;

    public Pair(int key, int value) {
        this.key = key;
        this.value = value;
    }
}

public class TaskShedular {

    public void leastInterval(char[] tasks, int n) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        Map<Character, Integer> map = new HashMap<>();
        Queue<Pair> q = new LinkedList<Pair>();
        int idletime = 0;
        for (int i = 0; i < tasks.length; i++) {
            map.put(tasks[i], map.getOrDefault(tasks[i], 0) + 1);
        }
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            pq.add(entry.getValue());
        }
        while (!pq.isEmpty() && pq.peek()!=0) {
            int data = 0;
            data = pq.poll() - 1;
            q.add(new Pair(data, idletime + 1));
            idletime += 1;
            int l = q.peek().key;
            pq.add(l);
            q.remove();
        }
        System.out.println(idletime);
    }
    public static void main (String args[])
    {
        TaskShedular obj=new TaskShedular();
         char[] tasks = {'A','A','A','B','B','B'};
        obj.leastInterval( tasks, 2);
    }
}
