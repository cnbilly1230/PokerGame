package LabExercise.poker.java;

import LabExercise.poker.java.Card;
import LabExercise.poker.java.Predicates.PredicateRequest;
import LabExercise.poker.java.Predicates.StraightPredicate;
import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PatternRequestTest {
    @Test
    public void shouldReturnIndicateRankValue(){
        Card c1 = Card.of(Card.Suit.SPADE, Card.Rank.TWO);
        Card c2 = Card.of(Card.Suit.SPADE, Card.Rank.TWO);
        Card c3 = Card.of(Card.Suit.SPADE, Card.Rank.TWO);
        Card c4 = Card.of(Card.Suit.SPADE, Card.Rank.FIVE);
        Card c5 = Card.of(Card.Suit.SPADE, Card.Rank.SIX);
        Card c6 = Card.of(Card.Suit.SPADE, Card.Rank.TWO);
        Card c7 = Card.of(Card.Suit.SPADE, Card.Rank.TWO);
        Card[] cards = new Card[]{c1,c2,c3,c4,c5,c6,c7};
        PredicateRequest request = new PredicateRequest(cards);
        assertEquals(5,request.getRankCounts().get(Card.Rank.TWO));
        System.out.println(request.getRankCounts().get(Card.Rank.TWO));

    } @Test
    public void shouldReturnIndicateSuitValue(){
        Card c1 = Card.of(Card.Suit.SPADE, Card.Rank.TWO);
        Card c2 = Card.of(Card.Suit.SPADE, Card.Rank.THREE);
        Card c3 = Card.of(Card.Suit.SPADE, Card.Rank.FOUR);
        Card c4 = Card.of(Card.Suit.SPADE, Card.Rank.FIVE);
        Card c5 = Card.of(Card.Suit.SPADE, Card.Rank.SIX);
        Card c6 = Card.of(Card.Suit.CLUBS, Card.Rank.SIX);
        Card c7 = Card.of(Card.Suit.CLUBS, Card.Rank.SIX);
        Card[] cards = new Card[]{c1,c2,c3,c4,c5,c6,c7};
        PredicateRequest request = new PredicateRequest(cards);
        assertEquals(5,request.getSuitCounts().get(Card.Suit.SPADE));
        assertNull(request.getSuitCounts().get(Card.Suit.HEART));
        System.out.println(request.getSuitCounts().get(Card.Suit.SPADE));

    }
}
