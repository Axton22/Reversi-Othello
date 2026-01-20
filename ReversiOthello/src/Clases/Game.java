/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author Axton Urbina
 */
public class Game {
    private Board board;
    private Player player1;
    private Player player2;
    private Player currentPlayer;
    private CharacterList charList;
    
    public Game(Board board, Player player1, Player player2) {
        this.board = board;
        this.player1 = player1;
        this.player2 = player2;
        this.currentPlayer = player1;
        this.charList = new CharacterList();
        charList.insertCharacters();
    }
    
    // Verifica que haya movimientos disponibles en el tablero (caracteres diferentes a '_', 'N' y 'B')
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
    
    // Se encarga de limpiar los caracteres que representan movimientos válidos en el tablero
    public void cleanLabels() {
        Node currentRow = board.getFirst(); 
        while (currentRow != null) {
            Node aux = currentRow;
            while (aux != null) {
                char content = aux.getToken().getState();

                // Si no es una ficha negra y no es una ficha blanca
                if (content != 'N' && content != 'B') {
                    // se cambia a que sea '_'  (vacio)
                    aux.getToken().setState('_'); 
                }
                aux = aux.getEast();
            }
            currentRow = currentRow.getSouth();
        }
    }
    
    // Cambia el turno
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
    
    // Deterta el ganador
    public Player winnerDetector(Player p1, Player p2) {
        int score1 = 0;
        int score2 = 0;
        
        // Obtenemos el color de ficha que está jugando cada jugador
        char c1 = p1.getColor().getState();
        char c2 = p2.getColor().getState();
        
        // El contador aumenta cada que se encuentre una ficha del jugador correspondiente
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
        return null; // Empate
    }
    
    // Devuelve true si el juego acaba
    public boolean isEndGame() {
        // Juador 1
        cleanLabels();
        charList.reboot();
        board.locateValidCell(player1, charList);
        boolean p1MakeMove = movementsAvailable(player1);

        // Jugador 2
        cleanLabels();
        charList.reboot();
        board.locateValidCell(player2, charList);
        boolean p2MakeMove = movementsAvailable(player2);

        //  Dejamos el tablero limpio para el turno real
        cleanLabels();
        charList.reboot();

        // El juego termina solo si AMBOS no pueden hacer más movimientos
        if (p1MakeMove == false && p2MakeMove == false) {
            return true;  
        } else {
            return false; 
        }
    }
    
    // Inserta una ficha en el tablero
    public void putToken(Node node, Player player, Game game) {
        if (node == null) System.out.println("Posicion invalida");
        
        node.getToken().setState(player.getColor().getState());
        
        // Una vez insertada la ficha, se procede a voltera las que quedaron en encierro
        board.encloseDetector(player, node, game);
    }
    
    // Recibe el nodo, color del jugador actual y color enemigo y voltea la ficha de ese nodo si la condición es true
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
    
    public void gameLoop() {

        while (!isEndGame()) { 
            // Limpiamos el tablero y la lista de caracteres al iniciar
            charList.reboot();
            cleanLabels();
            
            // Mostramos jugadas válidas para el jugador actual
            board.locateValidCell(currentPlayer, charList);

            // Si el tablero si se pintó con caracteres en las celdas que se pueden hacer jugadas
            if (movementsAvailable(currentPlayer)) {
                board.showBoard();

                Node node = null;
                 // Repetir hasta que el jugador seleccione una caracter válido
                while (node == null) {
                    char c = currentPlayer.askMove();
                    node = board.searchNodeByChar(c);

                    if (node == null) {
                        System.out.println("❌ Movimiento inválido. Por favor, elige una de las letras numeradas en el tablero.");
                    }
                }
                
                //  Si ya se ingresó un caracter válido, se inserta la ficha en el tablero y se dan vuelta los encierros
                putToken(node, currentPlayer, this); 
                cleanLabels();

            } else {
                System.out.println("\n" + currentPlayer.getName() + " no tiene jugadas. Pasa turno.");
            }
            changeTurn();
        }

        // Salida del bucle = Fin real del juego
        System.out.println("\n--- EL JUEGO HA TERMINADO ---");
        board.showBoard(); // Mostramos cómo quedó el tablero al final
        Player winner = winnerDetector(player1, player2);

        if (winner != null) {
            System.out.println("Ganador: " + winner.getName());
        } else {
            System.out.println("Es un empate.");
        }
    }
    
    
}

