import java.util.ArrayList;
import java.util.List;

public class sumlist {
    void solve(int arr[], int n, int sum, int current, int index, long[] count, int temp) {


        if (temp > sum) {
            return;
        }
        if(index>=n)
        {
             if (temp == sum) 
                   count[0]++;
            return;
        }

        solve(arr, n, sum, current - arr[index], index + 1, count, temp + arr[index]);
        solve(arr, n, sum, current - arr[index], index+1, count, temp);
    }

 
    //     if (temp == sum) {
    //         count[0]++;
    //         return;
    //     }
    //     if (temp + current < sum || current == 0) {
    //         return;
    //     }

    //     solve(arr, n, sum, current - arr[index], index + 1, count, temp + arr[index]);

    //     solve(arr, n, sum, current - arr[index], index+1, count, temp);
    // }

    public int perfectSum(int arr[], int n, int sum) {
        int m = (int) 1e+7;
        int current = 0;
        int index = 0;
        long count[] = { 0 };

        for (int i = 0; i < n; i++) {
            current += arr[i];
        }
        solve(arr, n, sum, current, index, count, 0);
        return (int) (count[0] % m);
    }

    public static void main(String args[]) {
        sumlist obj = new sumlist();
        int arr[] = {1,0};
        int n = 2;
        int sum = 1;
        System.out.println(obj.perfectSum(arr, n, sum));

    }
}
