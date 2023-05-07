import java.util.HashMap;
import java.util.Map;

 public class long2 {
     static int longestUniqueSubsttr(String S){
        int i=0;
        Map<Character,Integer>map=new HashMap<>();
        int j=0;
        while(j<S.length())
        {
          map.put(S.charAt(j),map.getOrDefault(S.charAt(j),0)+1);
          if(map.size()<j-i+1)
          {
              while(map.size()<j-i+1)
              {
             map.put(S.charAt(i),map.get(S.charAt(i))-1);
             if(map.get(S.charAt(i))==0)
             {
                 map.remove(S.charAt(i));
             }
             i++;
          }
          }
          j++;
           
        }
        System.out.println(j-i);
         return j-i;
    }
    public static void main (String args[])
    {
        longestUniqueSubsttr("geeksforgeeks");
    }
    }

