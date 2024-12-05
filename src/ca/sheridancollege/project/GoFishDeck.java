/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca.sheridancollege.project;

import java.util.ArrayList;
import java.util.List;
import ca.sheridancollege.project.GoFishPlayer;
/**
 *
 * @author Christien
 */
public class GoFishDeck extends GroupOfCards {
    
    public GoFishDeck (int size){
        super(size);
        this.cards=new ArrayList<>(size);
        String[] suits={
            "Hearts",
            "Diamonds",
            "Clubs",
            "Spades"
        };
        String[] ranks = {
            "Ace","2","3","4","5","6","7","8","9","10","Jack","Queen","King"
        };
        for (String suit : suits){
            for(String rank : ranks){
                this.cards.add(new GoFishCard(rank,suit));
            }
        }
        shuffle();
    }
    
    public void deal(List<Player> players){
        int playerIndex=0;
        while(!this.getCards().isEmpty()){
            Card card = this.getCards().remove(this.getCards().size()-1);
            ((GoFishPlayer) players.get(playerIndex)).getHand().drawCard(card);
            playerIndex=(playerIndex+1) % players.size();
        }
    }
}
