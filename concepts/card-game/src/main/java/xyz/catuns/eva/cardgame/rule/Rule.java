package xyz.catuns.eva.cardgame.rule;


public interface Rule {

  default int getMaxPlayers() {
    return 1;
  }
}
