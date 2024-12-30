package Enum.cardGame;
public class Card {
//    Twenty Plus One
//    Create the beloved Twenty Plus One game!
//    Create a Card, a Deck, and a Game class
//    The Card class has 3 enum properties:
//    One for the color(red, black)
//    One for the suit(clubs, diamonds, hearts, spades)
//    One for the rank(2, 3, 4, 5, 6, 7, 8, 9, 10, J, Q, K, A)
//    The Deck class holds the instances of the Card classes
//     Create methods for the class
//    ShuffleDeck, PullFirst, PullLast, PullRandom
//    The Game class is responsible to the game itself
//    It should have a method that generates a random number between 15 and 21, which will be the opponents score
//    It should ask the player to continue or to stop drawing cards
//    The game is lost, if the sum of the pulled cards are above 21 or below the random number
public enum cardColors{
    RED, BLACK
}

public enum suit {
    CLUBS, DIAMONDS, HEARTS, SPADES
}
    public enum rank {
        TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, J, Q, K, A
    }


    private final cardColors color;
    private final suit suit;
    private final rank rank;


    public Card(cardColors color, Card.suit suit, Card.rank rank) {
        this.color = color;
        this.suit = suit;
        this.rank = rank;
    }

    @Override
    public String toString() {
        return "Card{" +
                "color=" + color +
                ", suit=" + suit +
                ", rank=" + rank +
                '}';
    }

    public int getValue() {
        switch (rank) {
            case TWO:
                return 2;
            case THREE:
                return 3;
            case FOUR:
                return 4;
            case FIVE:
                return 5;
            case SIX:
                return 6;
            case SEVEN:
                return 7;
            case EIGHT:
                return 8;
            case NINE:
                return 9;
            case TEN:
                return 10;
            case J:
                return 10;
            case Q:
                return 10;
            case K:
                return 10;
            case A:
                return 11;
            default:
                return 0;
        }


    }
}