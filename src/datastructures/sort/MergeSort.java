package datastructures.sort;

public class MergeSort {

    private int[] helper, numbers;
    private int size;

    public void sort(int[] values) {
	numbers = values;
	size = values.length;
	helper = new int[size];
	mergeSort(0, size - 1);
    }

    private void mergeSort(int start, int end) {
	if (start < end) {
	    int middle = start + (end - start) / 2;
	    // do sorting for values left of middle
	    mergeSort(start, middle);
	    // do sorting for values right of middle
	    mergeSort(middle + 1, end);
	    // merge the results
	    merge(start, middle, end);
	}
    }

    private void merge(int start, int middle, int end) {
	for(int i = start; i <= end; i++) {
	    helper[i] = numbers[i];
	}
	int counter = start;
	int i = start;
	int j = middle + 1;
	while (i <= middle && j <= end) {
	    if (helper[i] < helper[j]) {
		// copy value at i into numbers[counter];
		numbers[counter] = helper[i];
		i++;
	    } else {
		numbers[counter] = helper[j];
		j++;
	    }
	    counter++;
	}
	// copy the rest of the values from i into numbers
	while (i <= middle) {
	    // copy value at i into numbers[counter];
	    numbers[counter] = helper[i];
	    i++;
	    counter++;
	}
	// we don't need to copy the rest of the values after j because they are already in the array as is.
    }
}
