package datastructures.sort;

public class QuickSort {

    int[] numbers;
    int size;

    public void sort(int[] values) {
	if (values == null || values.length == 0)
	    return;
	numbers = values;
	size = values.length;
	quickSort(0, size - 1);
    }

    private void quickSort(int start, int end) {
	int pivot = numbers[(end + start) / 2];
	int i = start;
	int j = end;
	while (i <= j) {
	    while (numbers[i] < pivot)
		i++;
	    while (numbers[j] > pivot)
		j--;
	    // After the above while loops, we would have found the i that is more than pivot and j that is less than pivot.
	    // So we check if the i is less than or equal to j, i.e. the value that is more than pivot is on the left of the value that is less than pivot. 
	    // If it is, we do a swap.
	    if (i <= j) {
		exchange(i, j);
		i++;
		j--;
	    }
	}
	// recurse this if i hasn't reached the end and if j hasn't reached the start
	if (i < end)
	    quickSort(i, end);
	if (j > start)
	    quickSort(start, j);
    }

    private void exchange(int first, int second) {
	int temp = numbers[first];
	numbers[first] = numbers[second];
	numbers[second] = temp;
    }
}
