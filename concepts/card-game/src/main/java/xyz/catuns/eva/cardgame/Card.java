package xyz.catuns.eva.cardgame;

public class Card {


    /**
     * Requirements:
     * <p>
     * - We need a property for `Suit` and Rank
     * - These values will not change
     * (otherwise  we will create a new Card)
     */

    private final Suit suit;
    private final Rank rank;

    public Card(Suit updatedSuit, Rank updatedRank) {
        this.suit = updatedSuit;
        this.rank = updatedRank;

    }


    /**
     * Todo: use `toString()`
     */
    public void showDetails(){

        System.out.println(rank.getName()+" of "+suit.getName());
    }

}
