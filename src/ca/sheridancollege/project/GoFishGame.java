
package ca.sheridancollege.project;

public class GoFishGame extends Game {
    
    public static void main(String[] args) {
        
    }
    
    
    public GoFishGame(String name) {
        super(name);
    }                                                                                                                                                                                                                                                                                                              
    
    @Override
    public void play() {
        
    }
    
    @Override
    public void declareWinner() {
        
    }
    
    // TODO: Still to be implemented
    public boolean isValidInput(String input) {
        boolean returnVal = false;
        
        String[] suits = {"spades", "clubs", "hearts", "diamonds"};
        String[] nums = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
        String[] honor = {"jack", "queen", "king", "ace"};
        
        for (String a : suits) {
            if (input.contains(a))
                returnVal = true;
        }
        
        for (String a : nums) {
            if (input.contains(a))
                returnVal = true;
        }
        
        for (String a : honor) {
            if (input.contains(a))
                returnVal = true;
        }
        
        return returnVal;
        
    }
    
}