import java.util.*;
public class RandomizeQuicksort {
    
    public static void main(String[] args) {
        int arr[] = {8, 3, 0, 9, 6, 7};
        quickSort(arr, 0, arr.length - 1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }
    public static void quickSort(int arr[], int si, int ei) {
        if (si >= ei) {
            return;
        }

        int pi = pivotIndex(arr, si, ei);
        quickSort(arr, si, pi - 1);
        quickSort(arr, pi + 1, ei);
    }
    public static int pivotIndex(int arr[], int si, int ei) {

        Random r = new Random();
        int x = r.nextInt(ei - si + 1) + si;
        int tt = arr[x];
        arr[x] = arr[ei];
        arr[ei] = tt;
        // Now arr[ei] is the pivot element
        // and arr[x] is the random element
        // Now we can use the same logic as before
        // to find the pivot index


        int element = arr[ei];
        int pi = si;

        for (int i = si; i <= ei; i++) {
            if (element > arr[i]) {

                int temp = arr[i];
                arr[i] = arr[pi];
                arr[pi] = temp;
                pi++;
            }
        }
        int temp = arr[ei];
        arr[ei] = arr[pi];
        arr[pi] = temp;

        return pi;

    }
}
