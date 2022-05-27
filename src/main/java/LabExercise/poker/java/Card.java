package LabExercise.poker.java;

import java.util.Objects;

public class Card implements Comparable<Card> {
    private Suit suit;
    private Rank rank;

    private Card(Suit suit, Rank rank) {
        this.suit = suit;
        this.rank = rank;
    }

    public static Card of(Suit suit, Rank rank) {
        return new Card(suit, rank);
    }


    @Override
    public String toString() {
        return String.format("%s of %s", rank, suit);
    }

    @Override
    public int compareTo(Card c1) {
        if (suit != c1.suit) {
            return getSuitValue() - c1.getSuitValue();
        }
        return getRankValue() - c1.getRankValue();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Card c2 = (Card) o;
        return Objects.equals(suit, c2.getSuit())
                && Objects.equals(rank, c2.getRank());
    }

    @Override
    public int hashCode() {
        return Objects.hash(suit, rank);
    }

    public Suit getSuit() {
        return suit;
    }

    public Rank getRank() {
        return rank;
    }

    public int getSuitValue() {
        return suit.getValue();
    }

    public int getRankValue() {
        return rank.getValue();
    }

    public enum Rank {
        TWO(2),
        THREE(3),
        FOUR(4),
        FIVE(5),
        SIX(6),
        SEVEN(7),
        EIGHT(8),
        NINE(9),
        TEN(10),
        JACK(11),
        QUEEN(12),
        KING(13),
        ACE(14);

        public final int value;

        Rank(int value) {
            this.value = value;
        }

        public static int compare(Rank a, Rank b) {
            return a.value - b.value;
        }

        public int getValue() {
            return value;
        }
    }

    public enum Suit {
        SPADE(4), HEART(3), CLUBS(2), DIAMOND(1);

        private final int value;

        Suit(int value) {
            this.value = value;
        }

        public static int compare(Suit a, Suit b) {
            return a.value - b.value;
        }

        public int getValue() {
            return value;
        }
    }
}
