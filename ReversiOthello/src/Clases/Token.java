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
    private boolean color; //True: blanco, False: negro
    
    //Contructor
    public Token(boolean color) {
        this.color = color;
    }
    
    //Setters y Getters
    public boolean isColor() {
        return color;
    }

    public void setColor(boolean color) {
        this.color = color;
    }
     
    //  ToString
    @Override
    public String toString() {
        return "Token{" + "color=" + color + '}';
    }
    
    
}
