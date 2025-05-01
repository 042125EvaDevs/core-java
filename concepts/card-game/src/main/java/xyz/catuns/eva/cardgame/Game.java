package xyz.catuns.eva.cardgame;

import xyz.catuns.eva.cardgame.card.Card;
import xyz.catuns.eva.cardgame.card.Rank;
import xyz.catuns.eva.cardgame.card.Suit;
import xyz.catuns.eva.cardgame.rule.Rule;

import java.util.Arrays;

public abstract class Game {

    protected final Deck deck;
    protected Rule rule;
    protected Player[] players;

    protected boolean running;

    public Game(Deck deck) {
        this.deck = deck;
    }

    public Game() {
        this.deck = new Deck();
    }

    public abstract void nextTurn();
    public abstract void showResult();

    protected void createDeck() {
      Arrays.stream(Suit.values()).forEach((suit) -> {
        // enhanced for loop
        for (Rank rank : Rank.values()) {
          this.deck.addCard(new Card(suit, rank));
        }
      });
    }

    public void setup() {
        System.out.println("Setting up deck");
        this.createDeck();

        /**
         * - Prompt for player info
         * - Make sure number of players doesn't exceed MAX_PLAYERS
         * - shuffle cards
         * - deal cards
         * -
         */

        promptPlayerInfo();


    }

  private void promptPlayerInfo() {
    /**
     *
     */
  }

  public final void start() {
        System.out.println("Starting game");
        this.running = true;
    };

    public boolean isRunning() {
        return this.running;
    }
}
