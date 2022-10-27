package blackjack;

public class BlackJackMain {
    public static void main(String[] args) {
        Deck deck = new Deck();

        int player = 0;
        int casino = 0;

        while (player <= 21 && casino <= 21) {
            Card playerCard = deck.nextCard();
            Card casinoCard = deck.nextCard();

            player += score(playerCard);
            casino += score(casinoCard);
        }

        System.out.printf("Player: %s, Casino: %s ", player, casino);
        System.out.println();
        if (player > casino && player <= 21) {
            System.out.println("Player win!");
        }
        if (player < casino && casino <= 21) {
            System.out.println("Casino win!");
        } else {
            System.out.println("Draw");
        }
    }

    private static int score(Card card) {
        return switch (card.getRank()) {
            case RANK_2 -> 2;
            case RANK_3 -> 3;
            case RANK_4 -> 4;
            case RANK_5 -> 5;
            case RANK_6 -> 6;
            case RANK_7 -> 7;
            case RANK_8 -> 8;
            case RANK_9 -> 9;
            case RANK_10, JACK, QUEEN, KING -> 10;
            case ACE -> 11;
        };
    }
}
