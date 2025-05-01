package xyz.catuns.eva.cardgame.card;

public enum Suit {
    SPADE("spade", "black"),
    CLUB("club", "black"),
    HEART("heart", "red"),
    DIAMOND("diamond", "red");


    private final String name;
    private final String color;

    Suit (String name, String color){
        this.name = name;
        this.color = color;
    }

    public String getName(){
        return name;
    };

    public String getColor(){
        return color;
    }


}
