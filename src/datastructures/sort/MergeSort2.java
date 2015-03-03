package datastructures.sort;

import datastructures.implementations.MyQueueImpl;

public class MergeSort2 {

    public static void main(String[] args) {
	// TODO Auto-generated method stub

    }

    public void sort(int[] a) {
	mergesort(a, 0, a.length - 1);
    }

    private void mergesort(int[] a, int begin, int end) {
	if (begin < end) {
	    int middle = (begin + end) / 2;
	    mergesort(a, begin, middle);
	    mergesort(a, middle + 1, end);
	    merge(a, begin, middle, end);
	}
    }

    private void merge(int[] a, int begin, int middle, int end) {
	int k = begin;
	MyQueueImpl<Integer> q1 = new MyQueueImpl<Integer>();
	MyQueueImpl<Integer> q2 = new MyQueueImpl<Integer>();
	for (int i = begin; i <= middle; i++)
	    q1.enqueue(a[i]);
	for (int j = middle + 1; j <= end; j++)
	    q2.enqueue(a[j]);

	while (!(q1.isEmpty() || q2.isEmpty())) {
	    int first = q1.peek();
	    int second = q2.peek();
	    if (first <= second)
		a[k++] = q1.dequeue();
	    else
		a[k++] = q2.dequeue();
	}
	while (!q1.isEmpty())
	    a[k++] = q1.dequeue();
	while (!q2.isEmpty())
	    a[k++] = q2.dequeue();
    }
}
