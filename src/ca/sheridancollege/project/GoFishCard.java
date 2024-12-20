package ca.sheridancollege.project;

import ca.sheridancollege.project.Card;

/**
 * @author Elliot Currie
 */

public class GoFishCard extends Card {

    private boolean isRequested;
    private String suit;
    private String rank;

    // no empty constructor because card must have a suit and rank
    public GoFishCard(String suit, String rank) {
        // add validation?
        this.suit = suit;
        this.rank = rank;
    }

    @Override
    public String toString() {
        return this.suit + " of " + this.rank;
    }

    public void markAsRequetsed() {
        this.isRequested = true;
    }

    public void resetRequestedStatus() {
        this.isRequested = false;
    }

    public boolean isRequested() {
        return this.isRequested;
    }

    public String getSuit() {
        return this.suit;
    }

    public String getRank() {
        return this.rank;
    }

}