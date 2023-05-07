import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class subset {

   
       static void solve(int[] arr,List<List<Integer>>result,List<Integer>list,  int index,int target,int sum)
        {  
            if( sum==target)
            {
                result.add(new ArrayList<>(list));
                return;
            }
            
            
            for(int i=index;i<arr.length;i++)
            {
                
                if(i>index && arr[i]==arr[i-1])
                {
                   
                    continue;
                }
                sum+=arr[index];
                list.add(arr[index]);
                solve(arr,result,list,index+1,target,sum);
                sum-=list.get(list.size()-1);
                list.remove(list.size()-1);
                // if(target<sum)
                // {
                //     sum-=list.get(list.size()-1);
                //     list.remove(list.size()-1);
                // }
            }
              
        }
        static  public int combinationSum2(int[] candidates, int target) {
          List<List<Integer>>result=new ArrayList<>();
             List<Integer>list=new ArrayList<>();
              int index=0;
            Arrays.sort(candidates);
            int sum=0;
            solve(candidates,result,list,index,target,sum);
            for(int i:list)
            {
                System.out.println(i);
            }
            return 0;
            
       
    }
    
    

    

    public static void main (String args[])
            {
                int  arr[] = {2,5,2,1,2};
                combinationSum2( arr,5);
                
            }
  
}
