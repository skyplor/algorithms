package datastructures.implementations.symboltable;

public class SeparateChainingHashST<K, V> {
    private int M;
    private SequentialSearchST<K, V>[] st;

    public SeparateChainingHashST() {
	this(997);
    }

    @SuppressWarnings("unchecked")
    public SeparateChainingHashST(int M) {
	this.M = M;
	st = (SequentialSearchST<K, V>[]) new SequentialSearchST[M];
	for (int i = 0; i < M; i++) {
	    st[i] = new SequentialSearchST<K, V>();
	}
    }

    public int hash(K key) {
	return (key.hashCode() & 0x7fffffff) % M;
    }

    public V get(K key) {
	return (V) st[hash(key)].get(key);
    }

    public void put(K key, V val) {
	st[hash(key)].put(key, val);
    }
}
