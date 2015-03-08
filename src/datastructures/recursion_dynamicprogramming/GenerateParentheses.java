package datastructures.recursion_dynamicprogramming;

import java.util.HashSet;
import java.util.Set;

public class GenerateParentheses {

    public Set<String> generateParentheses(int a) {
	return generateParentheses(a, a, "");
    }

    private Set<String> generateParentheses(int open, int close, String s) {
	Set<String> result = new HashSet<String>();
	if (open == 0 && close == 0) {
	    // add this string s into the result set
	    result.add(s);
	}

	if (open > 0)
	    result.addAll(generateParentheses(open - 1, close, s + "("));
	if (close > open && close > 0)
	    result.addAll(generateParentheses(open, close - 1, s + ")"));
	return result;
    }
}
