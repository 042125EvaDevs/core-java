package xyz.catuns.eva.cardgame;

import xyz.catuns.eva.cardgame.rules.Rule;

public abstract class Game {

    protected final Deck deck;
    protected Rule rule;
    protected boolean running;

    public Game(Deck deck) {
        this.deck = deck;
    }

    public Game() {
        this.deck = new Deck();
    }

    public abstract void nextTurn();
    public abstract void showResult();
    public abstract void createDeck(); // this can be protected/ No usecase outside of the child class

    public void setup() {
        System.out.println("Setting up deck");
        this.createDeck();

    }

    public final void start() {
        System.out.println("Starting game");
        this.running = true;
    };

    public boolean isRunning() {
        return this.running;
    }
}
