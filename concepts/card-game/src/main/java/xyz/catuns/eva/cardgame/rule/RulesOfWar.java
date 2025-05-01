package xyz.catuns.eva.cardgame.rule;

import xyz.catuns.eva.cardgame.Deck;

public class RulesOfWar implements Rule {

  public void shuffle(Deck deck){

  }

  @Override
  public int getMaxPlayers() {
    return 2;
  }
}
