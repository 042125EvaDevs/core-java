package xyz.catuns.eva.cardgame.prompt;

public class Prompter {

  public String prompt(String question) {

    System.out.println(question);

    String answer = ScannerSingleton.getInstance().next();

    /**
     * validation checks can be done here
     */
    return answer;
  }


}
