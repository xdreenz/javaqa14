import java.util.HashSet;

public class Game {
    HashSet<Player> players = new HashSet<>();

    public void register(Player player) {
        players.add(player);
    }

    public int round(String playerName1, String playerName2) {
        int player1Strength = 0;
        int player2Strength = 0;

        for (Player player : players) {
            if (player.getName().equals(playerName1)) {
                player1Strength = player.getStrength();
            }
            if (player.getName().equals(playerName2)) {
                player2Strength = player.getStrength();
            }

        }
        if (player1Strength == 0) {
            throw new NotRegisteredException("Игрок " + playerName1 + " не зарегистрирован, соревнования не будет!");
        }
        if (player2Strength == 0) {
            throw new NotRegisteredException("Игрок " + playerName2 + " не зарегистрирован, соревнования не будет!");
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
