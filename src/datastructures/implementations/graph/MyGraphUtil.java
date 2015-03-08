package datastructures.implementations.graph;

import java.util.Scanner;

import datastructures.implementations.graph.MyGraphImpl2.EdgeNode;

public class MyGraphUtil {

    public void initializeGraph(MyGraphImpl2 g, boolean directed) {
	g.nvertices = 0;
	g.nedges = 0;
	g.directed = directed;
	for (int i = 0; i < g.MAXV; i++) {
	    g.degree[i] = 0;
	    g.edges[i] = null;
	}
    }

    public void readGraph(MyGraphImpl2 g, boolean directed) {
	int m, x, y;
	initializeGraph(g, directed);
	Scanner input = new Scanner(System.in);
	g.nvertices = input.nextInt();
	m = input.nextInt();
	for (int i = 0; i < m; i++) {
	    x = input.nextInt();
	    y = input.nextInt();
	    insertEdge(g, x, y, directed);
	}
	input.close();

    }

    public void insertEdge(MyGraphImpl2 g, int x, int y, boolean directed) {
	EdgeNode p = g.new EdgeNode();
	p.weight = 0;
	p.y = y;
	p.next = g.edges[x];
	g.edges[x] = p;
	g.degree[x]++;
	if (!directed)
	    insertEdge(g, y, x, true);
	else
	    g.nedges++;
    }
    
    public void printGraph(MyGraphImpl2 g) {
	EdgeNode p = g.new EdgeNode();
	for(int i = 0; i < g.nvertices; i++) {
	    System.out.print(i+": ");
	    p = g.edges[i];
	    while (p!= null){
		System.out.print(" " + p.y);
		p = p.next;
	    }
	    System.out.println();
	}
    }
}
