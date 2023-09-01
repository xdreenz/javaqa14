import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GameTest {
    Game game = new Game();
    Player player1 = new Player(2, "Иван", 3);
    Player player2 = new Player(5, "Михаил", 7);
    Player player3 = new Player(9, "Николай", 4);
    Player player4 = new Player(13, "Павел", 4);

    @BeforeEach
    void setUp() {
        game.register(player1);
        game.register(player2);
        game.register(player3);
        game.register(player4);
    }

    @Test
    void shouldPlayer1Win() {
        int expected = 1;
        int actual = game.round("Павел", "Иван");

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldPlayer2Win() {
        int expected = 2;
        int actual = game.round("Николай", "Михаил");

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldDraw() {
        int expected = 0;
        int actual = game.round("Николай", "Павел");

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldThrowNotRegisteredExceptionForPlayer1() {
        Assertions.assertThrows(NotRegisteredException.class, () -> {
            int actual = game.round("Григорий", "Павел");
        });
    }

    @Test
    void shouldThrowNotRegisteredExceptionForPlayer2() {
        Assertions.assertThrows(NotRegisteredException.class, () -> {
            int actual = game.round("Михаил", "Олег");
        });
    }
}