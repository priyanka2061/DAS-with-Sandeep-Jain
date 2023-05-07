import java.util.HashMap;
import java.util.Map;

public class minima {
    public static int minWindow(String s, String t) {
        Map<Character, Integer> target = new HashMap<>();
        int min = Integer.MAX_VALUE;
        String re = "";
        for (int i = 0; i < t.length(); i++) {
            if (!target.containsKey(t.charAt(i))) {
                target.put(t.charAt(i), 1);
            } else {
                target.put(t.charAt(i), target.get(t.charAt(i)) + 1);
            }
        }
        int count = target.size();
        int i = 0;
        int j = 0;
        while (j < s.length()) {
            if (target.containsKey(s.charAt(j))) {
                target.put(s.charAt(j), target.get(s.charAt(j) - 1));
              
            }
            if (target.get(s.charAt(j)) == 0) {
                count--;  
            }
            if (count == 0) {
                while (count == 0) {
                    min = Math.min(min, j - i + 1);

                    if (target.containsKey(s.charAt(i))) {
                        target.put(s.charAt(i), target.get(s.charAt(i)) + 1);

                        if (target.get(s.charAt(i)) == 1) {
                            count++;
                        }
                    }
                    i++;
                }
                
            }
           j++;
        }
        System.out.println(min);
        return min;
    }

    public static void main(String args[]) {
        minWindow("ADOBECODEBANC", "ABC");
    }
}