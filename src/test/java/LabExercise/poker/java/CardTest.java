package LabExercise.poker.java;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class CardTest {
    @Test
    public void shouldReturnTrue_WhenCompareCards() {
        Card card1 = Card.of(Card.Suit.CLUBS, Card.Rank.ACE);
        Card card2 = Card.of(Card.Suit.DIAMOND, Card.Rank.ACE);
        Card card3 = Card.of(Card.Suit.DIAMOND, Card.Rank.ACE);
        Card card4 = Card.of(Card.Suit.DIAMOND, Card.Rank.KING);
        assertTrue(card1.compareTo(card2)>0);
        System.out.println(card1);
}   @Test
    public void shouldReturnFalse_WhenCompareCards() {
        Card card1 = Card.of(Card.Suit.HEART, Card.Rank.ACE);
        Card card2 = Card.of(Card.Suit.SPADE, Card.Rank.ACE);
        Card card3 = Card.of(Card.Suit.SPADE, Card.Rank.ACE);
        Card card4 = Card.of(Card.Suit.SPADE, Card.Rank.KING);
        assertFalse(card1.compareTo(card2)>0);
        assertFalse(card1.compareTo(card2)>0);
}   @Test
    public void shouldReturnEqual_WhenCompareCards() {
        Card card1 = Card.of(Card.Suit.CLUBS, Card.Rank.ACE);
        Card card2 = Card.of(Card.Suit.CLUBS, Card.Rank.ACE);
        Card card3 = Card.of(Card.Suit.DIAMOND, Card.Rank.ACE);
        Card card4 = Card.of(Card.Suit.DIAMOND, Card.Rank.ACE);
        assertEquals(card1,card2);
        assertEquals(card3,card4);
}}
