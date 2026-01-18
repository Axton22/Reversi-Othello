/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author Axton Urbina
 */
public class Player {
    private String name; 
    private boolean turn; // True = turno blanco, False = turno negro
    private char state; // Jugando, perdió, ganó o empató
    
    public Player() {
        
    }

    public boolean isTurn() {
        return turn;
    }

    public void setTurn(boolean turn) {
        this.turn = turn;
    }

    public char getState() {
        return state;
    }

    public void setState(char state) {
        this.state = state;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
    
}
