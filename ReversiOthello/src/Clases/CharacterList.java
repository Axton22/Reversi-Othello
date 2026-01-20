package Clases;

/**
 * Represents a singly linked list of characters used to mark valid moves
 * on the game board.
 * <p>
 * Each node in the list is a {@link CharacterNode} that stores a character
 * and a flag indicating whether it has already been used.
 * </p>
 * <p>
 * This class is mainly used to:
 * <ul>
 *   <li>Store available characters</li>
 *   <li>Provide characters by index</li>
 *   <li>Reset usage state between turns</li>
 * </ul>
 * </p>
 *
 * @author Axton Urbina y Daniel Moreno
 */
public class CharacterList {

    /**
     * Reference to the first node of the character list.
     */
    private CharacterNode head;

    /**
     * Constructs an empty CharacterList.
     */
    public CharacterList() {
        this.head = null;
    }

    /**
     * Inserts a new character at the beginning of the list.
     *
     * @param c the character to be inserted
     */
    public void insert(char c) {
        CharacterNode newNode = new CharacterNode(c);

        newNode.setNext(head);
        head = newNode;
    }

    /**
     * Returns the head node of the list.
     *
     * @return the first {@link CharacterNode} in the list
     */
    public CharacterNode getHead() {
        return head;
    }

    /**
     * Inserts a predefined set of characters into the list.
     * These characters are used to visually mark valid board positions.
     */
    public void insertCharacters() {
        insert('!');
        insert('#');
        insert('$');
        insert('%');
        insert('&');
        insert('/');
        insert('(');
        insert(')');
        insert('?');
        insert('¿');
        insert('{');
        insert('}');
        insert('[');
        insert(']');
        insert('<');
        insert('>');
        insert('9');
        insert('8');
        insert('7');
        insert('6');
        insert('5');
        insert('4');
        insert('3');
        insert('2');
        insert('1');
    }

    /**
     * Traverses the list and counts the number of nodes.
     *
     * @return the total number of characters stored in the list
     */
    public int listTraversal() {
        CharacterNode aux = head;
        int count = 0;
        while (aux != null) {
            count++;
            aux = aux.getNext();
        }
        return count;
    }

    /**
     * Returns the character stored at the specified index.
     *
     * @param indexChoose the index of the desired character
     * @return the character at the given index, or a blank space if not found
     */
    public char getTokenByIndex(int indexChoose) {
        CharacterNode aux = head;
        int current = 0;

        while (aux != null) {
            if (current == indexChoose) {
                return aux.getCharacter();
            }
            current++;
            aux = aux.getNext();
        }
        return ' '; 
    }

    /**
     * Resets the usage state of all characters in the list.
     * <p>
     * After calling this method, all characters will be marked as unused.
     * </p>
     */
    public void reboot() {
        CharacterNode aux = head;
        while (aux != null) {
            aux.setIsUsed(false);
            aux = aux.getNext();
        }
    }
}
