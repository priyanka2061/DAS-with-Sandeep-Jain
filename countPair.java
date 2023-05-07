import java.util.HashMap;

import javax.lang.model.util.ElementScanner14;

public class countPair {
    static public int similarPairs(String[] words) {
        int count = 0;
        int i = 0;
        int k = 0;
        HashMap<Character, Integer> word = new HashMap<>();
        while (i < words.length) {
            String w = words[i];
            if (!word.containsKey(w.charAt(k)))
                word.put(w.charAt(k), 1);
            else
                word.put(w.charAt(k), word.get(w.charAt(k)) + 1);
                

        }
        return count;
    }

    public static void main(String args[]) {
        String words[] = { "aba", "aabb", "abcd", "bac", "aabc" };
        System.out.println(similarPairs(words));

    }

}
