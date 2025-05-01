package xyz.catuns.eva.cardgame;

public class Suit {

    private final String name;
    private final String color;

    public Suit (String name, String color){
        this.name = name;
        this.color = color;
    }

    public String getName(){
        return name;
    };

    public String getColor(){
        return color;
    }


    public static Suit[] createDefaults() {
        return new Suit[] {
                new Suit("spade", "black"),
                new Suit("club", "black"),
                new Suit("heart", "red"),
                new Suit("diamond", "red")
        };
    }

}
