import java.io.*;
import java.util.*;

public class Solution {

    public static List<Integer> compareTriplets(
            List<Integer> a,
            List<Integer> b) {

        int alice = 0;
        int bob = 0;

        for (int i = 0; i < 3; i++) {

            if (a.get(i) > b.get(i)) {
                alice++;
            } 
            else if (a.get(i) < b.get(i)) {
                bob++;
            }
        }

        return Arrays.asList(alice, bob);
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));

        String[] first = br.readLine().split(" ");
        String[] second = br.readLine().split(" ");

        List<Integer> a = new ArrayList<>();
        List<Integer> b = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            a.add(Integer.parseInt(first[i]));
            b.add(Integer.parseInt(second[i]));
        }

        List<Integer> result = compareTriplets(a, b);

        System.out.println(result.get(0) + " " + result.get(1));
    }
}
#Input 
  5 6 7
3 6 10
  
#Output
1 1
