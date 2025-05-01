package xyz.catuns.eva.cardgame;

import xyz.catuns.eva.cardgame.card.Card;

import java.util.ArrayList;

public class Deck {

    /**
     * Requirements:
     *
     * - We need the deck to contain a list of cards
     * - We need to add and remove `Cards` from the `Deck`
     */

    /**
     * A deck can only have 52 cards
     */
    private final ArrayList<Card> cards = new ArrayList<>(52);


    public Deck(){

    }

    public void addCard(Card card){
        this.cards.add(card);
    }

    public void removeCard(Card card){
        this.cards.remove(card);
    }

    public void shuffle() {
      throw new RuntimeException("Deck.shuffle() Not implemented");
    }
}
