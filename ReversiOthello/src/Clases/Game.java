package Clases;

/**
 * Represents the main game controller for a Reversi (Othello) match.
 * <p>
 * This class coordinates the interaction between the board, the players,
 * turn management, move validation, game progression, and winner detection.
 * </p>
 * <p>
 * It is responsible for:
 * <ul>
 *   <li>Managing turns</li>
 *   <li>Detecting valid moves</li>
 *   <li>Handling token placement and flipping</li>
 *   <li>Determining the end of the game</li>
 *   <li>Executing the main game loop</li>
 * </ul>
 * </p>
 *
 * @author Axton Urbina y Daniel Moreno
 */
public class Game {

    /**
     * The game board.
     */
    private Board board;

    /**
     * First player.
     */
    private Player player1;

    /**
     * Second player.
     */
    private Player player2;

    /**
     * The player whose turn is currently active.
     */
    private Player currentPlayer;

    /**
     * List of characters used to mark valid moves.
     */
    private CharacterList charList;

    /**
     * Constructs a new Game instance.
     *
     * @param board the game board
     * @param player1 the first player
     * @param player2 the second player
     */
    public Game(Board board, Player player1, Player player2) {
        this.board = board;
        this.player1 = player1;
        this.player2 = player2;
        this.currentPlayer = player1;
        this.charList = new CharacterList();
        charList.insertCharacters();
    }

    /**
     * Checks whether there are available moves on the board for the given player.
     * <p>
     * A move is considered available if the board contains at least one
     * character different from '_', 'N', or 'B'.
     * </p>
     *
     * @param player the player to check
     * @return {@code true} if at least one move is available, {@code false} otherwise
     */
    public boolean movementsAvailable(Player player) {
        Node currentRow = board.getFirst();
        while (currentRow != null) {
            Node aux = currentRow;
            while (aux != null) {
                char c = aux.getToken().getState();

                if (c != '_' && c != 'N' && c != 'B') {
                    return true; 
                }
                aux = aux.getEast();
            }
            currentRow = currentRow.getSouth();
        }
        return false; 
    } 

    /**
     * Clears all temporary characters representing valid moves from the board.
     * <p>
     * Only permanent tokens ('N' and 'B') remain on the board.
     * </p>
     */
    public void cleanLabels() {
        Node currentRow = board.getFirst(); 
        while (currentRow != null) {
            Node aux = currentRow;
            while (aux != null) {
                char content = aux.getToken().getState();

                if (content != 'N' && content != 'B') {
                    aux.getToken().setState('_'); 
                }
                aux = aux.getEast();
            }
            currentRow = currentRow.getSouth();
        }
    }

    /**
     * Switches the turn between players.
     */
    public void changeTurn() {
        if (currentPlayer == player1) {
            player1.setTurn(false);
            player2.setTurn(true);
            currentPlayer = player2;
        } else {
            player2.setTurn(false);
            player1.setTurn(true);
            currentPlayer = player1;
        }
    }

    /**
     * Determines the winner of the game by counting the tokens on the board.
     *
     * @param p1 the first player
     * @param p2 the second player
     * @return the winning player, or {@code null} if the game ends in a tie
     */
    public Player winnerDetector(Player p1, Player p2) {
        int score1 = 0;
        int score2 = 0;

        char c1 = p1.getColor().getState();
        char c2 = p2.getColor().getState();

        Node row = board.getFirst();
        while (row != null) {
            Node aux = row;
            while (aux != null) {
                char current = aux.getToken().getState();
                if (current == c1) 
                    score1++;
                else if (current == c2) 
                    score2++;

                aux = aux.getEast();
            }
            row = row.getSouth();
        }

        System.out.println("\n--- MARCADOR FINAL ---");
        System.out.println(p1.getName() + ": " + score1);
        System.out.println(p2.getName() + ": " + score2);

        if (score1 > score2) return p1;
        if (score2 > score1) return p2;
        return null; // Tie
    }

    /**
     * Determines whether the game has ended.
     * <p>
     * The game ends only if neither player has any valid moves remaining.
     * </p>
     *
     * @return {@code true} if the game is over, {@code false} otherwise
     */
    public boolean isEndGame() {
        cleanLabels();
        charList.reboot();
        board.locateValidCell(player1, charList);
        boolean p1MakeMove = movementsAvailable(player1);

        cleanLabels();
        charList.reboot();
        board.locateValidCell(player2, charList);
        boolean p2MakeMove = movementsAvailable(player2);

        cleanLabels();
        charList.reboot();

        return p1MakeMove == false && p2MakeMove == false;
    }

    /**
     * Places a token on the board for the specified player.
     *
     * @param node the node where the token will be placed
     * @param player the player making the move
     * @param game the current game instance
     */
    public void putToken(Node node, Player player, Game game) {
        if (node == null) System.out.println("Posicion invalida");

        node.getToken().setState(player.getColor().getState());
        board.encloseDetector(player, node, game);
    }

    /**
     * Flips opponent tokens enclosed by a newly placed token.
     *
     * @param north enclosure in north direction
     * @param south enclosure in south direction
     * @param east enclosure in east direction
     * @param west enclosure in west direction
     * @param northeast enclosure in northeast direction
     * @param northwest enclosure in northwest direction
     * @param southeast enclosure in southeast direction
     * @param southwest enclosure in southwest direction
     * @param node the reference node where the token was placed
     * @param myColor the current player's token color
     * @param enemyColor the opponent's token color
     */
    public void flipTokens(boolean north, boolean south, boolean east,
            boolean west, boolean northeast, boolean northwest,
            boolean southeast, boolean southwest,
            Node node, char myColor, char enemyColor) {

        Node aux;

        if (north) {
            aux = node.getNorth();
            while (aux.getToken().getState() == enemyColor) {
                aux.getToken().setState(myColor);
                aux = aux.getNorth();
            }
        }

        if (south) {
            aux = node.getSouth();
            while (aux.getToken().getState() == enemyColor) {
                aux.getToken().setState(myColor);
                aux = aux.getSouth();
            }
        }

        if (east) {
            aux = node.getEast();
            while (aux.getToken().getState() == enemyColor) {
                aux.getToken().setState(myColor);
                aux = aux.getEast();
            }
        }

        if (west) {
            aux = node.getWest();
            while (aux.getToken().getState() == enemyColor) {
                aux.getToken().setState(myColor);
                aux = aux.getWest();
            }
        }

        if (northeast) {
            aux = node.getNortheast();
            while (aux.getToken().getState() == enemyColor) {
                aux.getToken().setState(myColor);
                aux = aux.getNortheast();
            }
        }

        if (northwest) {
            aux = node.getNorthwest();
            while (aux.getToken().getState() == enemyColor) {
                aux.getToken().setState(myColor);
                aux = aux.getNorthwest();
            }
        }

        if (southeast) {
            aux = node.getSoutheast();
            while (aux.getToken().getState() == enemyColor) {
                aux.getToken().setState(myColor);
                aux = aux.getSoutheast();
            }
        }

        if (southwest) {
            aux = node.getSouthwest();
            while (aux.getToken().getState() == enemyColor) {
                aux.getToken().setState(myColor);
                aux = aux.getSouthwest();
            }
        }
    }

    /**
     * Executes the main game loop.
     * <p>
     * The loop continues until the game reaches an end condition.
     * </p>
     */
    public void gameLoop() {

        while (!isEndGame()) {
            charList.reboot();
            cleanLabels();

            board.locateValidCell(currentPlayer, charList);

            if (movementsAvailable(currentPlayer)) {
                board.showBoard();

                Node node = null;
                while (node == null) {
                    char c = currentPlayer.askMove(board);
                    node = board.searchNodeByChar(c);

                    if (node == null) {
                        System.out.println("Movimiento inválido. Por favor, elige una de las letras numeradas en el tablero.");
                    }
                }

                putToken(node, currentPlayer, this);
                cleanLabels();

            } else {
                System.out.println("\n" + currentPlayer.getName() + " no tiene jugadas. Pasa turno.");
            }
            changeTurn();
        }

        System.out.println("\n--- EL JUEGO HA TERMINADO ---");
        board.showBoard();
        Player winner = winnerDetector(player1, player2);

        if (winner != null) {
            System.out.println("Ganador: " + winner.getName());
        } else {
            System.out.println("Es un empate.");
        }
    }
}
