package LabExercise.poker.java;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class DetectorTest {
    @Test
    public void shouldReturnStraightType(){
        Card c1 = Card.of(Card.Suit.SPADE, Card.Rank.ACE);
        Card c2 = Card.of(Card.Suit.HEART, Card.Rank.TWO);
        Card c3 = Card.of(Card.Suit.CLUBS, Card.Rank.ACE);
        Card c4 = Card.of(Card.Suit.DIAMOND, Card.Rank.THREE);
        Card c5 = Card.of(Card.Suit.SPADE, Card.Rank.JACK);
        Card c6 = Card.of(Card.Suit.HEART, Card.Rank.FOUR);
        Card c7 = Card.of(Card.Suit.CLUBS, Card.Rank.FIVE);
        Card[] hands = new Card[]{c1,c2,c3,c4,c5,c6,c7};
        Detector detector = new Detector();
        assertEquals(PatternType.STRAIGHT,detector.detect(hands).getType());
    } @Test
    public void shouldReturnFlushType(){
        Card c1 = Card.of(Card.Suit.SPADE, Card.Rank.TWO);
        Card c2 = Card.of(Card.Suit.SPADE, Card.Rank.EIGHT);
        Card c3 = Card.of(Card.Suit.SPADE, Card.Rank.FOUR);
        Card c4 = Card.of(Card.Suit.SPADE, Card.Rank.TEN);
        Card c5 = Card.of(Card.Suit.SPADE, Card.Rank.SIX);
        Card c6 = Card.of(Card.Suit.HEART, Card.Rank.SIX);
        Card c7 = Card.of(Card.Suit.CLUBS, Card.Rank.SIX);
        Card[] hands = new Card[]{c1,c2,c3,c4,c5,c6,c7};
        Detector detector = new Detector();
        assertEquals(PatternType.FLUSH,detector.detect(hands).getType());
    } @Test
    public void shouldReturnCheatingType(){
        Card c1 = Card.of(Card.Suit.SPADE, Card.Rank.ACE);
        Card c2 = Card.of(Card.Suit.HEART, Card.Rank.TWO);
        Card c3 = Card.of(Card.Suit.CLUBS, Card.Rank.ACE);
        Card c4 = Card.of(Card.Suit.DIAMOND, Card.Rank.THREE);
        Card c5 = Card.of(Card.Suit.SPADE, Card.Rank.ACE);
        Card c6 = Card.of(Card.Suit.HEART, Card.Rank.FOUR);
        Card c7 = Card.of(Card.Suit.CLUBS, Card.Rank.FIVE);
        Card[] hands = new Card[]{c1,c2,c3,c4,c5,c6,c7};
        Detector detector = new Detector();
        assertEquals(PatternType.CHEATING,detector.detect(hands).getType());
    } @Test
    public void shouldReturnFourOfAKindType(){
        Card c1 = Card.of(Card.Suit.SPADE, Card.Rank.ACE);
        Card c2 = Card.of(Card.Suit.HEART, Card.Rank.ACE);
        Card c3 = Card.of(Card.Suit.CLUBS, Card.Rank.ACE);
        Card c4 = Card.of(Card.Suit.DIAMOND, Card.Rank.ACE);
        Card c5 = Card.of(Card.Suit.SPADE, Card.Rank.JACK);
        Card c6 = Card.of(Card.Suit.HEART, Card.Rank.JACK);
        Card c7 = Card.of(Card.Suit.CLUBS, Card.Rank.JACK);
        Card[] hands = new Card[]{c1,c2,c3,c4,c5,c6,c7};
        Detector detector = new Detector();
        assertEquals(PatternType.FOUR_OF_A_KIND,detector.detect(hands).getType());
    } @Test
    public void shouldReturnThreeOfAKindType(){
        Card c1 = Card.of(Card.Suit.SPADE, Card.Rank.ACE);
        Card c2 = Card.of(Card.Suit.HEART, Card.Rank.ACE);
        Card c3 = Card.of(Card.Suit.CLUBS, Card.Rank.ACE);
        Card c4 = Card.of(Card.Suit.DIAMOND, Card.Rank.THREE);
        Card c5 = Card.of(Card.Suit.SPADE, Card.Rank.SIX);
        Card c6 = Card.of(Card.Suit.HEART, Card.Rank.FOUR);
        Card c7 = Card.of(Card.Suit.CLUBS, Card.Rank.FIVE);
        Card[] hands = new Card[]{c1,c2,c3,c4,c5,c6,c7};
        Detector detector = new Detector();
        assertEquals(PatternType.THREE_OF_A_KIND,detector.detect(hands).getType());
    } @Test
    public void shouldReturnTwoPairType(){
        Card c1 = Card.of(Card.Suit.SPADE, Card.Rank.ACE);
        Card c2 = Card.of(Card.Suit.HEART, Card.Rank.TWO);
        Card c3 = Card.of(Card.Suit.CLUBS, Card.Rank.ACE);
        Card c4 = Card.of(Card.Suit.DIAMOND, Card.Rank.THREE);
        Card c5 = Card.of(Card.Suit.SPADE, Card.Rank.JACK);
        Card c6 = Card.of(Card.Suit.HEART, Card.Rank.FIVE);
        Card c7 = Card.of(Card.Suit.CLUBS, Card.Rank.TWO);
        Card[] hands = new Card[]{c1,c2,c3,c4,c5,c6,c7};
        Detector detector = new Detector();
        assertEquals(PatternType.TWO_PAIR,detector.detect(hands).getType());
    } @Test
    public void shouldReturnOnePairType(){
        Card c1 = Card.of(Card.Suit.SPADE, Card.Rank.ACE);
        Card c2 = Card.of(Card.Suit.HEART, Card.Rank.TWO);
        Card c3 = Card.of(Card.Suit.CLUBS, Card.Rank.ACE);
        Card c4 = Card.of(Card.Suit.DIAMOND, Card.Rank.THREE);
        Card c5 = Card.of(Card.Suit.SPADE, Card.Rank.JACK);
        Card c6 = Card.of(Card.Suit.HEART, Card.Rank.QUEEN);
        Card c7 = Card.of(Card.Suit.CLUBS, Card.Rank.KING);
        Card[] hands = new Card[]{c1,c2,c3,c4,c5,c6,c7};
        Detector detector = new Detector();
        assertEquals(PatternType.ONE_PAIR,detector.detect(hands).getType());
    } @Test
    public void shouldReturnFullHouseType(){
        Card c1 = Card.of(Card.Suit.SPADE, Card.Rank.ACE);
        Card c2 = Card.of(Card.Suit.HEART, Card.Rank.ACE);
        Card c3 = Card.of(Card.Suit.CLUBS, Card.Rank.ACE);
        Card c4 = Card.of(Card.Suit.DIAMOND, Card.Rank.THREE);
        Card c5 = Card.of(Card.Suit.SPADE, Card.Rank.THREE);
        Card c6 = Card.of(Card.Suit.HEART, Card.Rank.THREE);
        Card c7 = Card.of(Card.Suit.CLUBS, Card.Rank.FIVE);
        Card[] hands = new Card[]{c1,c2,c3,c4,c5,c6,c7};
        Detector detector = new Detector();
        assertEquals(PatternType.FULL_HOUSE,detector.detect(hands).getType());
    } @Test
    public void shouldReturnStraightFlushType(){
        Card c1 = Card.of(Card.Suit.HEART, Card.Rank.ACE);
        Card c2 = Card.of(Card.Suit.HEART, Card.Rank.TWO);
        Card c3 = Card.of(Card.Suit.HEART, Card.Rank.FOUR);
        Card c4 = Card.of(Card.Suit.HEART, Card.Rank.THREE);
        Card c5 = Card.of(Card.Suit.HEART, Card.Rank.FIVE);
        Card c6 = Card.of(Card.Suit.CLUBS, Card.Rank.FOUR);
        Card c7 = Card.of(Card.Suit.CLUBS, Card.Rank.FIVE);
        Card[] hands = new Card[]{c1,c2,c3,c4,c5,c6,c7};
        Detector detector = new Detector();
        assertEquals(PatternType.STRAIGHT_FLUSH,detector.detect(hands).getType());
    } @Test
    public void shouldReturnRoyalFlushType(){
        Card c1 = Card.of(Card.Suit.SPADE, Card.Rank.ACE);
        Card c2 = Card.of(Card.Suit.SPADE, Card.Rank.TEN);
        Card c3 = Card.of(Card.Suit.SPADE, Card.Rank.JACK);
        Card c4 = Card.of(Card.Suit.SPADE, Card.Rank.QUEEN);
        Card c5 = Card.of(Card.Suit.SPADE, Card.Rank.KING);
        Card c6 = Card.of(Card.Suit.HEART, Card.Rank.FOUR);
        Card c7 = Card.of(Card.Suit.CLUBS, Card.Rank.FIVE);
        Card[] hands = new Card[]{c1,c2,c3,c4,c5,c6,c7};
        Detector detector = new Detector();
        assertEquals(PatternType.ROYAL_FLUSH,detector.detect(hands).getType());
    }
}
