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
    
    public Game(Board board, Player player1, Player player2) {
        this.board = board;
        this.player1 = player1;
        this.player2 = player2;
    }
    
    
    // Los siguientes métodos booleanos retornan verdadero si hay una jugada válida (para cada una de las direcciones)
    public boolean eastTraversal(Node node, Player player) {
        Node aux = node;
        
        if (player.isTurn()) { // Turno blanco
            while (aux.getEast() != null &&
                    aux.getEast().getState().getColor() == 'n') {
                aux = aux.getEast();
            }
            return aux.getEast() != null && 
                    aux.getEast().getState().getColor() == 'b';
        } else { // Turno negro
            while (aux.getEast() != null && 
                    aux.getEast().getState().getColor() == 'b') {
                aux = aux.getEast();
            }
            return aux.getEast() != null &&
                    aux.getEast().getState().getColor() == 'n';
        } 
    }
    
    public boolean westTraversal(Node node, Player player) {
        Node aux = node;
        
        if (player.isTurn()) { // Turno blanco
            while (aux.getWest()!= null &&
                    aux.getWest().getState().getColor() == 'n') {
                aux = aux.getWest();
            }
            return aux.getWest() != null && 
                    aux.getWest().getState().getColor() == 'b';
        } else { // Turno negro
            while (aux.getWest() != null && 
                    aux.getWest().getState().getColor() == 'b') {
                aux = aux.getWest();
            }
            return aux.getWest() != null &&
                    aux.getWest().getState().getColor() == 'n';
        } 
    }
    
    public boolean northTraversal(Node node, Player player) {
        Node aux = node;
        
        if (player.isTurn()) { // Turno blanco
            while (aux.getNorth()!= null &&
                    aux.getNorth().getState().getColor() == 'n') {
                aux = aux.getNorth();
            }
            return aux.getNorth() != null && 
                    aux.getNorth().getState().getColor() == 'b';
        } else { // Turno negro
            while (aux.getNorth() != null && 
                    aux.getNorth().getState().getColor() == 'b') {
                aux = aux.getNorth();
            }
            return aux.getNorth() != null &&
                    aux.getNorth().getState().getColor() == 'n';
        } 
    }
    
    public boolean southTraversal(Node node, Player player) {
        Node aux = node;
        
        if (player.isTurn()) { // Turno blanco
            while (aux.getSouth()!= null &&
                    aux.getSouth().getState().getColor() == 'n') {
                aux = aux.getSouth();
            }
            return aux.getSouth() != null && 
                    aux.getSouth().getState().getColor() == 'b';
        } else { // Turno negro
            while (aux.getSouth() != null && 
                    aux.getSouth().getState().getColor() == 'b') {
                aux = aux.getSouth();
            }
            return aux.getSouth() != null &&
                    aux.getSouth().getState().getColor() == 'n';
        } 
    }
    
    public boolean northeastTraversal(Node node, Player player) {
        Node aux = node;
        
        if (player.isTurn()) { // Turno blanco
            while (aux.getNortheast()!= null &&
                    aux.getNortheast().getState().getColor() == 'n') {
                aux = aux.getNortheast();
            }
            return aux.getNortheast() != null && 
                    aux.getNortheast().getState().getColor() == 'b';
        } else { // Turno negro
            while (aux.getNortheast() != null && 
                    aux.getNortheast().getState().getColor() == 'b') {
                aux = aux.getNortheast();
            }
            return aux.getNortheast() != null &&
                    aux.getNortheast().getState().getColor() == 'n';
        } 
    }
    
    public boolean northewestTraversal(Node node, Player player) {
        Node aux = node;
        
        if (player.isTurn()) { // Turno blanco
            while (aux.getNorthwest()!= null &&
                    aux.getNorthwest().getState().getColor() == 'n') {
                aux = aux.getNorthwest();
            }
            return aux.getNorthwest() != null && 
                    aux.getNorthwest().getState().getColor() == 'b';
        } else { // Turno negro
            while (aux.getNorthwest() != null && 
                    aux.getNorthwest().getState().getColor() == 'b') {
                aux = aux.getNorthwest();
            }
            return aux.getNorthwest() != null &&
                    aux.getNorthwest().getState().getColor() == 'n';
        } 
    }
    
    public boolean southeastTraversal(Node node, Player player) {
        Node aux = node;
        
        if (player.isTurn()) { // Turno blanco
            while (aux.getSoutheast()!= null &&
                    aux.getSoutheast().getState().getColor() == 'n') {
                aux = aux.getSoutheast();
            }
            return aux.getSoutheast() != null && 
                    aux.getSoutheast().getState().getColor() == 'b';
        } else { // Turno negro
            while (aux.getSoutheast() != null && 
                    aux.getSoutheast().getState().getColor() == 'b') {
                aux = aux.getSoutheast();
            }
            return aux.getSoutheast() != null &&
                    aux.getSoutheast().getState().getColor() == 'n';
        } 
    }
    
    public boolean southwestTraversal(Node node, Player player) {
        Node aux = node;
        
        if (player.isTurn()) { // Turno blanco
            while (aux.getSouthwest()!= null &&
                    aux.getSouthwest().getState().getColor() == 'n') {
                aux = aux.getSouthwest();
            }
            return aux.getSouthwest() != null && 
                    aux.getSouthwest().getState().getColor() == 'b';
        } else { // Turno negro
            while (aux.getSouthwest() != null && 
                    aux.getSouthwest().getState().getColor() == 'b') {
                aux = aux.getSouthwest();
            }
            return aux.getSouthwest() != null &&
                    aux.getSouthwest().getState().getColor() == 'n';
        } 
    }
    
    public void locateValidCell(Player player) {
        Node first = board.getFirst();
        Node aux = first;
        
        if (player.isTurn()) { // Turno blanco
            while (aux != null) {
                
                // Primero ocupamos ubicarnos en una casilla vacía
                if (aux.getState().getColor() == 'v') {
                    boolean isValidCell = false;

                    // Buscamos una ficha enemiga adyacente a la casilla vacía
                    if (aux.getNorth() != null &&
                            aux.getNorth().getState().getColor() == 'n') {
                        if (northTraversal(aux, player)) isValidCell = true;
                    } 
                    if (aux.getSouth() != null &&
                            aux.getSouth().getState().getColor() == 'n') {
                        if (southTraversal(aux, player)) isValidCell = true;
                    }
                    if (aux.getEast() != null && 
                            aux.getEast().getState().getColor() == 'n') {
                        if (eastTraversal(aux, player)) isValidCell = true;
                    }
                    if (aux.getWest() != null &&
                            aux.getWest().getState().getColor() == 'n') {
                        if (westTraversal(aux, player)) isValidCell = true;
                    }
                    if (aux.getNortheast() != null && 
                            aux.getNortheast().getState().getColor() == 'n') {
                        if (northeastTraversal(aux, player)) isValidCell = true;
                    }
                    if (aux.getNorthwest() != null &&
                            aux.getNorthwest().getState().getColor() == 'n') {
                        if (northewestTraversal(aux, player)) isValidCell = true;
                    }
                    if (aux.getSoutheast() != null &&
                            aux.getSoutheast().getState().getColor() == 'n') {
                        if (southeastTraversal(aux, player)) isValidCell = true;
                    }
                    if (aux.getSouthwest() != null && 
                            aux.getSouthwest().getState().getColor() == 'n') {
                        if (southwestTraversal(aux, player)) isValidCell = true;
                    }

                    /* Si hay al menos una direción que termine en jugada válida,
                    la casilla actual pasa a ser una casilla válida para colocar ficha*/
                    if (isValidCell) aux.getState().setColor('?');
                }
                aux = aux.getEast();

                
                if (aux == null) {
                    first = first.getSouth();
                    aux = first;
                }
            } 
        } else { // Turno negro
            while (aux != null) {
                
                // Primero ocupamos ubicarnos en una casilla vacía
                if (aux.getState().getColor() == 'v') {
                    boolean isValidCell = false;

                    // Buscamos una ficha enemiga adyacente a la casilla vacía
                    if (aux.getNorth() != null &&
                            aux.getNorth().getState().getColor() == 'b') {
                        if (northTraversal(aux, player)) isValidCell = true;
                    } 
                    if (aux.getSouth() != null &&
                            aux.getSouth().getState().getColor() == 'b') {
                        if (southTraversal(aux, player)) isValidCell = true;
                    }
                    if (aux.getEast() != null && 
                            aux.getEast().getState().getColor() == 'b') {
                        if (eastTraversal(aux, player)) isValidCell = true;
                    }
                    if (aux.getWest() != null &&
                            aux.getWest().getState().getColor() == 'b') {
                        if (westTraversal(aux, player)) isValidCell = true;
                    }
                    if (aux.getNortheast() != null && 
                            aux.getNortheast().getState().getColor() == 'b') {
                        if (northeastTraversal(aux, player)) isValidCell = true;
                    }
                    if (aux.getNorthwest() != null &&
                            aux.getNorthwest().getState().getColor() == 'b') {
                        if (northewestTraversal(aux, player)) isValidCell = true;
                    }
                    if (aux.getSoutheast() != null &&
                            aux.getSoutheast().getState().getColor() == 'b') {
                        if (southeastTraversal(aux, player)) isValidCell = true;
                    }
                    if (aux.getSouthwest() != null && 
                            aux.getSouthwest().getState().getColor() == 'b') {
                        if (southwestTraversal(aux, player)) isValidCell = true;
                    }
                    
                    /* Si hay al menos una direción que termine en jugada válida,
                    la casilla actual pasa a ser una casilla válida para colocar ficha*/
                    if (isValidCell) aux.getState().setColor('?');
                }
                aux = aux.getEast();

                if (aux == null) {
                    first = first.getSouth();
                    aux = first;
                }
            }
        }
    }
    
}

