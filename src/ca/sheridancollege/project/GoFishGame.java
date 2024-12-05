
package ca.sheridancollege.project;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GoFishGame extends Game {

    public static void main(String[] args) {

        // begin
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the number of players: ");
        int numPlayers = scan.nextInt();
        scan.nextLine(); // Consume newline

        List<GoFishPlayer> players = new ArrayList<>();
        for (int i = 1; i <= numPlayers; i++) {
            System.out.println("Player " + i + " name: ");
            String playerName = scan.nextLine();
            players.add(new GoFishPlayer(playerName));
        }

        GoFishGame game = new GoFishGame("Go Fish!");
        game.setPlayers(new ArrayList<>(players));
        game.play();
    }

    public GoFishGame(String name) {
        super(name);
    }

    @Override
    public void play() {

        // begin
        Scanner scan = new Scanner(System.in);

        String playerOneName, playerTwoName;

        System.out.println("Player one name: ");
        playerOneName = scan.next();

        System.out.println("Player two name: ");
        playerTwoName = scan.next();

        GoFishPlayer player1 = new GoFishPlayer(playerOneName);
        GoFishPlayer player2 = new GoFishPlayer(playerTwoName);
        List<Player> playerList = new ArrayList<Player>();
        playerList.add(player1);
        playerList.add(player2);

        GoFishDeck deck = new GoFishDeck(50);
        deck.deal(playerList);

        // game loop
        while (true) {

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