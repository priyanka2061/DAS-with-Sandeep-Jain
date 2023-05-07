package string;

import java.util.HashMap;
import java.util.Map;

public class Word {     
    public boolean isItPossible(String word1, String word2) {
        Map<Character, Integer> map = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();
        for (int i = 0; i < word1.length(); i++) {
            if (map.containsKey(word1.charAt(i))) {
                map.put(word1.charAt(i), map.get(word1.charAt(i)) + 1);
            } else {
                map.put(word1.charAt(i), 1);
            }
        }
        for (int i = 0; i < word2.length(); i++) {
            if (map2.containsKey(word2.charAt(i))) {
                map2.put(word2.charAt(i), map2.get(word2.charAt(i)) + 1);
            } else {
                map2.put(word2.charAt(i), 1);
            }
        }
        if (map.size() == map2.size()) {
              return true;
        } else {
            for (char i = 'a'; i <= 'z'; i++) {
                for (char j = 'a'; j <= 'z'; j++) {
                    
                    if (!map.containsKey(i) )
                          continue;
                          if(!map2.containsKey(j))
                          continue;
                    else
                     {
                        if (map.get(i)> 0 && map2.get(j) > 0) {
                            if(map.get(i)>1)
                            map.put(i, map.get(i) - 1);
                            else{
                                map.remove(i);
                            }
                            if(map2.get(j)>1)
                            map2.put(j, map2.get(j) - 1);
                            else{
                                map2.remove(j);
                            }
                            if (!map2.containsKey(i)) {
                                map2.put(i, 1);
                            } else {
                                map2.put(i, map2.get(i) + 1);
                            }
                            if (!map.containsKey(j)) {
                                map.put(j, 1);
                            } else {
                                map.put(j, map.get(j) + 1);
                            }
                        }

                        if (map.size() == map2.size()) {
                           return true;
                        }
                        if (map.get(j) > 1) {
                            map.put(j, map.get(j) - 1);
                        } else {
                            map.remove(j);
                        }
                        if (map2.get(i) > 1) {
                            map2.put(i, map.get(i) - 1);
                        } else {
                            map2.remove(i);
                        }
                        if(map.containsKey(i))
                        map.put(i, map.get(i) + 1);
                        else{
                            map.put(i, 1);  
                        }
                        if(map2.containsKey(j))
                        map2.put(j, map2.get(j) + 1);
                        else{
                            map2.put(j, 1);  
                        }
                        
    
                    }
                
                
                    }
                }
            }

        

      return false;
    }

}