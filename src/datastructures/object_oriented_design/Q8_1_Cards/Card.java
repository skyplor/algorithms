package datastructures.object_oriented_design.Q8_1_Cards;


class Card {
    Suit s;
    Rank r;
    protected int faceValue;
    boolean available = false;

    Card(Suit s, Rank r) {
	this.s = s;
	this.r = r;
	markAvailable();
    }

    public Suit suit() {
	return s;
    }

    public Rank rank() {
	return r;
    }

    public boolean isAvailable() {
	return available;
    }

    public void markUnavailable() {
	available = false;
    }

    public void markAvailable() {
	available = true;
    }

    public int value() {
	return faceValue;
    }

    public String toString() {
	return r.toString() + " of " + s.toString();
    }
}