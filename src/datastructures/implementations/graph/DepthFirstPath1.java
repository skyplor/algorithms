package datastructures.implementations.graph;

import java.util.Stack;

public class DepthFirstPath1 {
    int s;
    int[] edgeTo;
    boolean[] marked;

    public DepthFirstPath1(MyGraph G, int s) {
	this.s = s;
	edgeTo = new int[G.V()];
	marked = new boolean[G.V()];
	DFS(G, s);
    }

    public void DFS(MyGraph G, int v) {
	marked[v] = true;
	for (int w : G.adj(v))
	    if (!marked[w]) {
		edgeTo[w] = v;
		DFS(G, w);
	    }
    }

    public boolean hasPathTo(int v) {
	return marked[v];
    }

    public Stack<Integer> pathTo(int v) {
	if (!hasPathTo(v))
	    return null;
	Stack<Integer> path = new Stack<Integer>();
	for (int x = v; x != s; x = edgeTo[x]) {
	    path.push(x);
	}
	path.push(s);
	return path;
    }
}
