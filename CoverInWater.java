import java.util.*;

public class CoverInWater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();

            String s = sc.next();

            boolean check = false;

            for (int i = 0; i < s.length() - 2; i++) {
                String str = s.substring(i, i + 3);
                if (str.equals("..."))
             {
                    check = true;
                    break;
                }

            }

            if (check) {
                System.out.println(2);

            } else {
                int cnt = 0;
                for (int i = 0; i < s.length(); i++) {
                    if (s.charAt(i) == '.') {
                        cnt++;
                    }
                }
                System.out.println(cnt);
            }

        }
    }
}
