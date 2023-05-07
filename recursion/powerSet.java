import java.util.ArrayList;
import java.util.List;

public class powerSet {
   
    static  void solve(List<String>list,String s,String output,int n,int index)
    {
        if(index>=n)
        {
            list.add(output);
            return ;
        }
       output+=s.charAt(0);
    String s2=s.substring(1);
       solve(list,s2,output,n,index+1);
       char c=output.charAt(output.length()-1);
       output=output.substring(0,output.length()-1);
       solve(list,s2+c,output,n,index+1);
       
        
    }
    static  public List<String> AllPossibleStrings(String s)
    {
        
       List<String>list=new ArrayList<>();
       String output="";
       solve(list,s,output,s.length(),0);
       return list;
    }
    public static void main (String args[])
    {
        AllPossibleStrings("abc");
    }
}

