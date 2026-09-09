import java.util.*;

class Player {
    String name;
    int score;

    Player(String name, int score) {
        this.name = name;
        this.score = score;
    }
}

class Checker implements Comparator<Player> {
  
    public int compare(Player a, Player b) {

            if (a.score != b.score) {
            return b.score - a.score;
        }
      return a.name.compareTo(b.name);
    }
}

public class Solution {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        Player[] player = new Player[n];

        for (int i = 0; i < n; i++) {
            String name = scan.next();
            int score = scan.nextInt();

            player[i] = new Player(name, score);
        }

        Checker checker = new Checker();

        Arrays.sort(player, checker);

        for (int i = 0; i < player.length; i++) {
            System.out.println(
                player[i].name + " " + player[i].score
            );
        }

        scan.close();
    }
}

#Input 
  5
  amy 100
  david 100
  heraldo 50
  aakansha 75
  aleksa 150
#Output 
  aleksa 150
  amy 100
  david 100
  aakansha 75
  heraldo 50
