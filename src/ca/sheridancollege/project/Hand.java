/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca.sheridancollege.project;

import java.util.List;
import java.util.ArrayList;
import ca.sheridancollege.project.GoFishPlayer;
import ca.sheridancollege.project.GoFishCard;

/**
 *
 * @author Christien
 */
public class Hand {
    private List<GoFishCard> cards;

    public Hand() {
        this.cards = new ArrayList<GoFishCard>();
    }

    public void drawCard(Card card) {
        cards.add((GoFishCard) card);
    }

    public void giveCard(Player fromPlayer, Player toPlayer, Card card) {
        if (cards.remove(card)) {
            ((GoFishPlayer) toPlayer).getHand().drawCard(card);
        }
    }

    public boolean removeSet(String rank) {
        List<Card> toRemove = new ArrayList<>();
        for (Card card : cards) {
            if (((GoFishCard) card).getRank().equals(rank)) {
                toRemove.add(card);
            }
        }
        if (toRemove.size() == 4) {
            cards.removeAll(toRemove);
            return true;
        }
        return false;
    }

    public List<GoFishCard> getCards() {
        return new ArrayList<GoFishCard>(cards);
    }
}
