import java.util.HashMap;
import java.util.Map;

public class w {

   static public int[] vowelStrings(String[] words, int[][] queries) {
        int arr[] = new int[queries.length];
        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;
        for (int i = 0; i < words.length; i++) {
            String s = words[i];
            if ((s.charAt(0) == 'a' || s.charAt(0) == 'e' || s.charAt(0) == 'i' || s.charAt(0) == 'o'
                    || s.charAt(0) == 'u')
                    && (s.charAt(s.length() - 1) == 'a' || s.charAt(s.length() - 1) == 'e'
                            || s.charAt(s.length() - 1) == 'i' || s.charAt(s.length() - 1) == 'o'
                            || s.charAt(s.length() - 1) == 'u')) {
                count++;
                
            }
            map.put(i, count); 
        }
        for (int i = 0; i < queries.length; i++) {
            if (queries[i][0] == 0)
                arr[i] = map.get(queries[i][1]);
            else {
                arr[i] = map.get(queries[i][1]) - map.get(queries[i][0] - 1);
            }
        }
        return arr;
    }

    public static void main(String args[]) {
        String words[] = { "aba","bcb","ece","aa","e" };
        int queries[][] = { { 0,2},{1,4},{1,1 } };
        int arr[] = vowelStrings(words, queries);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    }

