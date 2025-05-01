package xyz.catuns.eva.cardgame;

import xyz.catuns.eva.cardgame.rules.Rule;

import java.util.Arrays;

public class WarGame extends Game {

    Rule rule;

    @Override
    public void nextTurn() {
      System.out.println("Doing next turn");

      /**
       * Requirements:
       * - 2 players
       * - half the deck split between players
       * - deck should be shuffled
       * -
       */

//      rule.shuffle()

    }

    @Override
    public void showResult() {

    }

    @Override
    public void createDeck() {

      Arrays.stream(Suit.values()).forEach((suit) -> {
          // enhanced for loop
          for (Rank rank : Rank.values()) {
              this.deck.addCard(new Card(suit, rank));
          }
      });
    }
}
