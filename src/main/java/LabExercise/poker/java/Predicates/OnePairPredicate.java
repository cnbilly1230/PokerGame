package LabExercise.poker.java.Predicates;

import LabExercise.poker.java.Card;
import LabExercise.poker.java.PatternType;

import java.util.ArrayList;
import java.util.List;

public class OnePairPredicate implements PatternPredicate{
    @Override
    public boolean detect(PredicateRequest request) {
        List<Integer> rankValueCounts = new ArrayList<>(request.getRankCounts().values());
        for(int value : rankValueCounts){
            if (value >= 2){return true;}
        }
        return false;
    }
    @Override
    public PatternType getType() {
        return PatternType.ONE_PAIR;
    }
}
