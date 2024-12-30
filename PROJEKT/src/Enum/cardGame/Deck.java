package Enum.cardGame;

import java.util.ArrayList;
import java.util.List;

public class Deck {
    private final List<Card> deckOfCards = new ArrayList<>();

    public void fillDeck() {
        Card.cardColors[] colors = Card.cardColors.values();
        Card.suit[] suits = Card.suit.values();
        Card.rank[] ranks = Card.rank.values();

        for (int i = 0; i < colors.length; i++) {
            for (int j = 0; j < suits.length; j++) {
                for (int k = 0; k < ranks.length; k++) {
                    deckOfCards.add(new Card(colors[i], suits[j], ranks[k]));
                }
            }
        }
    }

}
