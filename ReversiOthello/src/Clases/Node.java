/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author Axton Urbina
 */
public class Node {
    private Node north;
    private Node south;
    private Node east;
    private Node west;
    private Node northeast;
    private Node northwest;
    private Node southeast;
    private Node southwest;
    Node next;
    private Token token; // Ocupación de la casilla en el tablero: ocupada (con ficha) o desocupada (sin ficha)

    // Constructor que cuando se llama inicializa todo en nulo
    public Node(char token) {
        this.north = null;
        this.east = null;
        this.south = null;
        this.west = null;
        this.northeast = null;
        this.northwest = null;
        this.southeast = null;
        this.southwest = null;
        this.token = new Token(token);
    }
    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
    // Setters y Getters
    public Node getNorth() {
        return north;
    }

    public void setNorth(Node north) {
        this.north = north;
    }

    public Node getSouth() {
        return south;
    }

    public void setSouth(Node south) {
        this.south = south;
    }

    public Node getEast() {
        return east;
    }

    public void setEast(Node east) {
        this.east = east;
    }

    public Node getWest() {
        return west;
    }

    public void setWest(Node west) {
        this.west = west;
    }

    public Node getNortheast() {
        return northeast;
    }

    public void setNortheast(Node northeast) {
        this.northeast = northeast;
    }

    public Node getNorthwest() {
        return northwest;
    }

    public void setNorthwest(Node northwest) {
        this.northwest = northwest;
    }

    public Node getSoutheast() {
        return southeast;
    }

    public void setSoutheast(Node southeast) {
        this.southeast = southeast;
    }

    public Node getSouthwest() {
        return southwest;
    }

    public void setSouthwest(Node southwest) {
        this.southwest = southwest;
    }

    public Token getToken() {
        return token;
    }

    public void setToken(Token state) {
        this.token = state;
    }

    // ToString
    @Override
    public String toString() {
        return "Node{" + "north=" + north + ", south=" + south + ", east=" + east + ", west=" + west + ", northeast=" + northeast + ", northwest=" + northwest + ", southeast=" + southeast + ", southwest=" + southwest + ", state=" + token + '}';
    }
    
}
