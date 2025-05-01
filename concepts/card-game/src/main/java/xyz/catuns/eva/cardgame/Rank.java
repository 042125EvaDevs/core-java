package xyz.catuns.eva.cardgame;

public class Rank {

    private final String name;

    public Rank(String name) {
        this.name = name;
    }

    public static Rank[] createDefaults() {
        return new Rank[] {
                new Rank("ace"),
                new Rank("two"),
                new Rank("three"),
                new Rank("four"),
                new Rank("five"),
                new Rank("six"),
                new Rank("seven"),
                new Rank("eight"),
                new Rank("nine"),
                new Rank("ten"),
                new Rank("jack"),
                new Rank("queen"),
                new Rank("king")
        };
    }

    public String getName() {
        return name;
    }
}
