import java.io.*;
import java.util.*;
import java.util.stream.*;

public class Solution {

    public static int birthday(List<Integer> s, int d, int m) {
        int count = 0;

        for (int i = 0; i <= s.size() - m; i++) {
            int sum = 0;

            for (int j = i; j < i + m; j++) {
                sum += s.get(j);
            }

            if (sum == d) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader =
                new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> s = Stream.of(
                bufferedReader.readLine().trim().split(" ")
        )
        .map(Integer::parseInt)
        .collect(Collectors.toList());

        String[] firstMultipleInput =
                bufferedReader.readLine().trim().split(" ");

        int d = Integer.parseInt(firstMultipleInput[0]);
        int m = Integer.parseInt(firstMultipleInput[1]);

        int result = birthday(s, d, m);

        System.out.println(result);

        bufferedReader.close();
    }
}
#Input (stdin)
5
1 2 1 3 2
3 2
#Output (stdout)
2
