package datastructures.implementations.symboltable;

public class HashMap_SeparateChaining<K, V> {
    int count;
    Node<K, V>[] buckets;
    final int LENGTH = 10;

    class Node<Key, Value> {
	Key key;
	Value val;
	Node<Key, Value> next;

	public Node(Key k, Value v) {
	    key = k;
	    val = v;
	}
    }

    @SuppressWarnings("unchecked")
    public HashMap_SeparateChaining() {
	buckets = (Node<K, V>[]) new Node[LENGTH];
    }

    // Methods for hashmap includes:
    // 1. put(Key, Value)
    // 2. get(Key)
    // 3. remove(Key);
    // 4. size();
    // 5. hash method to hash key to a value (Private)

    public void put(K key, V value) {
	int index = hash(key);
	Node<K, V> n = new Node<K, V>(key, value);
	if (buckets[index] == null)
	    buckets[index] = n;
	else {
	    if (buckets[index].key == key){
		buckets[index].val = value;
		return;
	    }
	    Node<K, V> cur = buckets[index];
	    while (cur.next != null) {
		cur = cur.next;
		if (cur.key == key) {
		    cur.val = value;
		    count++;
		    return;
		}
	    }
	    cur = n;
	}
	count++;
    }

    private int hash(K key) {
	// int result = Math.abs(key.hashCode()) % LENGTH;
	// OR
	int result = (key.hashCode() & 0x7fffffff) % LENGTH;
	return result;
    }

    public V get(K key) {
	int index = hash(key);
	if (buckets[index] != null) {
	    if (buckets[index].key == key)
		return buckets[index].val;
	    else {
		Node<K, V> cur = buckets[index];
		while (cur.next != null) {
		    cur = cur.next;
		    if (cur.key == key)
			return cur.val;
		}
	    }
	}
	return null;
    }

    public boolean remove(K key) {
	int index = hash(key);
	if (buckets[index] != null) {
	    if (buckets[index].key == key) {
		buckets[index] = buckets[index].next;
		count--;
		return true;
	    }
	    Node<K, V> cur = buckets[index];
	    while (cur.next != null) {
		if (cur.next.key == key) {
		    cur.next = cur.next.next;
		    count--;
		    return true;
		}
	    }
	}
	return false;
    }

    public int size() {
	return count;
    }
}