package datastructures.implementations.symboltable;

public class LinearProbingHashST<K, V> {
    private int N;
    private int M = 16;
    private K[] keys;
    private V[] vals;

    @SuppressWarnings("unchecked")
    public LinearProbingHashST(int M) {
	this.M = M;
	keys = (K[]) new Object[M];
	vals = (V[]) new Object[M];
    }

    private int hash(K key) {
	return (key.hashCode() & 0x7fffffff) % M;
    }

    private void resize(int cap) {
	LinearProbingHashST<K, V> t = new LinearProbingHashST<K, V>(cap);
	for (int i = 0; i < M; i++)
	    if (keys[i] != null)
		t.put(keys[i], vals[i]);
	keys = t.keys;
	vals = t.vals;
	M = t.M;
    }

    public void put(K key, V val) {
	if (N >= M / 2)
	    resize(2 * M);
	int i;
	for (i = hash(key); keys[i] != null; i = (i + 1) % M)
	    if (keys[i].equals(key)) {
		vals[i] = val;
		return;
	    }
	keys[i] = key;
	vals[i] = val;
	N++;
    }

    public V get(K key) {
	for (int i = hash(key); keys[i] != null; i = (i + 1) % M)
	    if (keys[i].equals(key))
		return vals[i];
	return null;
    }

    public void delete(K key) {
	if (!contains(key))
	    return;
	int i = hash(key);
	while (!key.equals(keys[i]))
	    i = (i + 1) % M;
	keys[i] = null;
	vals[i] = null;
	i = (i + 1) % M;
	while (keys[i] != null) {
	    K keyToRedo = keys[i];
	    V valToRedo = vals[i];
	    keys[i] = null;
	    vals[i] = null;
	    N--;
	    put(keyToRedo, valToRedo);
	    i = (i + 1) % M;
	}
	N--;
	if (N > 0 && N == M / 8)
	    resize(M / 2);
    }

    private boolean contains(K key) {
	for (int i = hash(key); keys[i] != null; i = (i + 1) % M)
	    if (keys[i].equals(key))
		return true;;
	return false;
    }
}
