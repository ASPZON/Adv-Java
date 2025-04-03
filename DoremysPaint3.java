// /*
//  * 5
// 2
// 8 9
// 3
// 1 1 2
// 4
// 1 1 4 5
// 5
// 2 3 3 3 3
// 4
// 100000 100000 100000 100000
// o/p:
// Yes
// Yes
// No
// No
// Yes

//  */

import java.util.Scanner;

public class DoremysPaint3 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while (t-- > 0) {
            int n = scn.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = scn.nextInt();
            }
            int first = 0;
            int second = 0;
            int fc = 0;
            int sc = 0;

            int third = 0;

            for (int i = 0; i < n; i++) {
                if(first == 0 || first == arr[i]) {
                    first = arr[i];
                    fc++;
                } else if(second == 0 || second == arr[i]) {
                    second = arr[i];
                    sc++;
                } else {
                    third = 1;
                    break;
                }
            }
            
            if(third == 1){
                System.out.println("No");
            } else if(second == 0) {
                System.out.println("Yes");
            } else if(n%2 == 0 && Math.abs(fc - sc) == 0) {
                System.out.println("No");
            } else if(n%2 == 1 && Math.abs(fc - sc) == 1) {
                System.out.println("No");
            } else {
                System.out.println("Yes");
            }
            
        }
    }
}

