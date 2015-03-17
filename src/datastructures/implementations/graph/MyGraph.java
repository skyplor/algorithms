package datastructures.implementations.graph;

import java.util.LinkedList;

public class MyGraph {
	// We need number of vertices, number of edges, list of adjacent nodes
	private final int V;
	private int E;
	private LinkedList<Integer>[] adjNodes;
	private boolean[] marked;
	
	public MyGraph(int V) {
		this.V = V;
		this.E = 0;
		adjNodes = (LinkedList<Integer>[]) new LinkedList[V];
		for (int i = 0; i < V; i++) {
			adjNodes[i] = new LinkedList<Integer>();
			marked[i] = false;
		}
		
	}
	public int V() { return V; }
	public int E() { return E; }
	
	public void addEdge(int v, int w) {
		adjNodes[v].add(w);
		adjNodes[w].add(v);
		E++;
	}
	
	public Iterable<Integer> adj(int v) {
		return adjNodes[v];
	}
}