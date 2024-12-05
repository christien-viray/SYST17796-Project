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
    private Game game;  // Composition relationship with Game
    private int currentPlayerIndex;
    private Player currentPlayer; 
    private List<Player> players; 

    public Turns(List<Player> players) {
        this.game = game;
        this.currentPlayerIndex = 0; // The first player starts the game
        this.players = players;
        this.currentPlayer = players.get(0); 

    }

    public Player getCurrentPlayer() {
        return game.getPlayerManager().getPlayers().get(currentPlayerIndex);
        return currentPlayer;
    }

    public void nextTurn() {
        int currentIndex = players.indexOf(currentPlayer);
        int nextIndex = (currentIndex + 1) % players.size();
        this.currentPlayer = players.get(nextIndex);
        int playerCount = game.getPlayerManager().getPlayers().size();
        if (playerCount > 0) {
            currentPlayerIndex = (currentPlayerIndex + 1) % playerCount;
            // Logic to notify the next player that it's their turn could be added here.

    }
}
