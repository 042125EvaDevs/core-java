package xyz.catuns.eva.cardgame.prompt;

import java.util.Scanner;

public class ScannerSingleton {

  private static Scanner INSTANCE = null;

  public static Scanner getInstance() {
    if (INSTANCE == null) {
      INSTANCE = new Scanner(System.in);
    }

    return INSTANCE;
  }
}
