public class Cards {

    public enum Face {
        ACE, DEUCE, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING
    }

    public enum Suit {
        CLUBS, DIAMONDS, HEARTS, SPADES
    }

    private final Face face;
    private final Suit suit;

    public Cards(Face face, Suit suit) {
        this.face = face;
        this.suit = suit;
    }

    public Face getFace() {
        return face;
    }

    public Suit getSuit() {
        return suit;
    }

    public String toString() {
        return String.format("%s of %s", face, suit);
    }
}