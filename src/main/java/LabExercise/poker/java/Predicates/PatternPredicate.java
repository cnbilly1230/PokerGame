package LabExercise.poker.java.Predicates;

import LabExercise.poker.java.Card;
import LabExercise.poker.java.PatternType;

import java.util.*;
import java.util.stream.Collectors;

public interface PatternPredicate {

    Set<Integer> MAXIMUM_STRAIGHT = new HashSet<>(){{
        add(14);
        add(13);
        add(12);
        add(11);
        add(10);
    }};


    Set<Integer> MINIMUM_STRAIGHT = new HashSet<>(){{
        add(14);
        add(2);
        add(3);
        add(4);
        add(5);
    }};

    boolean detect(PredicateRequest request);

    PatternType getType();

    static boolean isFlush(PredicateRequest request) {
        for (Card.Suit suit : Card.Suit.values()) {
            if (request.getSuitCounts().get(suit) >= 5) {
                return true;
            }
        }
        return false;
    }

    static boolean isStraight(PredicateRequest request) {
        List<Card.Rank> ranks = new ArrayList<>(request.getRankCounts().keySet());
        List<Integer> sortedRankValues = ranks.stream()
                .map(Card.Rank::getValue)
                .collect(Collectors.toList());
        Collections.sort(sortedRankValues);
        int prev = 0;
        int count = 0;
        for (int value : sortedRankValues) {
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

//        for (int i = 1; i < sortedRankValues.size(); i++) {
//            if (sortedRankValues.get(i) - sortedRankValues.get(i - 1) == 1) {
//                //....
//            }
//        }

        return false;
    }
    static boolean isMaximumStraight (Card[] cards){
        Set<Integer> checkingSet = new HashSet<>();
        for (Card card : cards){
            checkingSet.add(card.getRankValue());
        }
        return checkingSet.containsAll(MAXIMUM_STRAIGHT);
    }static boolean isMinimumStraight (Card[] cards){
        Set<Integer> checkingSet = new HashSet<>();
        for (Card card : cards){
            checkingSet.add(card.getRankValue());
        }
        return checkingSet.containsAll(MINIMUM_STRAIGHT);
    }

}