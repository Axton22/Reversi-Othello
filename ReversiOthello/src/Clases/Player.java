package Clases;

import java.util.Scanner;

/**
 * Represents an abstract player in the game.
 * <p>
 * This class defines the common attributes and behaviors shared by
 * all players, such as name, turn management, game state, and piece color.
 * Concrete player types (human or computer) must extend this class.
 * </p>
 *
 * @author Axton Urbina y Daniel Moreno
 */
public abstract class Player {

    /** Name of the player. */
    private String name;

    /** Indicates whether it is the player's turn. */
    private boolean turn; // True = turno blanco, False = turno negro

    /**
     * Current state of the player in the game:
     * playing, lost, won, or tied.
     */
    private char state;

    /** Token representing the player's piece color. */
    private Token color;

    /**
     * Constructs a player with the specified name, color, and turn state.
     * The player starts in the "playing" state.
     *
     * @param name the player's name
     * @param color the character representing the player's piece color
     * @param turn {@code true} if the player starts the game, {@code false} otherwise
     */
    public Player(String name, char color, boolean turn) {
        this.name = name;
        this.turn = turn;
        this.state = 'j';
        this.color = new Token(color);
    }

    /**
     * Indicates whether it is currently this player's turn.
     *
     * @return {@code true} if it is the player's turn, {@code false} otherwise
     */
    public boolean isTurn() {
        return turn;
    }

    /**
     * Sets the turn state of the player.
     *
     * @param turn {@code true} to assign the turn, {@code false} otherwise
     */
    public void setTurn(boolean turn) {
        this.turn = turn;
    }

    /**
     * Returns the current state of the player.
     *
     * @return a character representing the player's state
     */
    public char getState() {
        return state;
    }

    /**
     * Sets the current state of the player.
     *
     * @param state the new state of the player
     */
    public void setState(char state) {
        this.state = state;
    }

    /**
     * Returns the name of the player.
     *
     * @return the player's name
     */
    public String getName() {
        return name;
    }

    /**
     * Updates the player's name.
     *
     * @param name the new name of the player
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Returns the token representing the player's color.
     *
     * @return the player's {@link Token}
     */
    public Token getColor() {
        return color;
    }

    /**
     * Sets the token representing the player's color.
     *
     * @param color the new {@link Token} color
     */
    public void setColor(Token color) {
        this.color = color;
    }

    /**
     * Requests a move from the player.
     * <p>
     * This default implementation prompts the user to enter a character
     * corresponding to a valid move on the board.
     * Subclasses may override this method to provide different behavior
     * (e.g., computer-controlled players).
     * </p>
     *
     * @param board the game board used to validate the move
     * @return the character representing the chosen move
     */
    public char askMove(Board board) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("\n" + name + " (" + color + "), ingrese carácter donde desea colocar la ficha: ");
        String entrada = teclado.next();
        return entrada.toLowerCase().charAt(0); // se pasa a minúscula por seguridad
    }
}
