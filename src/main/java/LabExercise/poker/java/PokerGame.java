package LabExercise.poker.java;

public class PokerGame {
    public static void main(String arg[]){
        Card card1 = new Card(Card.Suit.SPADE, Card.Rank.ACE);
        Card card2 = new Card(Card.Suit.SPADE, Card.Rank.TWO);
        Card card3 = new Card(Card.Suit.SPADE, Card.Rank.THREE);
        Card card4 = new Card(Card.Suit.SPADE, Card.Rank.FOUR);
        Card card5 = new Card(Card.Suit.SPADE, Card.Rank.FIVE);

        Card[] hands = new Card[]{card1,card2,card3,card4,card5};

        Detector detector = new Detector();
        System.out.println(detector.detect(hands));
    }
}
