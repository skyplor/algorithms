package datastructures.object_oriented_design.Q8_1_Cards;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import datastructures.util.AssortedMethods;

/**
 * Design the data structures for a generic deck of cards. Explain how you would
 * subclass the data structures to implement blackjack.
 * 
 * @author Sky
 * 
 */
public class Deck<T extends Card> {

    private ArrayList<Card> cards;
    private int dealtIndex = 0; // marks first undealt card

    // Reverse-lookup map for getting a suit and rank from a value
    static final Map<Integer, Suit> lookupSuit = new HashMap<Integer, Suit>();
    static final Map<Integer, Rank> lookupRank = new HashMap<Integer, Rank>();

    public enum CardType {
	BLACKJACK, POKER
    }

    public static void main(String[] args) {
	Deck decks = new Deck();
	// decks.createCardGame(CardType.BLACKJACK);

    }

    public void setDeckOfCards(ArrayList<Card> deckOfCards) {
	cards = deckOfCards;
    }

    public void shuffle() {
	for (int i = 0; i < cards.size(); i++) {
	    int j = AssortedMethods.randomIntInRange(i, cards.size() - i - 1);
	    Card card1 = cards.get(i);
	    Card card2 = cards.get(j);
	    cards.set(i, card2);
	    cards.set(j, card1);
	}
    }

    public int remainingCards() {
	return cards.size() - dealtIndex;
    }

    public Deck() {
	// Suits, value, front, stack
	cards = new ArrayList<Card>();
	// create 52 cards
	Card[] hand = new Card[52];
	for (int i = 0; i < 4; i++) {
	    for (int j = 0; j < 13; j++) {
		hand[i] = new Card(Suit.getSuitFromValue(i + 1), Rank.getRankFromValue(j + 1));
		System.out.println("Card: " + hand[i].toString());
	    }
	}

    }

    public Card[] dealHand(int number) {
	if (remainingCards() < number) {
	    return null;
	}

	Card[] hand = new Card[number];
	int count = 0;
	while (count < number) {
	    Card card = dealCard();
	    if (card != null) {
		hand[count] = card;
		count++;
	    }
	}

	return hand;
    }

    public Card dealCard() {
	if (remainingCards() == 0) {
	    return null;
	}

	Card card = cards.get(dealtIndex);
	card.markUnavailable();
	dealtIndex++;

	return card;
    }

    // public Deck createCardGame(CardType type) {
    // if (type == CardType.BLACKJACK)
    // return new BlackJack();
    // else if (type == CardType.POKER)
    // return new Poker();
    // else
    // return null;
    // }

}
