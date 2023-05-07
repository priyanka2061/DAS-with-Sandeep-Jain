public class prime {

    static boolean isPrime(int n) {
        for (int i = 2; n > i * i; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    static public boolean primeSubOperation(int[] nums) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            min = Integer.MAX_VALUE;
            int k = nums[i];
            for (int j = 2; j < k; j++) {
                if (k == 1 || k == 2 || k == 0)
                    break;
                if (isPrime(j)) {

                    min = Math.min(min, k - j);
                    if (i > 0 && min > nums[i - 1] && min != Integer.MAX_VALUE)
                        nums[i] = min;
                }
            }
            if (i == 0 && min != Integer.MAX_VALUE) {
                nums[i] = min;
            }

        }
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] >= nums[i + 1])
                return false;

        }
        return true;
    }

    public static void main(String args[]) {
        int nums[] = { 18,12,14,6 };
        primeSubOperation(nums);
    }
}
