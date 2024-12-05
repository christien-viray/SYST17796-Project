
package ca.sheridancollege.project;

import ca.sheridancollege.project.Hand;
import ca.sheridancollege.project.Player;
import ca.sheridancollege.project.GoFishDeck;

/**
 * @author Elliot Currie
 *
 *
 */

public class GoFishPlayer {

    private Hand hand;
    private String name;

    public GoFishPlayer(String name) {
        this.name = name;
    }

    public boolean askForCard(Player otherPlayer, String rank) {
        // TODO: implement
    }

    public void goFish(GoFishDeck deck) {
        // TODO: implement
    }

    public boolean checkForSelf() {
        // TODO: implement
    }

    public Hand getHand() {
        return this.hand;
    }

}