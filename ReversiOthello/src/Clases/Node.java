package Clases;

/**
 * Represents a cell (node) on the game board.
 * <p>
 * Each node is connected to up to eight neighboring nodes
 * (north, south, east, west and the four diagonals),
 * allowing traversal in all directions as required by the game logic.
 * </p>
 * <p>
 * A node also contains a {@link Token} that represents the current
 * state of the cell (empty or occupied by a player's piece).
 * </p>
 *
 * @author Axton Urbina y Daniel Moreno
 */
public class Node {

    /** Reference to the node above this one. */
    private Node north;

    /** Reference to the node below this one. */
    private Node south;

    /** Reference to the node to the right. */
    private Node east;

    /** Reference to the node to the left. */
    private Node west;

    /** Reference to the node located at the northeast. */
    private Node northeast;

    /** Reference to the node located at the northwest. */
    private Node northwest;

    /** Reference to the node located at the southeast. */
    private Node southeast;

    /** Reference to the node located at the southwest. */
    private Node southwest;

    /** Reference used to link nodes in a linear structure if needed. */
    Node next;

    /**
     * Token representing the state of the board cell:
     * occupied by a piece or empty.
     */
    private Token token;

    /**
     * Constructs a node and initializes all directional references to {@code null}.
     * The node is initialized with a {@link Token} using the given character.
     *
     * @param token the character representing the initial state of the cell
     */
    public Node(char token) {
        this.north = null;
        this.east = null;
        this.south = null;
        this.west = null;
        this.northeast = null;
        this.northwest = null;
        this.southeast = null;
        this.southwest = null;
        this.token = new Token(token);
    }

    /**
     * Returns the next node in a linear structure.
     *
     * @return the next {@code Node}, or {@code null} if there is none
     */
    public Node getNext() {
        return next;
    }

    /**
     * Sets the next node in a linear structure.
     *
     * @param next the next {@code Node}
     */
    public void setNext(Node next) {
        this.next = next;
    }

    /**
     * Returns the node located to the north.
     *
     * @return the north {@code Node}
     */
    public Node getNorth() {
        return north;
    }

    /**
     * Sets the node located to the north.
     *
     * @param north the north {@code Node}
     */
    public void setNorth(Node north) {
        this.north = north;
    }

    /**
     * Returns the node located to the south.
     *
     * @return the south {@code Node}
     */
    public Node getSouth() {
        return south;
    }

    /**
     * Sets the node located to the south.
     *
     * @param south the south {@code Node}
     */
    public void setSouth(Node south) {
        this.south = south;
    }

    /**
     * Returns the node located to the east.
     *
     * @return the east {@code Node}
     */
    public Node getEast() {
        return east;
    }

    /**
     * Sets the node located to the east.
     *
     * @param east the east {@code Node}
     */
    public void setEast(Node east) {
        this.east = east;
    }

    /**
     * Returns the node located to the west.
     *
     * @return the west {@code Node}
     */
    public Node getWest() {
        return west;
    }

    /**
     * Sets the node located to the west.
     *
     * @param west the west {@code Node}
     */
    public void setWest(Node west) {
        this.west = west;
    }

    /**
     * Returns the node located to the northeast.
     *
     * @return the northeast {@code Node}
     */
    public Node getNortheast() {
        return northeast;
    }

    /**
     * Sets the node located to the northeast.
     *
     * @param northeast the northeast {@code Node}
     */
    public void setNortheast(Node northeast) {
        this.northeast = northeast;
    }

    /**
     * Returns the node located to the northwest.
     *
     * @return the northwest {@code Node}
     */
    public Node getNorthwest() {
        return northwest;
    }

    /**
     * Sets the node located to the northwest.
     *
     * @param northwest the northwest {@code Node}
     */
    public void setNorthwest(Node northwest) {
        this.northwest = northwest;
    }

    /**
     * Returns the node located to the southeast.
     *
     * @return the southeast {@code Node}
     */
    public Node getSoutheast() {
        return southeast;
    }

    /**
     * Sets the node located to the southeast.
     *
     * @param southeast the southeast {@code Node}
     */
    public void setSoutheast(Node southeast) {
        this.southeast = southeast;
    }

    /**
     * Returns the node located to the southwest.
     *
     * @return the southwest {@code Node}
     */
    public Node getSouthwest() {
        return southwest;
    }

    /**
     * Sets the node located to the southwest.
     *
     * @param southwest the southwest {@code Node}
     */
    public void setSouthwest(Node southwest) {
        this.southwest = southwest;
    }

    /**
     * Returns the token associated with this node.
     *
     * @return the {@link Token} stored in this node
     */
    public Token getToken() {
        return token;
    }

    /**
     * Sets the token associated with this node.
     *
     * @param state the new {@link Token}
     */
    public void setToken(Token state) {
        this.token = state;
    }

    /**
     * Returns a string representation of this node and its connections.
     *
     * @return a string describing the node
     */
    @Override
    public String toString() {
        return "Node{" + "north=" + north + ", south=" + south + ", east=" + east + ", west=" + west
                + ", northeast=" + northeast + ", northwest=" + northwest
                + ", southeast=" + southeast + ", southwest=" + southwest + ", state=" + token + '}';
    }
}
