import java.util.*;


public class cf1878 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();

            boolean check = false;
            for (int i = 0; i < n; i++) {
                if (m == sc.nextInt()) {
                    check = true;
                    break;
                }
            }
            System.out.println(check ? "YES" : "NO");
        }
    }
}
    