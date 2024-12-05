package ca.sheridancollege.project;

import ca.sheridancollege.project.Card;

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
        // throw new UnsupportedOperationException("Not supported yet."); // Generated
        // from
        // nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        return "";
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