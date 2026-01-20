package reversiothello;

import Clases.Board;
import Clases.CharacterList;
import Clases.Game;
import Clases.GamePc;
import Clases.Player;
import java.util.Scanner;

/**
 * Entry point of the Reversi/Othello game.
 * <p>
 * This class contains the {@code main} method responsible for initializing
 * the game, displaying the game mode menu, creating the players, and
 * starting the game loop.
 * </p>
 *
 * @author Axton Urbina
 */
public class ReversiOthello {

    /**
     * The main method that starts the Reversi/Othello game.
     * <p>
     * The user can choose between Human vs Human or Human vs Computer mode.
     * Based on the selection, the appropriate player objects are created
     * and the game is executed.
     * </p>
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        Board board = new Board();
        Scanner teclado = new Scanner(System.in);

        System.out.println("--- BIENVENIDO AL OTHELLO ---");
        System.out.println("1. Humano vs Humano");
        System.out.println("2. Humano vs Computadora");
        System.out.print("Seleccione modo: ");

        int modeSelected = teclado.nextInt();

        Player player1 = new Player("Jugador 1", 'N', true) {};

        Player player2;
        if (modeSelected == 2) {
            player2 = new GamePc("CPU", 'B', false);
        } else {
            player2 = new Player("Jugador 2", 'B', false) {};
        }

        Game partida = new Game(board, player1, player2);

        partida.gameLoop();
    }
}
