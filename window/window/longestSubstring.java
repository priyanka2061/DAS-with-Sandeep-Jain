package window;

import java.util.HashMap;
import java.util.Map;

public class longestSubstring {

    static public int lengthOfLongestSubstring(String s) {
        int max = 0;
        int i = 0;
        int j = 0;
        Map<Character, Integer> map = new HashMap<>();
        while (j < s.length()) {
            if (!map.containsKey(s.charAt(j))) {
                map.put(s.charAt(j), 1);
                max = Math.max(max, j - i + 1);
                j++;
            } else if (map.containsKey(s.charAt(j))) {
                while (s.charAt(i) != s.charAt(j)) {

                    map.put(s.charAt(i), map.get(s.charAt(i)) - 1);

                    if (map.get(s.charAt(i)) == 0) {
                        map.remove(s.charAt(i));
                    }
                    i++;
                }
                i++;
                j++;
            }
        }
        System.out.println(max);
        return max;
    }

    public static void main(String args[]) {
        lengthOfLongestSubstring("tmmzuxt");
    }
}
