import java.io.*;
import java.util.*;

public class Solution {

    public static List<Integer> maxSubarray(List<Integer> arr) {

        int maxSubarray = arr.get(0);
        int currentSum = arr.get(0);

        int maxSubsequence = arr.get(0);

        for (int i = 1; i < arr.size(); i++) {

            int value = arr.get(i);

            currentSum = Math.max(value, currentSum + value);
            maxSubarray = Math.max(maxSubarray, currentSum);

            if (value > 0) {
                maxSubsequence += value;
            }
        }

        boolean allNegative = true;

        for (int value : arr) {
            if (value > 0) {
                allNegative = false;
                break;
            }
        }

        if (allNegative) {
            maxSubsequence = Collections.max(arr);
        }

        return Arrays.asList(maxSubarray, maxSubsequence);
    }

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader =
                new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(bufferedReader.readLine().trim());

        while (t-- > 0) {

            int n = Integer.parseInt(bufferedReader.readLine().trim());

            String[] input =
                    bufferedReader.readLine().trim().split(" ");

            List<Integer> arr = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                arr.add(Integer.parseInt(input[i]));
            }

            List<Integer> result = maxSubarray(arr);

            System.out.println(result.get(0) + " " + result.get(1));
        }

        bufferedReader.close();
    }
}
#Input (stdin)
2
4
1 2 3 4
6
2 -1 2 3 4 -5
  #Output (stdout)
10 10
10 11
