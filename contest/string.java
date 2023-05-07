public class string  {
   
        static  public void divisibilityArray(String word, int m) {
            int[] div= new int[word.length()];
            long prefix=0;
            for(int i=0;i<word.length();i++)
            {
              prefix = (prefix * 10 + word.charAt(i) - '0') % m;
            
                if(prefix==0)
                {
                    div[i]=1;
                }
            
            }
           
        }
        public static void main (String args[])
        {
            divisibilityArray("91221181269244172125025075166510211202115152121212341281327",21);
        }
    }

