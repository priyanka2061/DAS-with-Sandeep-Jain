import java.util.HashMap;
import java.util.Map;

public class count {
    
    static  public int countConsistentStrings(String allowed, String[] words)   {
        Map<Character, Integer> allow = new HashMap<>();
            for(int i=0;i<allowed.length();i++)
            {
                if(!allow.containsKey(allowed.charAt(i)))
                {
                    allow.put(allowed.charAt(i),1);
                }
                else
                {
                    allow.put(allowed.charAt(i),allow.get(allowed.charAt(i))+1);
                }
            }
            int i=0;
            int k=0;
            int count=0;
            while(i<words.length)
            {
              String l=words[i];
              if(allow.containsKey(l.charAt(k)))
              {
                  k++;
              }
              else
              {
                  k=0;
                  i++;
              }
              if(k-1==l.length()-1)
              {
                  i++;
                  k=0;
                  count++;
              }
            }
           return count; 
        }
        public static void main (String args[])
        {
             String allowed = "ab";
             String[] words = {"ad","bd","aaab","baa","badab"};
             System.out.println(countConsistentStrings( allowed, words));
        }
    }

