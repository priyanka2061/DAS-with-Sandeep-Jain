package string;

import java.util.HashMap;
import java.util.Map;

public class word3 {
         static public int findTheLongestBalancedSubstring(String s) {
            int max = 0;
            int sum = 0;
            if(s.length()==1)
                return 0;
            for (int i = 0; i < s.length(); ) { 
                 Map<Character, Integer> map = new HashMap<>();
                if (s.charAt(i) == '0') {
                  
                    while ( i<s.length() && s.charAt(i) == '0' ) {
                        map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
                        ++i;
                    }
                    while (i<s.length() && s.charAt(i) == '1'  ) {
                        map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
                        ++i;
                    }
                    int zeros = map.getOrDefault('0', 0);
                    int ones = map.getOrDefault('1', 0);
                    if (zeros == ones) {
                        max = Math.max(max, zeros + ones);
                    }
                    
                } else {
                    i++;
                }
                 
                  
            }
           
            return max;
        }
        public static void main (String args[])
        {
            findTheLongestBalancedSubstring( "01000111");
        }
    }
    
