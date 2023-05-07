import java.util.*;
import java.util.Map.Entry;

class spilt {
    static int importance(int[] nums, int i, int j, int x) {
        Map<Integer, Integer> map = new HashMap<>();
        Integer count = 0;
        Integer count2 = 0;
        Integer sum = 0;
        for (int k = 0; k <= i; k++) {
            if (!map.containsKey(nums[k])) {
                map.put(nums[k], 1);
            } else {
                map.put(nums[k], map.get(nums[k]) + 1);
            }
        }

        for (Entry<Integer, Integer> entry : map.entrySet()) {
           
            if(entry.getValue()>1)
            {
                  count+= entry.getValue();
            }
        }
        map.clear();
        for (int k = j; k <= nums.length - 1; k++) {
            if (!map.containsKey(nums[k])) {
                map.put(nums[k], 1);
            } else {
                map.put(nums[k], map.get(nums[k]) + 1);
            }
        }
    

        for ( Entry<Integer, Integer> entry : map.entrySet()) {
           
            if(entry.getValue()>1)
            {
                  count2+= entry.getValue();
            }
           
        }
        


        sum += count + x;
        sum += count2 + x;

       return sum.intValue();
    
    }

    public static int minCost(int[] nums, int k) {

        int min = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            int j = i + 1;
            int sum = importance(nums, i, j, k);
            min = Math.min(min, sum);

        }
        return min;
    }

    public static void main(String args[]) {
        int nums[] = { 5,6,4,3,2,5,4,1,5,2,0,5,4,3,1,5,4,3,4,4 };
        int k = 3;
        System.out.println(minCost(nums, k));
    }
}
