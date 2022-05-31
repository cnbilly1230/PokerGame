package LabExercise.poker.java.Predicates;

import LabExercise.poker.java.Card;
import org.testng.annotations.Test;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

public class PredicatesTest {
    @Test
    public void StraightShouldReturnTrue(){
        Card c1 = Card.of(Card.Suit.SPADE, Card.Rank.THREE);
        Card c2 = Card.of(Card.Suit.SPADE, Card.Rank.TWO);
        Card c3 = Card.of(Card.Suit.SPADE, Card.Rank.SIX);
        Card c4 = Card.of(Card.Suit.SPADE, Card.Rank.FIVE);
        Card c5 = Card.of(Card.Suit.SPADE, Card.Rank.FOUR);
        Card c6 = Card.of(Card.Suit.SPADE, Card.Rank.FOUR);
        Card c7 = Card.of(Card.Suit.SPADE, Card.Rank.FOUR);
        Card[] cards = new Card[]{c1,c2,c3,c4,c5,c6,c7};
        PredicateRequest request = new PredicateRequest(cards);
        StraightPredicate predicate = new StraightPredicate();
        assertTrue(predicate.detect(request));

    }@Test
    public void FlushShouldReturnTrue(){
        Card c1 = Card.of(Card.Suit.SPADE, Card.Rank.TWO);
        Card c2 = Card.of(Card.Suit.SPADE, Card.Rank.THREE);
        Card c3 = Card.of(Card.Suit.SPADE, Card.Rank.FOUR);
        Card c4 = Card.of(Card.Suit.SPADE, Card.Rank.FIVE);
        Card c5 = Card.of(Card.Suit.SPADE, Card.Rank.SIX);
        Card[] cards = new Card[]{c1,c2,c3,c4,c5};
        PredicateRequest request = new PredicateRequest(cards);
        FlushPredicate predicate = new FlushPredicate();
        assertTrue(predicate.detect(request));

    }@Test
    public void CheatingShouldReturnTrue(){
        Card c1 = Card.of(Card.Suit.SPADE, Card.Rank.TWO);
        Card c2 = Card.of(Card.Suit.SPADE, Card.Rank.THREE);
        Card c3 = Card.of(Card.Suit.SPADE, Card.Rank.FOUR);
        Card c4 = Card.of(Card.Suit.SPADE, Card.Rank.FIVE);
        Card c5 = Card.of(Card.Suit.SPADE, Card.Rank.JACK);
        Card c6 = Card.of(Card.Suit.HEART, Card.Rank.TWO);
        Card c7 = Card.of(Card.Suit.HEART, Card.Rank.TWO);
        Card[] cards = new Card[]{c1,c2,c3,c4,c5,c6,c7};
        PredicateRequest request = new PredicateRequest(cards);
        System.out.println(request.getRankCounts().values());
        CheatingPredicate predicate = new CheatingPredicate();
        assertTrue(predicate.detect(request));

    }@Test
    public void FourOfAKindShouldReturnTrue(){
        Card c1 = Card.of(Card.Suit.SPADE, Card.Rank.TWO);
        Card c2 = Card.of(Card.Suit.SPADE, Card.Rank.TWO);
        Card c3 = Card.of(Card.Suit.SPADE, Card.Rank.FOUR);
        Card c4 = Card.of(Card.Suit.SPADE, Card.Rank.FIVE);
        Card c5 = Card.of(Card.Suit.SPADE, Card.Rank.JACK);
        Card c6 = Card.of(Card.Suit.HEART, Card.Rank.TWO);
        Card c7 = Card.of(Card.Suit.HEART, Card.Rank.TWO);
        Card[] cards = new Card[]{c1,c2,c3,c4,c5,c6,c7};
        PredicateRequest request = new PredicateRequest(cards);
        FourOfAKindPredicate predicate = new FourOfAKindPredicate();
        assertTrue(predicate.detect(request));

    }@Test
    public void ThreeOfAKindShouldReturnTrue(){
        Card c1 = Card.of(Card.Suit.SPADE, Card.Rank.TWO);
        Card c2 = Card.of(Card.Suit.SPADE, Card.Rank.TWO);
        Card c3 = Card.of(Card.Suit.SPADE, Card.Rank.FOUR);
        Card c4 = Card.of(Card.Suit.SPADE, Card.Rank.FIVE);
        Card c5 = Card.of(Card.Suit.SPADE, Card.Rank.JACK);
        Card c6 = Card.of(Card.Suit.HEART, Card.Rank.TWO);
        Card c7 = Card.of(Card.Suit.HEART, Card.Rank.TWO);
        Card[] cards = new Card[]{c1,c2,c3,c4,c5,c6,c7};
        PredicateRequest request = new PredicateRequest(cards);
        ThreeOfAKindPredicate predicate = new ThreeOfAKindPredicate();
        assertTrue(predicate.detect(request));

    }@Test
    public void TwoPairShouldReturnTrue(){
        Card c1 = Card.of(Card.Suit.SPADE, Card.Rank.TWO);
        Card c2 = Card.of(Card.Suit.SPADE, Card.Rank.TWO);
        Card c3 = Card.of(Card.Suit.SPADE, Card.Rank.FOUR);
        Card c4 = Card.of(Card.Suit.SPADE, Card.Rank.FIVE);
        Card c5 = Card.of(Card.Suit.SPADE, Card.Rank.JACK);
        Card c6 = Card.of(Card.Suit.HEART, Card.Rank.TWO);
        Card c7 = Card.of(Card.Suit.SPADE, Card.Rank.FOUR);
        Card[] cards = new Card[]{c1,c2,c3,c4,c5,c6,c7};
        PredicateRequest request = new PredicateRequest(cards);
        TwoPairPredicate predicate = new TwoPairPredicate();
        assertTrue(predicate.detect(request));

    }@Test
    public void OnePairShouldReturnTrue(){
        Card c1 = Card.of(Card.Suit.SPADE, Card.Rank.TWO);
        Card c2 = Card.of(Card.Suit.SPADE, Card.Rank.TWO);
        Card c3 = Card.of(Card.Suit.SPADE, Card.Rank.FOUR);
        Card c4 = Card.of(Card.Suit.SPADE, Card.Rank.FIVE);
        Card c5 = Card.of(Card.Suit.SPADE, Card.Rank.JACK);
        Card c6 = Card.of(Card.Suit.HEART, Card.Rank.TWO);
        Card c7 = Card.of(Card.Suit.SPADE, Card.Rank.FOUR);
        Card[] cards = new Card[]{c1,c2,c3,c4,c5,c6,c7};
        PredicateRequest request = new PredicateRequest(cards);
        OnePairPredicate predicate = new OnePairPredicate();
        assertTrue(predicate.detect(request));

    }@Test
    public void FullHouseShouldReturnTrue(){
        Card c1 = Card.of(Card.Suit.SPADE, Card.Rank.TWO);
        Card c2 = Card.of(Card.Suit.SPADE, Card.Rank.TWO);
        Card c3 = Card.of(Card.Suit.SPADE, Card.Rank.FOUR);
        Card c4 = Card.of(Card.Suit.SPADE, Card.Rank.FOUR);
        Card c5 = Card.of(Card.Suit.SPADE, Card.Rank.FOUR);
        Card c6 = Card.of(Card.Suit.HEART, Card.Rank.TWO);
        Card c7 = Card.of(Card.Suit.SPADE, Card.Rank.TWO);
        Card[] cards = new Card[]{c1,c2,c3,c4,c5,c6,c7};
        PredicateRequest request = new PredicateRequest(cards);
        FullHousePredicate predicate = new FullHousePredicate();
        assertTrue(predicate.detect(request));

    }@Test
    public void StraightFlushShouldReturnTrue(){
        Card c1 = Card.of(Card.Suit.SPADE, Card.Rank.ACE);
        Card c2 = Card.of(Card.Suit.CLUBS, Card.Rank.TWO);
        Card c3 = Card.of(Card.Suit.SPADE, Card.Rank.THREE);
        Card c4 = Card.of(Card.Suit.SPADE, Card.Rank.FOUR);
        Card c5 = Card.of(Card.Suit.SPADE, Card.Rank.FIVE);
        Card c6 = Card.of(Card.Suit.SPADE, Card.Rank.SIX);
        Card c7 = Card.of(Card.Suit.SPADE, Card.Rank.SEVEN);
        Card[] cards = new Card[]{c1,c2,c3,c4,c5,c6,c7};
        PredicateRequest request = new PredicateRequest(cards);
        StraightFlushPredicate predicate = new StraightFlushPredicate();
        assertTrue(predicate.detect(request));
    }@Test
    public void RoyalFlushShouldReturnTrue(){
        Card c1 = Card.of(Card.Suit.HEART, Card.Rank.JACK);
        Card c2 = Card.of(Card.Suit.HEART, Card.Rank.QUEEN);
        Card c3 = Card.of(Card.Suit.HEART, Card.Rank.KING);
        Card c4 = Card.of(Card.Suit.HEART, Card.Rank.ACE);
        Card c5 = Card.of(Card.Suit.HEART, Card.Rank.TEN);
        Card c6 = Card.of(Card.Suit.HEART, Card.Rank.TWO);
        Card c7 = Card.of(Card.Suit.CLUBS, Card.Rank.TWO);
        Card[] cards = new Card[]{c1,c2,c3,c4,c5,c6,c7};
        PredicateRequest request = new PredicateRequest(cards);
        RoyalFlushPredicate predicate = new RoyalFlushPredicate();
        assertTrue(predicate.detect(request));
    }
}
