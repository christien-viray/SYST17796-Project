
package ca.sheridancollege.project;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GoFishGame extends Game {

    public static void main(String[] args) {

        // begin
        Scanner scan = new Scanner(System.in);

        String playerOneName, playerTwoName;

        System.out.println("Player one name: ");
        playerOneName = scan.next();

        System.out.println("Player two name: ");
        playerTwoName = scan.next();

        GoFishPlayer player1 = new GoFishPlayer(playerOneName);
        GoFishPlayer player2 = new GoFishPlayer(playerTwoName);

        GoFishGame game = new GoFishGame("Go Fish!");

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