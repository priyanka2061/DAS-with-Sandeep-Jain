// find anagram of pattern in give string 
// anagram of number is abc = abc, acb,bca,bac,cab,cba
// normally it will take n!
package window;
import java.util.HashMap;
import java.util.Map;
public class anagram {
    /**
     * @param s
     * @param pattern
     */
     static public void solve (String s,String pattern)
    {
        int result=0;
        int i=0;
        int j=0;
        Map<Character,Integer> map=new HashMap<>();
        for(int l=0;l<pattern.length();l++)
        {
            if(!map.containsKey(pattern.charAt(l)))
            {
               map.put(pattern.charAt(l),1);
            }
            else
            {
                map.put(pattern.charAt(l),map.get(pattern.charAt(l))+1);
            }
        }
        int count=map.size();
        while(j<s.length())
        {
            if(map.containsKey(s.charAt(j)))
            {
                map.put(s.charAt(j),map.get(s.charAt(j))-1);

            }
            if(map.get(s.charAt(j))==0)
            {
                count--;
            }
            if(j-i+1<pattern.length())
            {
                j++;
            }
            else if((j-i+1)==pattern.length())
            {
               result++;
               if(map.containsKey(s.charAt(i)))
               {
                map.put(s.charAt(i),map.get(s.charAt(i))+1);
               }
               i++;
               j++;
            }
        }
      System.out.println(count);  
    }
    public static void main (String args[])
    {
        solve ("abaacabaabaa","abaa"); 
    }
    
}
