package datastructures.implementations.graph;

public class MyGraphImpl2 {

    public class EdgeNode {
	int y;
	int weight;
	EdgeNode next;
    }

    public final int MAXV = 10;
    
    EdgeNode[] edges = new EdgeNode[MAXV+1];
    int[] degree = new int[MAXV+1];
    int nvertices;
    int nedges;
    boolean directed;
}

