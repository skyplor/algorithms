package datastructures.implementations;

public class MyGraphImpl1
{
	private final int V;
	private int E;
	private MyLinkedListImpl<Integer>[] adj;
	private int[] edgeTo;
	private boolean[] marked;

	@SuppressWarnings("unchecked")
	public MyGraphImpl1(int V)
	{
		this.V = V;
		this.E = 0;
		adj = (MyLinkedListImpl<Integer>[]) new MyLinkedListImpl[V];
		for (int i = 0; i < V; i++)
		{
			adj[i] = new MyLinkedListImpl<Integer>();
		}
		this.edgeTo = new int[V];
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

	public Iterable<Integer> adj(int v)
	{
		return adj[v];
	}

	public String toString()
	{
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < V; i++)
		{
			sb.append(i + ": ");
			if (adj[i] != null)
			{
				sb.append(adj[i] + "\n");
			}
		}
		return sb.toString();
	}

	public boolean BFS(int s, int w)
	{
		boolean[] marked = new boolean[V()];
		MyQueueImpl<Integer> queue = new MyQueueImpl<Integer>();
		marked[s] = true;
		queue.enqueue(s);
		while (queue.size() > 0)
		{
			int v = queue.dequeue();
			if (v == w)
				return true;
			for (int i : adj(v))
			{
				if (!marked[i])
				{
					edgeTo[i] = v;
					marked[i] = true;
					queue.enqueue(i);
				}
			}

		}
		return false;
	}

	public int BFS(int s)
	{
		int count = 0;
		MyQueueImpl<Integer> queue = new MyQueueImpl<Integer>();
		boolean[] marked = new boolean[V];
		marked[s] = true;
		queue.enqueue(s);
		while (queue.size() > 0)
		{
			int v = queue.dequeue();
			for (int i : adj(v))
			{
				if (!marked[i])
				{
					marked[i] = true;
					count++;
					queue.enqueue(i);
				}
			}
		}
		return count;
	}

	public boolean hasPathTo(int s)
	{
		return marked[s];
	}

	public Iterable<Integer> pathTo(int s, int w)
	{
		if (!hasPathTo(s) || !hasPathTo(w))
			return null;
		MyStackImpl<Integer> path = new MyStackImpl<Integer>();
		while (w != s)
		{
			path.push(w);
			w = edgeTo[w];
		}
		path.push(s);
		return path;
	}

	public boolean DFS(int v, int w)
	{
		if (v < 0 || v >= V || w < 0 || w >= V)
			return false;
		if (v == w)
			return true;
		boolean[] marked = new boolean[V];
		marked[v] = true;
		for (int i : adj(v))
		{
			if (!marked[i])
			{
				edgeTo[i] = v;
				return DFS(i, w);
			}
		}
		return false;
	}
}