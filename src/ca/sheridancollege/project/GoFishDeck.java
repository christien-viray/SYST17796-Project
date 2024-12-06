/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca.sheridancollege.project;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import ca.sheridancollege.project.GoFishPlayer;

/**
 *
 * @author Christien
 */
public class GoFishDeck extends GroupOfCards {

    public GoFishDeck(int size) {
        super(size);
        this.cards = new ArrayList<>(size);
        String[] suits = {
                "Hearts",
                "Diamonds",
                "Clubs",
                "Spades"
        };
        String[] ranks = {
                "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"
        };
        for (String suit : suits) {
            for (String rank : ranks) {
                this.cards.add(new GoFishCard(rank, suit));
            }
        }
        shuffle();
    }

    public void deal(List<GoFishPlayer> players) {

        int playerIndex = 0;
        // while (!this.getCards().isEmpty()) {
        // Card card = this.getCards().remove(this.getCards().size() - 1);
        // ((GoFishPlayer) players.get(playerIndex)).getHand().drawCard(card);
        // playerIndex = (playerIndex + 1) % players.size();
        // }

        final int playerCardAmount = 5;
        int cardsToBeDelt = 5 * players.size();

        Random rand = new Random();

        for (int x = 0; x < cardsToBeDelt; x++) {
            int randIndex = rand.nextInt(this.cards.size());

            players.get(playerIndex).getHand().drawCard(this.cards.get(randIndex));

            if (playerIndex + 1 == players.size())
                playerIndex = 0;
            else
                playerIndex++;

        }

        // deals 5 cards to each

    }
}
