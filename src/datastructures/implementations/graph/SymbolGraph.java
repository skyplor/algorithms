package datastructures.implementations.graph;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class SymbolGraph {
    static Map<String, Integer> map;
    static String[] reverse;
    static MyGraph g;

    public SymbolGraph() {
	map = new HashMap<String, Integer>();
    }

    // need 3 data structures (map, array and graph) as we don't know the size beforehand. If we know, then we can just use 2 (array and graph)
    // First pass is to build the index. Second pass is to build the graph.
    public static void main(String[] args) throws IOException {
	// read input
	InputStreamReader isr = new InputStreamReader(System.in);
	BufferedReader buffer = new BufferedReader(isr);
	StringBuilder sb = new StringBuilder();
	String line;
	while ((line = buffer.readLine()) != null) {
	    sb.append(line);
	    sb.append("\n");
	    // write each line into map
	    String[] s = line.split(" ");
	    for (int i = 0; i < s.length; i++) {
		if (!map.containsKey(s[i])) {
		    map.put(s[i], map.size());
		}
	    }
	}
	buffer.close();
	reverse = reverseIndex(map);
	g = buildGraph(map, sb.toString());
    }

    private static String[] reverseIndex(Map<String, Integer> map) {
	if (map != null) {
	    String[] reversal = new String[map.size()];
	    for (String s : map.keySet()) {
		reversal[map.get(s)] = s;
	    }
	    return reversal;
	}
	return null;
    }

    private static MyGraph buildGraph(Map<String, Integer> map, String input) throws IOException {
	MyGraph graph = new MyGraph(map.size());
	// convert String into InputStream
	InputStream is = new ByteArrayInputStream(input.getBytes());

	// read it with BufferedReader
	BufferedReader buffer = new BufferedReader(new InputStreamReader(is));
	String line;
	while ((line = buffer.readLine()) != null) {
	    String[] s = line.split(" ");
	    int vertex = map.get(s[0]);
	    for (int i = 1; i < s.length; i++) {
		graph.addEdge(vertex, map.get(s[i]));
	    }
	}
	buffer.close();
	return graph;
    }

    public boolean contains(String s) {
	return map.containsKey(s);
    }

    public int index(String key) {
	if (contains(key)) {
	    return map.get(key);
	}
	return -1;
    }

    public String name(int v) {
	return reverse[v];
    }

    public MyGraph graph() {
	return g;
    }
}