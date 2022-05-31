package LabExercise.poker.java;


import java.util.Arrays;

public class CardPattern {
    private Card[] cards;

    private PatternType type;

    public CardPattern(Card[] cards, PatternType type) {
        this.cards = cards;
        this.type = type;
    }
    public static CardPattern of(Card[] cards,PatternType type){return new CardPattern(cards, type);}

    public Card[] getCards() {
        return cards;
    }

    public PatternType getType() {
        return type;
    }

    @Override
    public String toString() {
        return String.format("[%s] from [%s}" ,type, Arrays.toString(cards));
    }
}
