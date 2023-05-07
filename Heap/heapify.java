package Heap;

public class heapify {
    
    static void deletion(int arr[], int n) {
       
       
           if(n==0)
           return;
            // System.out.println(arr[0]);
            int temp = arr[0];
            arr[0] = arr[n - 1];
            arr[n - 1] = temp;
            heapy(arr, n, 0);
           
           
        }
    

   

    public static void heapy(int arr[], int n, int i) {
        int largest = i;
        int l = (2 * i) + 1;
        int r = (2 * i) + 2;
        if (l < n && arr[l] > arr[largest]) {
            largest = l;
        }
        if (r < n && arr[r] > arr[largest]) {
            largest = r;
        }
        if (largest != i) {
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;
            heapy(arr, n-1, largest);
        }
      
    }

    public static void main(String args[]) {
        int arr[] = { 8, 3, 2, 12, 1, 8, 3 };
        int n = arr.length;
        int start = (n / 2) - 1; // last non-leaft node
        for (int i = start; i >=0; i--) {
            heapy(arr, n, i);
        }
       
       for(int i=0;i<n;i++)
       {
        deletion(arr, n-i);
       }
       for(int i=0;i<arr.length;i++)
       {
      System.out.println(arr[i]);
       }
    }
}