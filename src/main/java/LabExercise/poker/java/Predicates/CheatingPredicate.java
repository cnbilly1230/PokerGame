package LabExercise.poker.java.Predicates;

import LabExercise.poker.java.Card;
import LabExercise.poker.java.PatternType;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CheatingPredicate implements PatternPredicate{
    @Override
    public boolean detect(PredicateRequest request) {
        Set<Card> checkDuplicate = new HashSet<>(List.of(request.getCards()));
        if (checkDuplicate.size() != request.getCards().length){
            return true;
        }
        return false;
    }

    @Override
    public PatternType getType() {
        return PatternType.CHEATING;
    }
}
