import java.util.ArrayList;
import java.util.List;

public class allBinary {
   
    static void solve(StringBuilder s,List<String>list,int n,int index)
    {
        if(n<=index)
        {
            for(int i=1;i<s.length();i++)
            {
                if(s.charAt(i)=='1' && s.charAt(i-1)=='1')
                   return ;
                list.add(s.toString());
                return;
            }
        }
        solve(s,list,n ,index+1);
         s.setCharAt(index, '1');
         solve(s,list,n,index+1);
    }
  public static List<String> generateBinaryStrings(int n) {
    // code here
    List<String>list=new ArrayList<>();
    int index=0;
    StringBuilder s=new StringBuilder();
    while(n>index)
    {
        s.append('0');
        index++;
    }
    index=0;
   
    solve(s,list,n,index);
    return list;

  }
   }
        
        

