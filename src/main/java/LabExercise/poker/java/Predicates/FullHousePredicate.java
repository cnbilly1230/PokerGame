package LabExercise.poker.java.Predicates;

import LabExercise.poker.java.PatternType;

import java.util.ArrayList;
import java.util.List;

public class FullHousePredicate implements PatternPredicate {
    @Override
    public PatternType getType() {
        return PatternType.FULL_HOUSE;
    }

    @Override
    public boolean detect(PredicateRequest request) {
        List<Integer> rankValueCounts = new ArrayList<>(request.getRankCounts().values());
        int pairCounts = 0;
        int threeOfAKindCounts = 0;
        for (int value : rankValueCounts) {
            if (value >= 3) {
                threeOfAKindCounts++;
            } else if (value >= 2) {
                pairCounts++;

            }
        }
        if ((pairCounts >= 1 && threeOfAKindCounts >= 1) || threeOfAKindCounts >= 2) {
            return true;
        }
        return false;

    }
}
