
package ca.sheridancollege.project;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author Christian Viray
 * @author Elliot Currie
 */

public class GoFishGame extends Game {

    private List<Player> players;

    public static void main(String[] args) {

        // begin
        Scanner scan = new Scanner(System.in);
        GoFishGame game = new GoFishGame("Go Fish!");

        System.out.println("Enter the number of players: ");
        int numPlayers = scan.nextInt();
        scan.nextLine(); // Consume newline

        game.players = new ArrayList<>();

        for (int i = 1; i <= numPlayers; i++) {
            System.out.println("Player " + i + " name: ");
            String playerName = scan.nextLine();
            game.players.add(new GoFishPlayer(playerName));
        }

        game.setPlayers(new ArrayList<>(game.players));
        game.play();
    }

    public GoFishGame(String name) {
        super(name);
    }

    @Override
    public void play() {

        // begin
        // Scanner scan = new Scanner(System.in);

        // String playerOneName, playerTwoName;

        // System.out.println("Player one name: ");
        // playerOneName = scan.next();

        // System.out.println("Player two name: ");
        // playerTwoName = scan.next();

        List<GoFishPlayer> castedPlayers = new ArrayList<GoFishPlayer>();
        Scanner scan = new Scanner(System.in);

        // iterates over list of player objects and casts them to child
        for (Player p : this.players) {
            castedPlayers.add((GoFishPlayer) p);
        }

        GoFishDeck deck = new GoFishDeck(50);
        deck.deal(this.players);

        // game loop
        while (true) {
            // shows cards
            castedPlayers.get(0).printCurrentHand();
            System.out.println("What card would you like to ask for: ");
            String rank = scan.nextLine();

            castedPlayers.get(0).askForCard(castedPlayers.get(1), rank);

        }

    }

    @Override
    public void declareWinner() {

    }

    public boolean isValidInput(String input) {
        boolean returnVal = false;

        String[] suits = { "spades", "clubs", "hearts", "diamonds" };
        String[] ranks = {
                "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"
        };

        for (String a : suits) {
            if (input.contains(a))
                returnVal = true;
        }

        for (String a : ranks) {
            if (input.contains(a))
                returnVal = true;
        }

        return returnVal;

    }

}