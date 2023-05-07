package string;

public class string {
   
        static  public String reverseWords(String s) {
            String words[]=s.split(" ");
            s="";
            for(int i=words.length-1;i>=0;i--)
            {
               if(words[i]=="  ")
               {
                   continue;
               }
                if(i==0)
                {
                    s+=words[i];
                    break;
                }
                 s+=words[i]+" ";
               
            }
            return s.trim();
        } 
  public static void main (String args[])
  {
    String s = "a good   example";
    reverseWords( s);
  }
}
