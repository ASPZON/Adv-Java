import java.util.*;

public class HalloumiBoxes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0)
        {
            int n = sc.nextInt();
            int k = sc.nextInt();

            boolean sorted = true;
            int prev = 0;

            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
                if (prev > arr[i]) {
                    sorted = false;
                }
                prev = arr[i];

            }
            if(k>=2)System.out.println("YES");
            else if (sorted) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
    }
}
}
