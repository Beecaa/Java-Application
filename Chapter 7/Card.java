public class Card {
    private final String face; // e.g., "Ace", "2", ..., "King"
    private final String suit; // e.g., "Hearts", "Diamonds", etc.

    public Card(String face, String suit) {
        this.face = face;
        this.suit = suit;
    }

    public String getFace() {
        return face;
    }

    public String getSuit() {
        return suit;
    }

    @Override
    public String toString() {
        return face + " of " + suit;
    }
}
