import java.util.*;
class Checker implements Comparator<Player>
{
    @Override
    public int compare(Player p1, Player p2)
    {
        String name1 = p1.name;
        String name2 = p2.name;
        
        int score1 = p1.score;
        int score2 = p2.score;
        
        if(score1 < score2)
        {
            return 1;
        }
        else if(score1 > score2)
        {
            return -1;
        }
        else
        {
            return name1.compareTo(name2);
        }
    }  
}

class Player{
    String name;
    int score;
    
    Player(String name, int score){
        this.name = name;
        this.score = score;
    }
}

class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        Player[] player = new Player[n];
        Checker checker = new Checker();
        
        for(int i = 0; i < n; i++){
            player[i] = new Player(scan.next(), scan.nextInt());
        }
        scan.close();

        Arrays.sort(player, checker);
        for(int i = 0; i < player.length; i++){
            System.out.printf("%s %s\n", player[i].name, player[i].score);
        }
    }
}
