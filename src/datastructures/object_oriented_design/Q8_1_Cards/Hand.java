package datastructures.object_oriented_design.Q8_1_Cards;

import java.util.ArrayList;

class Hand<Type extends Card> {
    ArrayList<Type> cards = new ArrayList<Type>();

    public int score() {
	int score = 0;
	for (Type card : cards) {
	    score += card.value();
	}
	return score;
    }

    public void addCard(Type card) {
	cards.add(card);
    }

}