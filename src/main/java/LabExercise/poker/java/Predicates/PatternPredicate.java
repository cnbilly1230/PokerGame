package LabExercise.poker.java.Predicates;

import LabExercise.poker.java.Card;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public interface PatternPredicate {
    static boolean isFlush(predicateRequest request) {
        for (Card.Suit suit : Card.Suit.values()) {
            if (request.getRankCounts().get(suit) >= 5) {
                return true;
            }
        }
        return false;
    }static boolean isStraight (predicateRequest request) {
        List<Integer> sortedValuesOfRank = new ArrayList<>();
        int i = 0;
        for (Card.Rank rank : Card.Rank.values()) {
            if (request.getRankCounts().get(rank) > 0) {
                sortedValuesOfRank.add(i, rank.getValue());
                i++;
            }
        }
        Collections.sort(sortedValuesOfRank);
        for (j )
        return false;
    }

}
