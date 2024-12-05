
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

        duplicateTracker.put("Ace", 0);
        duplicateTracker.put("2", 0);
        duplicateTracker.put("3", 0);
        duplicateTracker.put("4", 0);
        duplicateTracker.put("5", 0);
        duplicateTracker.put("6", 0);
        duplicateTracker.put("7", 0);
        duplicateTracker.put("8", 0);
        duplicateTracker.put("9", 0);
        duplicateTracker.put("10", 0);
        duplicateTracker.put("King", 0);
        duplicateTracker.put("Queen", 0);
        duplicateTracker.put("Jack", 0);
        duplicateTracker.put("Hearts", 0);
        duplicateTracker.put("Diamonds", 0);
        duplicateTracker.put("Spades", 0);
        duplicateTracker.put("Clubs", 0);

        // iteration over cards in hand
        for (int x = 0; x < currentCards.size(); x++) {
            String[] splitTemp = currentCards.get(x).toString().split(" ");
            String rankTemp = splitTemp[0];
            String suitTemp = splitTemp[1];

            int prevCountRank = duplicateTracker.get(rankTemp);
            int prevCountSuit = duplicateTracker.get(suitTemp);

            duplicateTracker.remove(rankTemp);
            duplicateTracker.remove(suitTemp);

            duplicateTracker.put(rankTemp, prevCountRank + 1);
            duplicateTracker.put(suitTemp, prevCountSuit + 1);

        }

        // iterating over values in hashmap
        if ()

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