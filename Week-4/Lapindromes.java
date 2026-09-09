import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {

    static boolean isLapindrome(String s) {

        int n = s.length();
        int mid = n / 2;

        String left = s.substring(0, mid);

        String right = (n % 2 == 0)
                ? s.substring(mid)
                : s.substring(mid + 1);

        Map<Character, Long> leftCount = left.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        Collectors.counting()
                ));

        Map<Character, Long> rightCount = right.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        Collectors.counting()
                ));

        return leftCount.equals(rightCount);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T-- > 0) {
            String s = sc.next();

            System.out.println(
                    isLapindrome(s) ? "YES" : "NO"
            );
        }

        sc.close();
    }
}
#Input 
  6
gaga
abcde
rotor
xyzxy
abbaab
ababc
  #Output 
  YES
NO
YES
YES
NO
NO
  
