
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

        int count_1 = 0;
        int count_2 = 0;
        int count_3 = 0;
        int count_4 = 0;
        int count_5 = 0;
        int count_6 = 0;
        int count_7 = 0;
        int count_8 = 0;
        int count_9 = 0;
        int count_10 = 0;

        int count_king = 0;
        int count_queen = 0;
        int count_ace = 0;
        int count_jack = 0;

        int count_spades = 0;
        int count_hearts = 0;
        int count_diamonds = 0;
        int count_clubs = 0;

        List<GoFishCard> cardsInHand = this.hand.getCards();
        Map<Integer, Integer> countList = new HashMap<Integer, Integer>();

        for (int x = 0; x < cardsInHand.size(); x++) {
        }

        for (int x = 0; x < cardsInHand.size(); x++) {
            countList.put(x, 0);
            String temp = cardsInHand.get(x).toString();
            String[] tempNum = temp.split(" ");

            switch (tempNum[0]) {
                case "Ace":
                    count_ace += 1;
                    break;
                case "2":
                    count_2 += 1;
                    break;
                case "3":
                    count_3 += 1;
                    break;
                case "4":
                    count_4 += 1;
                    break;
                case "5":
                    count_5 += 1;
                    break;
                case "6":
                    count_6 += 1;
                    break;
                case "7":
                    count_7 += 1;
                    break;
                case "8":
                    count_8 += 1;
                    break;
                case "9":
                    count_9 += 1;
                    break;
                case "10":
                    count_10 += 1;
                    break;
                case "Jack":
                    count_jack += 1;
                    break;
                case "Queen":
                    count_queen += 1;
                    break;
                case "king":
                    count_king += 1;
                    break;

            }

            switch (tempNum[1]) {
                case "Spades":
                    count_spades += 1;
                    break;
                case "Diamonds":
                    count_diamonds += 1;
                    break;
                case "Hearts":
                    count_hearts += 1;
                    break;
                case "Clubs":
                    count_clubs += 1;
                    break;
            }

            // check if each count has more than 4 
            countList.add(count_ace);
            countList.add(count_2);
            countList.add(count_3);
            countList.add(count_4);
            countList.add(count_5);
            countList.add(count_6);
            countList.add(count_7);
            countList.add(count_8);
            countList.add(count_9);
            countList.add(count_10);
            countList.add(count_jack);
            countList.add(count_queen);
            countList.add(count_king);
            countList.add(count_diamonds);
            countList.add(count_spades);
            countList.add(count_clubs);
            countList.add(count_hearts);


            for 

        }
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