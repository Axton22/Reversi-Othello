package Clases;

/**
 * Represents a computer-controlled player in the game.
 * <p>
 * This class extends {@link Player} and overrides the move selection logic
 * so that the computer chooses a valid move automatically at random.
 * </p>
 */
public class GamePc extends Player {

    /**
     * Constructs a computer player with the specified name, color and turn order.
     *
     * @param name the name of the computer player
     * @param color the character representing the player's color
     * @param starts {@code true} if the computer starts the game, {@code false} otherwise
     */
    public GamePc(String name, char color, boolean starts) {
        super(name, color, starts);
    }

    /**
     * Determines the move to be played by the computer.
     * <p>
     * The computer searches for all available valid moves on the board,
     * stores them in a {@link CharacterList}, and randomly selects one
     * of the available options.
     * </p>
     *
     * @param board the game board used to search for valid moves
     * @return the character corresponding to the selected move,
     *         or a blank character if no moves are available
     */
    @Override
    public char askMove(Board board) {
        CharacterList pcOptions = new CharacterList();

        // Busca las fichas disponibles para jugar
        board.searchOptionsAvailable(pcOptions);

        // Recibe el total del contador
        int total = pcOptions.listTraversal();

        if (total > 0) {
            // Generamos el número al azar basado en el total de la lista
            java.util.Random r = new java.util.Random();
            int chooseIndex = r.nextInt(total);

            // Tomamos el carácter exacto de esa posición
            char tokenChoose = pcOptions.getTokenByIndex(chooseIndex);

            System.out.println("La PC eligio el caracter: " + tokenChoose);
            return tokenChoose;
        }
        return ' ';
    }
}
