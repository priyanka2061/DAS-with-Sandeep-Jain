public class matching {
    
        public int repeatedStringMatch(String a, String b) {
            StringBuilder str=new StringBuilder();
            int k=0;
            for(int i=0;i<b.length();)
            {
                 str.append(a.charAt(k));
                 k++;
                if( k<a.length() && a.charAt(k)==b.charAt(i))
                {
                  i++;
                }
               
                if(a.length()==k)
                {
                    k=0;
                }
            }
            System.out.println(str);
        
        int ans=(str.length())/( a.length());
        return ans;
    }
    public static void main (String args[])
    {
        matching obj=new matching();
        String a="abcd";
        String b="cdabcdab";
        System.out.println(obj.repeatedStringMatch(a,b));
    }
    }

