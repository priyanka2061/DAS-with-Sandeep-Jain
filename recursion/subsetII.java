import java.util.ArrayList;
import java.util.Arrays;

public class subsetII {
    
        static void solve(ArrayList<ArrayList<Integer>>result,ArrayList<Integer>temp,int[] nums,int index)
       {
          result.add(new ArrayList<>(temp));
          for(int i=index;i<nums.length;i++)
          {
              if(i!=index && nums[i]==nums[i-1])
              {
                  continue;
              }
              temp.add(nums[i]);
              solve(result,temp,nums,i+1);
              temp.remove(temp.size()-1);
              
          }
       }
       public static ArrayList<ArrayList<Integer>> printUniqueSubsets(int[] nums) {
           ArrayList<ArrayList<Integer>>result=new ArrayList<>();
           ArrayList<Integer>temp=new ArrayList<>();
           Arrays.sort(nums);
           solve(result,temp,nums,0);
        //    for(ArrayList<Integer> i:result)
        //    {
        //     System.out.println(i);
        //    }
           return result;
           
       }
       public static void main (String args[])
            {
                int  arr[] = {1,2,2};
                printUniqueSubsets( arr);
                
            }
   
   }  

