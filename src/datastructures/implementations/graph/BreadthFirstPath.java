package datastructures.implementations.graph;

import datastructures.implementations.MyQueueImpl;
import datastructures.implementations.MyStackImpl;

public class BreadthFirstPath {
    private boolean[] marked;
    private int[] edgeTo;
    private boolean bipartite = true;
    private boolean[] color;

    public BreadthFirstPath(MyGraphImpl G, int s) {
	marked = new boolean[G.V()];
	color = new boolean[G.V()];
	edgeTo = new int[G.V()];
	bfs(G, s);
    }

    private void bfs(MyGraphImpl G, int s) {
	MyQueueImpl<Integer> q = new MyQueueImpl<Integer>();
	q.enqueue(s);
	while (!q.isEmpty()) {
	    int v = q.dequeue();
	    for (int w : G.adj(v)) {
		if (!marked[w]) {
		    marked[w] = true;
		    edgeTo[w] = v;
		    q.enqueue(w);
		} else if (color[w] == color[v])
		    bipartite = false;
	    }
	}
    }

    public boolean isBipartite() {
	return bipartite;
    }
    
    public boolean hasPathTo(int v) {
	return marked[v];
    }
    
    public Iterable<Integer> pathTo(int s, int v) {
	if (!hasPathTo(v)) {
	    return null;
	}
	MyStackImpl<Integer> path = new MyStackImpl<Integer>();
	while(v != s) {
	    path.push(v);
	    v = edgeTo[v];
	}
	path.push(s);
	return path;
    }
}
