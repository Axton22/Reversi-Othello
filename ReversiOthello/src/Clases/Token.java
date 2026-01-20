package Clases;

/**
 * Represents a token placed on the game board.
 * <p>
 * A token stores a character that represents the state of a board cell:
 * empty, black, or white.
 * </p>
 *
 * @author Axton Urbina y Daniel Moreno
 */
public class Token {

    /**
     * Character representing the state of the token:
     * _ = empty, N = black, B = white.
     */
    private char state; // _ = vacío, N = negro, B = blanco

    /**
     * Constructs a token with the specified state.
     *
     * @param state the character representing the token state
     */
    public Token(char state) {
        this.state = state;
    }

    /**
     * Returns the current state of the token.
     *
     * @return the character representing the token state
     */
    public char getState() {
        return state;
    }

    /**
     * Updates the state of the token.
     *
     * @param color the new character representing the token state
     */
    public void setState(char color) {
        this.state = color;
    }

    /**
     * Returns a string representation of the token.
     *
     * @return a string describing the token
     */
    @Override
    public String toString() {
        return "Token{" + "state=" + state + '}';
    }
}
