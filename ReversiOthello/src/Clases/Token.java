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
    private char color; //v = vacío, n = negro, b = blanco
    
    //Contructor
    public Token(char color) {
        this.color = color;
    }
    
    //Setters y Getters
    public char getColor() {
        return color;
    }

    public void setColor(char color) {
        this.color = color;
    }
     
    //  ToString
    @Override
    public String toString() {
        return "Token{" + "color=" + color + '}';
    }
    
    
}
