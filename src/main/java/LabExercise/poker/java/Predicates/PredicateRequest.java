package LabExercise.poker.java.Predicates;

import LabExercise.poker.java.Card;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public final class PredicateRequest {

    public static Set<Integer> MAXIMUMSRTAIGHT;

    public static Set<Integer> MINIMUMSTRAIGHT;

    private final Card[] cards;

    private final Map<Card.Suit,Integer> SuitCounts;

    private final Map<Card.Rank,Integer> RankCounts;


    public PredicateRequest(Card[] cards) {
        this.cards = cards;
        this.SuitCounts = countSuit(cards);
        this.RankCounts = countRank(cards);
    }

    private Map<Card.Suit,Integer> countSuit(Card[] cards){
        Map<Card.Suit,Integer> suitCounter = new HashMap<>();
        for (Card card : cards){
            suitCounter.put(card.getSuit(),suitCounter.getOrDefault(card.getSuit(),0)+1);
        }
        return suitCounter;
    }
    private Map<Card.Rank,Integer> countRank(Card[] cards){
        Map<Card.Rank,Integer> rankCounter = new HashMap<>();
        for (Card card : cards){
            rankCounter.put(card.getRank(),rankCounter.getOrDefault(card.getRank(),0)+1);
        }
        return rankCounter;
    }

    public Card[] getCards() {
        return cards;
    }

    public Map<Card.Suit, Integer> getSuitCounts() {
        return SuitCounts;
    }

    public Map<Card.Rank, Integer> getRankCounts() {
        return RankCounts;
    }
}
