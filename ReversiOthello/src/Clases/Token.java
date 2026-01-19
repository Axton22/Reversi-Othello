/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author Axton Urbina
 */
public class Token {
    private char state; //v = vacío, n = negro, b = blanco
    
    //Contructor
    public Token(char state) {
        this.state = state;
    }
    
    //Setters y Getters
    public char getState() {
        return state;
    }

    public void setState(char color) {
        this.state = color;
    }
     
    //  ToString
    @Override
    public String toString() {
        return "Token{" + "state=" + state + '}';
    }
    
    
}
