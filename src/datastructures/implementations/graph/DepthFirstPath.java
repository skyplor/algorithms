package datastructures.implementations.graph;

import java.util.Stack;

public class DepthFirstPath {
    private boolean[] marked;
    private int[] edgeTo;
    private boolean hasCycle = false;

    public DepthFirstPath(MyGraphImpl G, int s) {
	marked = new boolean[G.V()];
	edgeTo = new int[G.V()];
	dfs(G, s, s);
    }

    private void dfs(MyGraphImpl G, int v, int u) {
	marked[v] = true;
	for (int w : G.adj(v)) {
	    if (!marked[w]) {
		edgeTo[w] = v;
		dfs(G, w, v);
	    } else if (w != u)
		hasCycle = true;
	}
    }

    public boolean hasPathTo(int v) {
	return marked[v];
    }

    public boolean hasCycle() {
	return hasCycle;
    }

    public Iterable<Integer> pathTo(int s, int v) {
	if (!hasPathTo(v))
	    return null;
	Stack<Integer> path = new Stack<Integer>();
	while (v != s) {
	    path.push(v);
	    v = edgeTo[v];
	}
	path.push(v);
	return path;
    }
}
