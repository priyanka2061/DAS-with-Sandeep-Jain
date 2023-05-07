public class consectiveone11 {

    static public int longestOnes(int[] nums, int k) {
        int i = 0;
        int j = 0;
        int count = 0;
        int max = 0;
        while (j < nums.length) {
            if (nums[j] == 1) {
                count++;
            }
            if ((j + 1 - i - count) == k) {
                max = Math.max(max, j - i + 1);
            } else if (j + 1 - i - count > k) {
                while (j + 1 - i - count > k) {
                    if (nums[i] == 1) {
                        count--;
                    }
                    i++;
                }

            }
            j++;
        }
        System.out.println(max);
        return max;
    }

    public static void main(String args[]) {
        int arr[] = { 0,0,0,1};
        longestOnes(arr, 4);
    }
}
