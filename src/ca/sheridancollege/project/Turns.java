/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca.sheridancollege.project;

import java.util.List;

/**
 *
 * @author myame
 */
public class Turns {
    private Player currentPlayer; 
    private List<Player> players; 

    public Turns(List<Player> players) {
        this.players = players;
        this.currentPlayer = players.get(0); 
    }

    public Player getCurrentPlayer() {
        return currentPlayer;
    }

    public void nextTurn() {
        int currentIndex = players.indexOf(currentPlayer);
        int nextIndex = (currentIndex + 1) % players.size();
        this.currentPlayer = players.get(nextIndex);
    }
}
