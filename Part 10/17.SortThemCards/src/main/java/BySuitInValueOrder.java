

import java.util.Comparator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author matte
 */
public class BySuitInValueOrder implements Comparator<Card>{

    @Override
    public int compare(Card c1, Card c2) {
        int valCard = 0;
        int valSuit = c1.getSuit().ordinal() - c2.getSuit().ordinal();
        if(valSuit == 0){
            valCard = c1.getValue() - c2.getValue();
        }
        return valSuit+valCard;
    }
    
}
