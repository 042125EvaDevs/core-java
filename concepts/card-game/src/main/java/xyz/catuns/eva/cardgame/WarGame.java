package xyz.catuns.eva.cardgame;

public class WarGame extends Game {


    @Override
    public void nextTurn() {

    }

    @Override
    public void showResult() {

    }

    @Override
    public void createDeck() {

        Suit[] suits = Suit.createDefaults();
        Rank[] ranks = Rank.createDefaults();

        for (int index = 0; index < suits.length; index++) {
            Suit suit = suits[index];
            for (Rank rank : ranks) {
                this.deck.addCard(new Card(suit, rank));
            }
        }
    }
}
