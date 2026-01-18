/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author Axton Urbina
 */
public class CharacterNode {
    private CharacterNode next;
    private char character;
    private boolean isUsed;
    
    public CharacterNode (char character) {
        this.character = character;
        this.next = null;
        this.isUsed = false;
    }

    public CharacterNode getNext() {
        return next;
    }

    public void setNext(CharacterNode next) {
        this.next = next;
    }

    public char getCharacter() {
        return character;
    }

    public void setCharacter(char character) {
        this.character = character;
    }

    public boolean isUsed() {
        return isUsed;
    }

    public void setIsUsed(boolean isUsed) {
        this.isUsed = isUsed;
    }
    
    
}
