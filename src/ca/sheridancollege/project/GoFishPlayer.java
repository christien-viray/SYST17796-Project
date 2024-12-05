
package ca.sheridancollege.project;

import ca.sheridancollege.project.Hand;
import ca.sheridancollege.project.Player;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import ca.sheridancollege.project.GoFishDeck;

/**
 * @author Elliot Currie
 *
 *
 */

public class GoFishPlayer extends Player {

    private Hand hand;

    public GoFishPlayer(String name) {
        super(name);
        this.hand= new Hand();
    }

    public boolean askForCard(GoFishPlayer otherPlayer, String rank, String suit) {

        // temp card for comparison

        GoFishCard tempcard = new GoFishCard(suit, rank);

        // other player has requested card
        if (otherPlayer.getHand().getCards().contains(tempcard)) {
            // System.out.println(otherPlayer.getName() + " Has the " + rank + " of " +
            // suit);
            return true;
        }
        return false;
    }

    public void goFish(GoFishDeck deck) {
        // TODO: implement
    }

    // checks if set of 4 cards exist in deck
    public boolean checkForSet() {

        List<GoFishCard> currentCards = this.hand.getCards();
        Map<String, Integer> duplicateTracker = new HashMap<String, Integer>();

    String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
    for (String rank : ranks) {
        duplicateTracker.put(rank, 0);
    }

    for (GoFishCard card : currentCards) {
        String rank = card.getRank();
        duplicateTracker.put(rank, duplicateTracker.get(rank) + 1);
    }

    for (int count : duplicateTracker.values()) {
        if (count == 4) {
            return true;
        }
    }

    return false;

    }

    public Hand getHand() {
        return this.hand;
    }

    @Override
    public void play() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'play'");
    }

}