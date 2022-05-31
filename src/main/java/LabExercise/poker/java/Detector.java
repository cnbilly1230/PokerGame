package LabExercise.poker.java;

import LabExercise.poker.java.Predicates.*;

public class Detector {
    private final PatternPredicate[] patternPredicates = new PatternPredicate[]{
            new CheatingPredicate(),
            new RoyalFlushPredicate(),
            new StraightFlushPredicate(),
            new FourOfAKindPredicate(),
            new FullHousePredicate(),
            new FlushPredicate(),
            new StraightPredicate(),
            new ThreeOfAKindPredicate(),
            new TwoPairPredicate(),
            new OnePairPredicate()
    };


public CardPattern detect(Card[] cards){
    PredicateRequest request = new PredicateRequest(cards);

    PatternType type = PatternType.HIGH_CARD;

    for (PatternPredicate predicate : patternPredicates){
        if(predicate.detect(request)){
            type = predicate.getType();
            break;
        }

    }
    return CardPattern.of(cards, type);

}
}
