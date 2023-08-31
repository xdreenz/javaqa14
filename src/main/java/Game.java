import java.util.HashMap;

public class Game {
    HashMap<String, Player> players = new HashMap<>();

    public void register(Player player) {
        players.put(player.getName(), player);  //Ну да, имя будет дублироваться, а что делать?
    }

    public int round(String playerName1, String playerName2) {
        int player1Strength, player2Strength;

        if (players.containsKey(playerName1)) {
            player1Strength = players.get(playerName1).getStrength();
        } else {
            throw new NotRegisteredException("Игрок " + playerName1 + " не зарегистрирован, соревнования не будет!");
        }
        if (players.containsKey(playerName2)) {
            player2Strength = players.get(playerName2).getStrength();
        } else {
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
