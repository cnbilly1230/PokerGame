package LabExercise.poker.java.Predicates;

import LabExercise.poker.java.PatternType;

public class StraightPredicate implements PatternPredicate {

    @Override
    public boolean detect(PredicateRequest request) {
        return PatternPredicate.isStraight(request);
    }
    @Override
    public PatternType getType() {
        return PatternType.STRAIGHT;
    }
}
