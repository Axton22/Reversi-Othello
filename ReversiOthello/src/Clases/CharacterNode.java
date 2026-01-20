package Clases;

/**
 * Represents a node in a singly linked list of characters.
 * <p>
 * Each node stores a character used to mark valid positions on the board
 * and a flag indicating whether the character has already been used.
 * </p>
 *
 * @author Axton Urbina y Daniel Moreno
 */
public class CharacterNode {

    /**
     * Reference to the next node in the list.
     */
    private CharacterNode next;

    /**
     * Character stored in this node.
     */
    private char character;

    /**
     * Indicates whether this character has already been used.
     */
    private boolean isUsed;

    /**
     * Constructs a CharacterNode with the specified character.
     * The node is initially marked as unused.
     *
     * @param character the character to store in this node
     */
    public CharacterNode(char character) {
        this.character = character;
        this.next = null;
        this.isUsed = false;
    }

    /**
     * Returns the next node in the list.
     *
     * @return the next {@code CharacterNode}, or {@code null} if there is none
     */
    public CharacterNode getNext() {
        return next;
    }

    /**
     * Sets the reference to the next node in the list.
     *
     * @param next the next {@code CharacterNode}
     */
    public void setNext(CharacterNode next) {
        this.next = next;
    }

    /**
     * Returns the character stored in this node.
     *
     * @return the stored character
     */
    public char getCharacter() {
        return character;
    }

    /**
     * Updates the character stored in this node.
     *
     * @param character the new character to store
     */
    public void setCharacter(char character) {
        this.character = character;
    }

    /**
     * Indicates whether this character has already been used.
     *
     * @return {@code true} if the character has been used, {@code false} otherwise
     */
    public boolean isUsed() {
        return isUsed;
    }

    /**
     * Sets the usage state of this character.
     *
     * @param isUsed {@code true} to mark as used, {@code false} otherwise
     */
    public void setIsUsed(boolean isUsed) {
        this.isUsed = isUsed;
    }
}
