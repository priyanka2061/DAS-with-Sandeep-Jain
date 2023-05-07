package string;

import java.util.HashMap;
import java.util.Map;

class Solution {
     static public boolean wordPattern(String pattern, String s) {
        Map<Character,String>map=new HashMap<>();
         int i=0;
         int j=0;
         int k=0;
         while(i<pattern.length())
         {

           if(s.charAt(j)==' ' || j==s.length()-1)
           {
              if(j==s.length()-1)
              {
    
                if(!map.containsKey(pattern.charAt(i)))
               {
                   map.put(pattern.charAt(i),s.substring(k,j+1));
                   break;
                  
               }
               else
               {
              
                   if(!s.substring(k,j+1).equals(map.get(pattern.charAt(i))))
                   {
                      return false;
                   }
                  
               }
               return true;
              }
               if(!map.containsKey(pattern.charAt(i)))
               {
                   map.put(pattern.charAt(i),s.substring(k,j));
                  
               }
               else
               {
                   if(!s.substring(k,j).equals(map.get(pattern.charAt(i))))
                   {
                      return false;
                   }
               }
                k=j+1;
                i++;
           }
           j++;
         }
         return false;
        }
    

    public static void main (String args[])
    {
        String s="dog cat cat dog";
       String  pattern ="abba";
       System.out.println(s.length());
        System.out.println( wordPattern(pattern, s) );
        
    }
}
