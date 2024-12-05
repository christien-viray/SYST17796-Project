
package ca.sheridancollege.project;

import ca.sheridancollege.project.Hand;
import ca.sheridancollege.project.Player;

import java.util.List;

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
        // TODO: implement

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