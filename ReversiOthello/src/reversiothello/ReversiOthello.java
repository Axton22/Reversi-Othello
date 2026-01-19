/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package reversiothello;

import Clases.Board;
import Clases.CharacterList;
import Clases.Player;

/**
 *
 * @author Axton Urbina
 */
public class ReversiOthello {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CharacterList list = new CharacterList();
        list.insertCharacters();
        
        Player player = new Player("Axton", 'n');
        Player player2 = new Player("Moreno", 'b');
        player2.setTurn(true);
        
        Board board = new Board();
        
        board.locateValidCell(player, list);
        board.showBoard();
        
        
        
        board.putToken(board.searchNodeByChar(player.askMove()), player);
        
        board.cleanBoard();
        board.locateValidCell(player2, list);
        board.showBoard();

    }
    
}
