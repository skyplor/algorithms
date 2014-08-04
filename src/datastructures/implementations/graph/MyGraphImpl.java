package datastructures.implementations.graph;

import datastructures.implementations.MyLinkedListImpl;
import datastructures.implementations.MyQueueImpl;

public class MyGraphImpl
{
	private final int V;
	private int E;
	MyLinkedListImpl<Integer>[] adj;

	@SuppressWarnings("unchecked")
	public MyGraphImpl(int V)
	{
		this.V = V;
		this.E = 0;
		adj = (MyLinkedListImpl<Integer>[]) new MyLinkedListImpl[V];
		for (int i = 0; i < V; i++)
		{
			adj[i] = new MyLinkedListImpl<Integer>();
		}
	}

	public int V()
	{
		return V;
	}

	public int E()
	{
		return E;
	}

	public void addEdge(int v, int w)
	{
		if (v < 0 || v >= V || w < 0 || w >= V)
			return;
		adj[v].add(w);
		adj[w].add(v);
		E++;
	}

	public void deleteEdge(int v, int w)
	{
		if (v < 0 || v >= V || w < 0 || w >= V)
			return;
		adj[v].remove(w);
		adj[w].remove(v);
		E--;
	}

	public boolean BFS(int s, int d)
	{
		MyQueueImpl<Integer> queue = new MyQueueImpl<Integer>();
		boolean found = false;
		boolean[] marked = new boolean[this.V()];
		marked[s] = true;
		queue.enqueue(s);
		while (queue.size() > 0)
		{
			int temp = queue.dequeue();
			System.out.println("Dequeued: " + temp);
			if (temp == d)
				return true;
			for (int w : this.adj(temp))
			{
				if (!marked[w])
				{
					marked[w] = true;
					queue.enqueue(w);
					System.out.println("Enqueued: " + w);
				}
			}
		}
		return found;
	}

	public int BFS(int s)
	{
		int count = 0;
		boolean[] marked = new boolean[V()];
		MyQueueImpl<Integer> queue = new MyQueueImpl<Integer>();
		marked[s] = true;
		queue.enqueue(s);
		while (queue.size() > 0)
		{
			int temp = queue.dequeue();
			for (int w : adj(temp))
			{
				if (!marked[w])
				{
					queue.enqueue(w);
					count++;
					marked[w] = true;
				}
			}
		}
		return count;
	}

	public Iterable<Integer> adj(int v)
	{
		if (v < 0 || v >= V)
			return null;
		return adj[v];
	}

	public String toString()
	{
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < adj.length; i++)
		{
			sb.append(i + ": ");
			if (adj[i] != null)
				sb.append(adj[i] + "\n");
		}
		return sb.toString();
	}

	public static void main(String[] args)
	{

		MyGraphImpl graph = new MyGraphImpl(10);
		graph.addEdge(1, 5);
		graph.addEdge(0, 2);
		graph.addEdge(4, 6);
		graph.addEdge(1, 9);
		graph.deleteEdge(2, 0);
		System.out.println(graph);
		System.out.println("Is 1 connected to 5? " + graph.BFS(1, 5));
		System.out.println("Is 1 connected to 9? " + graph.BFS(1, 9));
		System.out.println("Is 2 connected to 0? " + graph.BFS(2, 0));
		System.out.println("Is 2 connected to 0? " + graph.BFS(3, 0));
		System.out.println("How many vertices are connected to 1? " + graph.BFS(1));
		System.out.println("How many vertices are connected to 2? " + graph.BFS(2));
	}

}
