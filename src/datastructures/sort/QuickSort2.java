package datastructures.sort;

public class QuickSort2 {

    public void sort(int[] a) {
	if (a != null)
	    sort(a, 0, a.length - 1);
    }

    private void sort(int[] a, int low, int high) {
	if (low < high) {
	    int pivot = partition(a, low, high);
	    sort(a, low, pivot - 1);
	    sort(a, pivot + 1, high);
	}
    }

    private int partition(int[] a, int low, int high) {
	int pivot = high;
	int firsthigh = low;
	for (int i = low; i < high; i++) {
	    if (a[i] <= a[pivot]) {
		swap(a, i, firsthigh);
		firsthigh++;
	    }
	}
	swap(a, firsthigh, pivot);
	return firsthigh;
    }

    private void swap(int[] a, int first, int second) {
	int temp = a[first];
	a[first] = a[second];
	a[second] = temp;
    }
}
