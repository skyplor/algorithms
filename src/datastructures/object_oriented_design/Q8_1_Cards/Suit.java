package datastructures.object_oriented_design.Q8_1_Cards;


public enum Suit {
    HEARTS(1), DIAMOND(2), SPADE(3), CLUBS(4);

    int value;
    static {
        for (Suit s : Suit.values())
    	Deck.lookupSuit.put(s.getValue(), s);
    }

    private Suit(int v) {
        this.value = v;
    }

    public int getValue() {
        return value;
    }

    public static Suit getSuitFromValue(int v) {
        return Deck.lookupSuit.get(v);
    }

    public String toString() {
        return getSuitFromValue(this.value).name();
    }
}