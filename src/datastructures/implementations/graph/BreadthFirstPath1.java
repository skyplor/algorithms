package datastructures.implementations.graph;

import java.util.Stack;

import datastructures.implementations.MyQueueImpl;

public class BreadthFirstPath1 {
    int s;
    int[] edgeTo;
    boolean[] marked;

    public BreadthFirstPath1(MyGraph G, int s) {
	this.s = s;
	edgeTo = new int[G.V()];
	marked = new boolean[G.V()];
	BFS(G, s);
    }

    public void BFS(MyGraph G, int s) {
	MyQueueImpl<Integer> q = new MyQueueImpl<Integer>();
	marked[s] = true;
	q.enqueue(s);
	while (!q.isEmpty()) {
	    int v = q.dequeue();
	    for (int w : G.adj(v)) {
		if (!marked[w]) {
		    edgeTo[w] = v;
		    marked[w] = true;
		    q.enqueue(w);
		}
	    }
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
