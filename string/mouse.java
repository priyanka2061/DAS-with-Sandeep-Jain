package string;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
public class mouse {

    public int miceAndCheese(int[] reward1, int[] reward2, int k) {
        Arrays.sort(reward1);
        int sum = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < reward2.length; i++) {
            map.put(reward2[i], map.getOrDefault(reward2[i], 0) + 1);
        }
        int max = 0;
        for (int i = 0; i < reward1.length; i++) {
            max += reward1[i];
        }
        for (int i = 0; i < reward2.length; i++) {
            max += reward2[i];
        }
        int kk = 0;
        while (k > 0) {
            System.out.println(kk);
            int x = reward1[kk];
            if (!map.containsKey(x)) {
                sum += reward1[kk];
            } else {
                sum += map.get(x) * reward1[kk] + reward1[kk];
            }
            kk--;
            k--;
        }
        max = max - sum;
        return Math.max(max, sum);
    }
    public static void main (String args[])
    {
        mouse m = new mouse();
        int[] reward1 = {1,1,3,4};
        int[] reward2 = {4,4,1,1};
        int k = 2;
        System.out.println(m.miceAndCheese(reward1, reward2, k));
    }
}
