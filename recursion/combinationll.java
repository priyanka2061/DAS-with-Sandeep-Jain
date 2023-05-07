import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class combinationll {
   
        static void solve(int[] arr,List<List<Integer>>result,List<Integer>temp,int target,int sum,int index){
            if(sum==target)
            { 
                
                result.add(new ArrayList <>(temp));
                return;
                
            }
            for(int i=index;i<arr.length;i++)
            {
                if(i>index && arr[i]==arr[i-1])
                {
                    continue;
                }
                if(sum>target)
                {
                    break;
                } 
                sum+=arr[i];
                temp.add(arr[i]);
                solve(arr,result,temp,target,sum,i+1);
                sum-=arr[i];
                temp.remove(temp.size()-1);
            }
         }
        public static List<List<Integer>> combinationSum2(int[] a, int s) {
            Arrays.sort(a);
            List<List<Integer>>result=new ArrayList<>();
            List<Integer>temp=new ArrayList<>();
            solve(a,result,temp,s,0,0);
            for(List<Integer> i:result )
            {
                System.out.println(i);
            }
            return result;
        }
        public static void main(String args[]) {

       int[] a = {10,1,2,7,6,1,5};
        
            combinationSum2(a, 8);
        
          }
    }

