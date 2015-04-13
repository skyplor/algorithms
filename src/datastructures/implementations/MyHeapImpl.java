package datastructures.implementations;

/**
 * This is an implementation using arrays and is a MAX HEAP
 * 
 * @author Sky
 *
 */
public class MyHeapImpl {

    int heapsize;
    int[] heap;

    // Parent to Child - Left Child = 2P + 1, Right Child = 2P + 2
    // Child to Parent - Parent = (K - 1)/2
    public MyHeapImpl(int size) {
	heap = new int[size];
    }

    public void add(int i) {
	if (heapsize < heap.length) {
	    heap[heapsize] = i;
	    bubbleUp(heapsize);
	    heapsize++;
	}
    }

    private void bubbleUp(int i) {
	int k = i;
	int p = (k - 1) / 2;

	// Compare current value with parent. If bigger, swap. Else you are done.
	while (p > 0) {
	    if (heap[k] > heap[p]) {
		swap(k, p);
		k = p;
		p = (k - 1) / 2;
	    } else
		break;
	}
    }

    private void swap(int first, int second) {
	int temp = heap[first];
	heap[first] = heap[second];
	heap[second] = temp;
    }

    public int remove() {
	return remove(0);
    }

    public int remove(int i) {
	if (i < heap.length) {
	    int result = heap[i];
	    int leaf = getLastLeaf();
	    heap[i] = leaf;
	    heapsize--;
	    setLastLeaf(Integer.MIN_VALUE);
	    bubbleDown(i);
	    return result;
	}
	return -1;
    }

    private void bubbleDown(int i) {
	// Bubble down starting from index i
	int p = i;
	int l = (2 * p) + 1;
	int r = (2 * p) + 2;
	while (r < heap.length) {
	    // compare 2 children, get the max and compares that with the current
	    int m = getMaxChildren(l, r);
	    if (heap[p] < heap[m]) {
		swap(p, m);
		p = m;
		l = (2 * p) + 1;
		r = (2 * p) + 2;
	    } else
		break;
	}
    }

    private int getMaxChildren(int l, int r) {
	if (heap[l] < heap[r])
	    return r;
	return l;
    }

    private void setLastLeaf(int value) {
	heap[heapsize - 1] = value;

    }

    private int getLastLeaf() {
	return heap[heapsize - 1];
    }

    public int size() {
	return heapsize;
    }
}
