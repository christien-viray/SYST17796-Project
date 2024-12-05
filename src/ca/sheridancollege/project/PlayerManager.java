package ca.sheridancollege.project;

import java.util.ArrayList;
import java.util.List;

public class PlayerManager {
    private List<Player> players;
    private Game game;  // Composition relationship with Game, Game must exist for PlayerManager to exist.

    public PlayerManager(Game game) {
        this.game = game;
        this.players = new ArrayList<>();
    }

    // Method to add a player to the game
    public void addPlayer(Player player) {
        players.add(player);
    }

    // Method to remove a player from the game
    public void removePlayer(Player player) {
        players.remove(player);
    }

    public List<Player> getPlayers() {
        return players;
    }
}
