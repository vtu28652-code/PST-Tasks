
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[][] arr = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int left = 0;
        int right = 0;

        for (int i = 0; i < n; i++) {
            left += arr[i][i];
            right += arr[i][n - 1 - i];
        }

        System.out.println(Math.abs(left - right));
    }
}

#Input (stdin)
3
11 2 4
4 5 6
10 8 -12
# Output (stdout)
15
