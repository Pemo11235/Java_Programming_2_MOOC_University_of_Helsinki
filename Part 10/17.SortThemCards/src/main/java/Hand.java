
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author matte
 */
public class Hand implements Comparable<Hand> {

    private List<Card> hand;

    public Hand() {
        this.hand = new ArrayList<>();
    }

    public void add(Card card) {
        hand.add(card);
    }

    public void print() {
        hand.stream().forEach(card -> System.out.println(card));
    }

    public void sort() {
        Collections.sort(hand);
    }

    public int sumValues() {
        int sum = 0;
        for (Card card : this.hand) {
            sum = sum + card.getValue();
        }
        return sum;
    }

    public int numCards() {
        return this.hand.size();
    }

    @Override
    public int compareTo(Hand h) {
        int val = this.sumValues() - h.sumValues();

        return val ;
    }

    public void sortBySuit() {
        Collections.sort(this.hand, new BySuitInValueOrder());
    }
}
