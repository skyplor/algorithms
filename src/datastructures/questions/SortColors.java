package datastructures.questions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SortColors {
    /** Constructor. */
    public SortColors() {

    }

    public List<Pair> sort(Pair[] a) {
	Map<String, List<Pair>> hash = new HashMap<String, List<Pair>>();
	for (int i = 0; i < a.length; i++) {
	    Pair current = a[i];
	    List<Pair> l;
	    if (!hash.containsKey(current.getColor())) {
		l = new ArrayList<Pair>();
		l.add(current);
		hash.put(current.getColor(), l);
	    } else {
		l = hash.get(current.getColor());
		l.add(current);
	    }
	}

	List<Pair> result = new ArrayList<Pair>();
	if (hash.containsKey("red")) {
	    result.addAll(hash.get("red"));
	}
	if (hash.containsKey("blue")) {
	    result.addAll(hash.get("blue"));
	}
	if (hash.containsKey("yellow")) {
	    result.addAll(hash.get("yellow"));
	}
	return result;
    }

    private static class Pair {
	int value;
	String color;

	public int getValue() {
	    return this.value;
	}

	public String getColor() {
	    return this.color;
	}
    }

    public static void main(String[] args) throws Exception {
	Pair p1 = new Pair();
	p1.value = 1;
	p1.color = "blue";
	Pair p2 = new Pair();
	p2.value = 3;
	p2.color = "red";
	Pair p3 = new Pair();
	p3.value = 4;
	p3.color = "blue";
	Pair p4 = new Pair();
	p4.value = 6;
	p4.color = "yellow";
	Pair p5 = new Pair();
	p5.value = 9;
	p5.color = "red";
	Pair[] input = new Pair[] { p1, p2, p3, p4, p5 };
	SortColors s = new SortColors();
	List<Pair> result = s.sort(input);
	for (Pair p : result) {
	    System.out.println("(" + p.getValue() + ", " + p.getColor() + ")");
	}
    }
}
