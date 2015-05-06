package datastructures.questions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * This class will be given a list of words (such as might be tokenized from a
 * paragraph of text), and will provide a method that takes two words and
 * returns the shortest distance (in words) between those two words in the
 * provided text. Example: WordDistanceFinder finder = new
 * WordDistanceFinder(Arrays.asList("the", "quick", "brown", "fox", "quick"));
 * assert(finder.distance("fox","the") == 3); assert(finder.distance("quick",
 * "fox") == 1);
 * 
 * @author Sky
 * 
 */
public class WordDistanceFinder {

    public static void main(String[] args) {
	String[] words = new String[] { "the", "quick", "brown", "fox", "quick" };
	System.out.println(findShortestDistance(words, "fox", "quick"));
	
	WordDistanceFinder finder = new WordDistanceFinder(Arrays.asList(words));
	System.out.println(finder.distance("the","fox"));
    }
    
    List<String> words;

    public WordDistanceFinder(List<String> words) {
	this.words = words;
    }

    public int distance(String wordOne, String wordTwo) {
	if (words == null || wordOne == null || wordTwo == null)
	    return -1;
	if (wordOne.equals(wordTwo))
	    return 0;

	int minDistance = -1, indexOfWordOne = -1, indexOfWordTwo = -1;
	for (int i = 0; i < words.size(); ++i) {
	    String word = words.get(i);
	    if (word.equals(wordOne)) {
		if (indexOfWordTwo >= 0) {
		    minDistance = minDistance == -1 ? i - indexOfWordTwo : Math.min(minDistance, i - indexOfWordTwo);
		}
		indexOfWordOne = i;
	    } else if (word.equals(wordTwo)) {
		if (indexOfWordOne >= 0) {
		    minDistance = minDistance == -1 ? i - indexOfWordOne : Math.min(minDistance, i - indexOfWordOne);
		}
		indexOfWordTwo = i;
	    }
	}
	return minDistance;
    }

    public static int findShortestDistance(String[] words, String a, String b) {
	Map<String, Integer> parityValueMap = new HashMap<String, Integer>();
	parityValueMap.put(a, 0);
	parityValueMap.put(b, 1);

	Map<String, Integer> posMap = new HashMap<String, Integer>();
	posMap.put(a, 0);
	posMap.put(b, 0);
//	int[] min = new int[words.length];
	int minDistance = Integer.MAX_VALUE;
	Integer parityValue = Integer.MAX_VALUE;
	int wordsLength = words.length;
	for (int i = 0; i < wordsLength; i++) {
	    if (parityValueMap.containsKey(words[i])) {
		posMap.put(words[i], i);
		// First time we see a required word
		if (parityValue == Integer.MAX_VALUE) {
		    parityValue = parityValueMap.get(words[i]);
		    // we found the word other than the one found last time so
		    // lets calculate distance
		} else if (!parityValue.equals(parityValueMap.get(words[i]))) {
		    parityValue = parityValueMap.get(words[i]);
		    int tempMin = posMap.get(words[i]) - posMap.get(words[i].equals(a) ? b : a);
		    if (tempMin < minDistance) {
			minDistance = tempMin;
		    }
		}
	    }
	}
	return minDistance;
    }
}
