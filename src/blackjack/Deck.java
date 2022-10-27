package blackjack;

public class Deck {
    private final Card[] cards = new Card[52];

    public Deck() {
        int i = 0;
        for (Suit suit : Suit.values()) {
            for (Rank rank : Rank.values()) {
                cards[i++] = new Card(rank, suit);
            }
        }
    }

    public Card nextCard() {
        return cards[(int) (Math.random() * 52)];
    }
}
