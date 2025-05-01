package xyz.catuns.eva.cardgame;

public enum Rank {
  ACE("ace", 0),
  TWO("two", 1),
  THREE("three", 2),
  FOUR("four", 3),
  FIVE("five", 4),
  SIX("six", 5),
  SEVEN("seven", 6),
  EIGHT("eight", 7),
  NINE("nine", 8),
  TEN("ten", 9),
  JACK("jack", 10),
  QUEEN("queen", 11),
  KING("king", 12);

  private final String name;
  private final int value;

  Rank(String name, int value) {
    this.name = name;
    this.value = value;
  }

  public String getName() {
    return this.name;
  }




}
