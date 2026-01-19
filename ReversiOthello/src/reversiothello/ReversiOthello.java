/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package reversiothello;

import Clases.Board;
import Clases.CharacterList;
import Clases.Game;
import Clases.GamePc;
import Clases.Player;
import java.util.Scanner;

/**
 *
 * @author Axton Urbina
 */
public class ReversiOthello {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Board board = new Board();
        Scanner teclado = new Scanner(System.in);

        System.out.println("--- BIENVENIDO AL OTHELLO ---");
        System.out.println("1. Humano vs Humano");
        System.out.println("2. Humano vs Computadora");
        System.out.print("Seleccione modo: ");
        
        int modeSelected = teclado.nextInt();
        
        Player player1 = new Player("Jugador 1", 'N', true);
        
        Player player2;
        if (modeSelected == 2) {
            player2 = new GamePc("CPU",'B',false);
        } else {
        player2 = new Player("Jugador 2", 'B',false);
        }

        Game partida = new Game(board, player1, player2);

        partida.gameLoop();

    }
    
}
