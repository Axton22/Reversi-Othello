/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author Axton Urbina
 */
public class CharacterList {
    private CharacterNode head;
    
    public CharacterList() {
        this.head = null;
    }
    
    public void insert (char c) {
        CharacterNode newNode = new CharacterNode(c);
        
        newNode.setNext(head);
        head = newNode;
    }

    public CharacterNode getHead() {
        return head;
    }
    
    public void insertCharacters() {
        insert('!');
        insert('#');
        insert('$');
        insert('%');
        insert('&');
        insert('/');
        insert('(');
        insert(')');
        insert('?');
        insert('¿');
        insert('{');
        insert('}');
        insert('[');
        insert(']');
        insert('<');
        insert('>');
        insert('9');
        insert('8');
        insert('7');
        insert('6');
        insert('5');
        insert('4');
        insert('3');
        insert('2');
        insert('1');
    }
    
    public void reboot() {
        CharacterNode aux = head;
        while (aux != null) {
            aux.setIsUsed(false);
            aux = aux.getNext();
        }
    }
}
