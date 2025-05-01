package xyz.catuns.eva.cardgame;

import xyz.catuns.eva.cardgame.rule.RulesOfWar;

public class WarGame extends Game {



  public WarGame() {
    this.rule = new RulesOfWar();

    /**
     * Creates the array of players.
     * Sets the max players based on the`RulesOfWar` maximum players
     *
     * Ensures that we do not have too many players
     */
    this.players = new Player[this.rule.getMaxPlayers()];
  }

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

      this.running = false;
    }

  @Override
  public void showResult() {

  }

}
