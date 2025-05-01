package xyz.catuns.eva.cardgame;

import java.util.ArrayList;

public class Deck{
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


    /**
     * Todo: find card by rank and suit name
     * @param rankName
     * @param suitName
     */
    public void removeCard(String rankName, String suitName) {
    }
}
