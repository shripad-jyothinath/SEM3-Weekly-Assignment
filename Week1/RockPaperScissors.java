import java.util.*;
public class RockPaperScissors {
    static String playRound(String playerMove, String computerMove) {
        if (playerMove.equals(computerMove)) return "Draw";
        if ((playerMove.equals("Rock") && computerMove.equals("Scissors")) ||
            (playerMove.equals("Paper") && computerMove.equals("Rock")) ||
            (playerMove.equals("Scissors") && computerMove.equals("Paper")))
            return "Player Wins";
        return "Computer Wins";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        String[] moves = {"Rock", "Paper", "Scissors"};
        String[][] table = new String[5][3];
        int wins = 0, losses = 0, draws = 0;
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter your move (Rock/Paper/Scissors): ");
            String player = sc.next();
            String computer = moves[r.nextInt(3)];
            String result = playRound(player, computer);
            table[i][0] = player;
            table[i][1] = computer;
            table[i][2] = result;
            if (result.equals("Player Wins")) wins++;
            else if (result.equals("Computer Wins")) losses++;
            else draws++;
            System.out.println("Computer: " + computer + " | " + result);
        }
        System.out.println("\nRound | Player Move | Computer Move | Result");
        for (int i = 0; i < 5; i++)
            System.out.printf("%5d | %-11s | %-13s | %s%n",
                    i + 1, table[i][0], table[i][1], table[i][2]);
        System.out.println("\nWins: " + wins + " | Losses: " + losses +
                           " | Draws: " + draws);
        System.out.printf("Win Percentage: %.1f%%%n", wins * 100.0 / 5);
    }
}
