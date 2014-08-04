package datastructures.implementations.symboltable;

public class LinearProbingHashST<K, V> {
    private int N;
    private int M;
    private K[] keys;
    private V[] vals;
    
    public LinearProbingHashST() {
	keys = (K[]) new Object[M];
    }
}
