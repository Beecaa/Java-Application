import java.util.Random;

public class DeckOfCards {
    private static final String[] faces = 
        {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
    private static final String[] suits = 
        {"Hearts", "Diamonds", "Clubs", "Spades"};
    
    private final Card[] deck; // Array to store the cards
    private int currentCard; 
    private final Random random;

    public DeckOfCards() {
        deck = new Card[52];
        int index = 0;
        for (String suit : suits) {
            for (String face : faces) {
                deck[index++] = new Card(face, suit);
            }
        }
        random = new Random();
        shuffle(); // Shuffle the deck upon initialization
    }

    public void shuffle() {
        for (int i = 0; i < deck.length; i++) {
            int randomIndex = random.nextInt(deck.length);
            Card temp = deck[i];
            deck[i] = deck[randomIndex];
            deck[randomIndex] = temp;
        }
        currentCard = 0;
    }

    public Card dealCard() {
        return (currentCard < deck.length) ? deck[currentCard++] : null;
    }

    public Card[] dealHand(int handSize) {
        Card[] hand = new Card[handSize];
        for (int i = 0; i < handSize; i++) {
            hand[i] = dealCard();
        }
        return hand;
    }

    public boolean hasPair(Card[] hand) {
        for (int i = 0; i < hand.length; i++) {
            for (int j = i + 1; j < hand.length; j++) {
                if (hand[i].getFace().equals(hand[j].getFace())) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean hasTwoPairs(Card[] hand) {
        int pairCount = 0;
        for (int i = 0; i < hand.length; i++) {
            for (int j = i + 1; j < hand.length; j++) {
                if (hand[i].getFace().equals(hand[j].getFace())) {
                    pairCount++;
                    i++; // Skip the next duplicate
                    break;
                }
            }
        }
        return pairCount == 2;
    }

    public boolean hasThreeOfAKind(Card[] hand) {
        for (int i = 0; i < hand.length; i++) {
            int count = 1;
            for (int j = i + 1; j < hand.length; j++) {
                if (hand[i].getFace().equals(hand[j].getFace())) {
                    count++;
                }
            }
            if (count == 3) return true;
        }
        return false;
    }

    public boolean hasFourOfAKind(Card[] hand) {
        for (int i = 0; i < hand.length; i++) {
            int count = 1;
            for (int j = i + 1; j < hand.length; j++) {
                if (hand[i].getFace().equals(hand[j].getFace())) {
                    count++;
                }
            }
            if (count == 4) return true;
        }
        return false;
    }

    public boolean hasFlush(Card[] hand) {
        String suit = hand[0].getSuit();
        for (Card card : hand) {
            if (!card.getSuit().equals(suit)) {
                return false;
            }
        }
        return true;
    }

    public boolean hasStraight(Card[] hand) {
        int[] values = new int[hand.length];

        for (int i = 0; i < hand.length; i++) {
            values[i] = getFaceValue(hand[i].getFace());
        }

        // Bubble sort to avoid Collections.sort
        for (int i = 0; i < values.length - 1; i++) {
            for (int j = 0; j < values.length - i - 1; j++) {
                if (values[j] > values[j + 1]) {
                    int temp = values[j];
                    values[j] = values[j + 1];
                    values[j + 1] = temp;
                }
            }
        }

        for (int i = 0; i < values.length - 1; i++) {
            if (values[i] + 1 != values[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public boolean hasFullHouse(Card[] hand) {
        return hasThreeOfAKind(hand) && hasPair(hand);
    }

    private int getFaceValue(String face) {
        for (int i = 0; i < faces.length; i++) {
            if (faces[i].equals(face)) {
                return i;
            }
        }
        return -1;
    }
}
