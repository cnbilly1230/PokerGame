package LabExercise.poker.java.Predicates;

import LabExercise.poker.java.Card;
import LabExercise.poker.java.PatternType;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StraightFlushPredicate implements PatternPredicate {
    @Override
    public PatternType getType() {
        return PatternType.STRAIGHT_FLUSH;
    }

    @Override
    public boolean detect(PredicateRequest request) {
        Card[] cards = request.getCards();
        Card.Suit repeatingSuit = null;
        for (Card.Suit suit : Card.Suit.values()){
            if (getSuitCounts(cards , suit) >=5){
                repeatingSuit = suit;
                break;
            }
        }
        if (repeatingSuit != null){
            return checkIsStraight(getCardArray(repeatingSuit,cards));

        }
        return false;
    }

    private int getSuitCounts(Card[] cards, Card.Suit suit){
        int suitCounts = 0;
        for(Card card : cards){
            if(card.getSuit() == suit){
                suitCounts++;
            }
        }if(suitCounts >= 5){
            return suitCounts;
        }
        return 0;
    }
    private Card[] getCardArray(Card.Suit repeatingSuit, Card[] cards){
        List<Card> flushCardList = new ArrayList<>();
        for(Card card: cards){
            if (card.getSuit() ==  repeatingSuit){
                flushCardList.add(card);

            }
        }
        return flushCardList.toArray(new Card[0]);
    }
    private boolean checkIsStraight (Card[] cards){
        if(PatternPredicate.isMinimumStraight(cards)){
            return true;
        }
        return furtherChecking(cards);
    }

    private boolean furtherChecking(Card[] cards) {
        List<Integer> sortedRank = new ArrayList<>();
        for (Card card : cards){
            sortedRank.add(card.getRankValue());
        }
        Collections.sort(sortedRank);
        int prev = 0;
        int count = 0;
        for (int value : sortedRank) {
            if (prev == value - 1) {
                prev = value;
                count++;
            } else {
                count = 0;
                prev = value;
            }
            if (count >= 4) {
                return true;
            }
        }
        return false;
    }
}

