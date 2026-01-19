/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.util.Scanner;

/**
 *
 * @author Axton Urbina
 */
public class Player {
    private String name; 
    private boolean turn; // True = turno blanco, False = turno negro
    private char state; // Jugando, perdió, ganó o empató
    private Token color;
    
    public Player(String name, char color, boolean turn) {
        this.name = name;
        this.turn = turn;
        this.state = 'j';
        this.color = new Token(color);
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

    public Token getColor() {
        return color;
    }

    public void setColor(Token color) {
        this.color = color;
    }
    
    
    public char askMove() {
        Scanner teclado = new Scanner(System.in);
        System.out.print("\n" + name + " (" + color + "), ingrese carácter donde desea colocar la ficha: ");
        String entrada = teclado.next(); 
        return entrada.toLowerCase().charAt(0); // se pasa a minúscula por seguridad
    }
    
}
