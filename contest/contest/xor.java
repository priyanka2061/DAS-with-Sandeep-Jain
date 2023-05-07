package contest;

import java.util.HashMap;
import java.util.Map;

public class xor {
   
      static   public int[][] substringXorQueries(String str, int[][] queries) {
    
            int [][] ans = new int[queries.length][2];
            
            int i = 0;
            Map<Integer, Integer> nums = new HashMap<>();
    
            int num = 0;
    
            // Generate all possible numbers <= 10^9. Only Store theier first index occurence
            //time complexity O(n * 32)
            for(i = 0; i < str.length(); i++){
    
                StringBuilder sb = new StringBuilder();
                if(str.charAt(i) == '0'){
                    if(!nums.containsKey(0))
                        nums.put(0, i);
                    continue;
                } 
                for(int j = i; j <= Math.min(i + 32 ,str.length()-1); j++){
                    sb.append(str.charAt(j));
                    int d = Integer.parseInt(sb.toString(), 2);
                    if(d >=100000) break;
                    if(!nums.containsKey(d))
                        nums.put(d, i);
                }
            }
            i = 0;
            for(int [] q : queries ){
    
                int v =  q[0]^q[1];
                //inverse of XOR is XOR itself.
                // for any val^x = y  == val = x^y
                String bstr =  Integer.toBinaryString(v);
                //check if the given number exist in Map 
                int c = nums.getOrDefault(v, -1);
                if(c == -1){
                    ans[i] = new int[] {-1,-1};
                }else{
                    ans[i] = new int[] {c,(c +  bstr.length()-1)};
                }
                i++;
            }
            return ans;
        }
        public static void main(String args[])
        {
            int [][] queries = {{0,5},{1,2}};

            int ans[][]=substringXorQueries("101101", queries);
           for(int i=0;i<ans.length;i++)
            {
                for(int j=0;j<ans[0].length;j++)
                {
                    System.out.print(ans[i][j]+" ");
                }
          System.out.println();
            }
        }
    }
    

