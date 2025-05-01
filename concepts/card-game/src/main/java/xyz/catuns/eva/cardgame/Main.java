package xyz.catuns.eva.cardgame;

public class Main {


    public static void main(String[] args) {


        Game game = new WarGame();

        game.setup();

        game.start();

        while(game.isRunning()) {
            game.nextTurn();
        }


        game.showResult();
        /**
         * Card class with properties for
         * `Suit` and `Rank`
         *
         */


//        Suit spade = new Suit("spade", "black");
//        Suit heart = new Suit("heart", "red");
//        Rank ace = new Rank("ace");
//        Rank two = new Rank("two");
//


//        CardClassObject aceOfSpades = new CardClassObject(, Rank.ACE);
//        Card twoOfHearts = new Card(heart, two);


        // Prints `Ace of spades`
//        aceOfSpades.showDetails();

         /**
         *
         * 2. Create a `Deck` of `Cards` with the necessary
         *  `Suit` and `Rank`
         *
         */

//         Deck deck = new Deck();


        /**
         *
         * Display the details about each `Card`
         * in the deck
         */


//        ArrayList<Card> cards = deck.getCards();

        /**
         *
         * Remove cards from the Deck
         */

//        deck.removeCard(aceOfSpades);

//        deck.removeCard("two", "heart");


    }
}
