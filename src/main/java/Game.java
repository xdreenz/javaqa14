import java.util.ArrayList;
import java.util.List;

public class Game {
    List<Player> players = new ArrayList<>();

    public void register(Player player) {
        players.add(player);
    }

    public int round(String playerName1, String playerName2) {
        int player1Strength = -1;
        int player2Strength = -1;

        for (Player player : players) {
            if (player.getName().equals(playerName1)) {
                player1Strength = player.getStrength();
            }
            if (player.getName().equals(playerName2)) {
                player2Strength = player.getStrength();
            }

        }
        if (player1Strength == -1) {
            throw new NotRegisteredException(playerName1);
        }
        if (player2Strength == -1) {
            throw new NotRegisteredException(playerName2);
        }

        if (player1Strength > player2Strength) {
            return 1;
        } else if (player1Strength < player2Strength) {
            return 2;
        } else {
            return 0;
        }
    }
}
