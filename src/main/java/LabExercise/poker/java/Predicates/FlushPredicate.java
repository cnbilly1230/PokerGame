package LabExercise.poker.java.Predicates;

import LabExercise.poker.java.PatternType;

public class FlushPredicate implements PatternPredicate {
    @Override
    public boolean detect(PredicateRequest request) {
        return PatternPredicate.isFlush(request);
    }
    @Override
    public PatternType getType() {
        return PatternType.FLUSH;
    }
}
