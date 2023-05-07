package Array;
public class ReversePair {
  static int merge(int[] arr, int low, int high, int mid) {
    int j = mid + 1;
    int count = 0;
    int output[] = new int[high + 1];
    for (int i = low; i <=mid; i++) {
       while (j<=high && arr[i] >(long) arr[j] * 2) {
        j++;
      }
      count +=( j - (mid + 1));
    }
    int i = low;
    int k = mid + 1;
    int p = 0;
    while (i <= mid && k <= high) {
      if (arr[i] <= arr[k]) {
        output[p++] = arr[i++];
       } else {
        output[p++] = arr[k++];
      }
    }
      if(i<=mid)
      {
      while (i <= mid) {
        output[p++] = arr[i++];
      }
    }
    else{
      while (k <= high) {
        output[p++] = arr[k++];
      }
    }
    
    for (int s = low; s <=high; s++) {
      arr[s] = output[s-low];
    }
    return count;
  }

  public static int MergeSort(int[] arr, int low, int high) {
    int r = 0;
    if (low < high) {
      int mid = (low + high) / 2;
      r = MergeSort(arr, low, mid);
      r += MergeSort(arr, mid + 1, high);
      r += merge(arr, low, high, mid);

    }
    return r;

  }

  public static void main(String args[]) {
    int arr[] = { 1, 3, 2, 3, 1 };
    int low = 0;
    int high = arr.length;
    int r = MergeSort(arr, low, high-1);
    System.out.println(r);
    for (int i = 0; i < high; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();
  }

}
