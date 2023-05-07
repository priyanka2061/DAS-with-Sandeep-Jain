import java.util.ArrayList;
import java.util.List;

public class combinationSumlll {
 
        void solve(List<List<Integer>>result,List<Integer>temp,int[] arr, int n,int k,int index,int sum)
        {
            if(index>=arr.length)
            {
                if(temp.size()==k && sum==n)
                {
                  result.add(new ArrayList<>(temp));
                 
                }
                return;
            }
                sum+=arr[index];
                temp.add(arr[index]);
                solve(result,temp,arr,n,k,index+1,sum);
                sum-=arr[index];
                temp.remove(temp.size()-1);
                solve(result,temp,arr,n,k,index+1,sum);
            
        }
        public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>>result=new ArrayList<>();
        List<Integer>temp=new ArrayList<>();
        int p= Math.abs(n-k);
        int[] arr=new int [p];
        for(int i=1;i<=n-k;i++)
        {
            arr[i-1]=i;
        }
        solve(result,temp,arr,n,k,0,0);
        for(List<Integer>i:result)
        {
            System.out.println(i);
        }
        return result;
        }
    
    public static void main (String args[])
    {
        combinationSumlll obj=new combinationSumlll();
          obj.combinationSum3(9,47);
    }
   
    }

