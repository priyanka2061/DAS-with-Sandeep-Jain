import java.util.HashMap;
import java.util.Map;

public class letterchange {
   
         static public int characterReplacement(String s, int k) {
            int j=0;
            int i=0;
            int max=0;
           Map<Character,Integer>map=new HashMap<>();
    
               while(j<s.length())
               {
                  
                      if(map.size()==0 && !map.containsKey(s.charAt(j))|| map.containsKey(s.charAt(j)))
                      {
                        map.put(s.charAt(j),map.getOrDefault(s.charAt(j),0)+1);
                        j++;
                      }
                      else
                      {
                         k--;
                         j++;
                      }
                
                   if(k<0)
                   {
                     if(map.containsKey(s.charAt(i)))
                     {
                     map.put(s.charAt(i),map.get(s.charAt(i))-1);
                     if(map.get(s.charAt(i))==0)
                     map.remove(s.charAt(i));
                     }
                     if(map.size()==0)
                     {
                         k++;
                     }
                     i++;
                   }
                   
               }
              
               System.out.println(j-i);
              return j-i;
           
          
        }
        public static void main (String args[])
        {
            String s="ABCDE";

            characterReplacement( s, 1);
        }
    }

