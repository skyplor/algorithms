package datastructures.object_oriented_design.Q8_1_Cards;


public enum Rank {
    ACE(1), TWO(2), THREE(3), FOUR(4), FIVE(5), SIX(6), SEVEN(7), EIGHT(8), NINE(9), TEN(10), JACK(11), QUEEN(12), KING(13);

    int value;

    private Rank(int v) {
        this.value = v;
    }

    static {
        for (Rank r : Rank.values())
    	Deck.lookupRank.put(r.getValue(), r);
    }

    public int getValue() {
        return value;
    }

    public static Rank getRankFromValue(int v) {
        return Deck.lookupRank.get(v);
    }

    public String toString() {
        return getRankFromValue(this.value).name();
    }
}