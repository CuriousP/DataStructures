
public class QuickSort {

	private int array[];
	private int length;

	public void sort(int inputArray[]) {

		if (inputArray == null || inputArray.length == 0) {
			return;
		}

		this.array = inputArray;
		length = inputArray.length;

		quickSort(0, length - 1);

	}

	private void quickSort(int lower, int higher) {

		int i = lower;
		int j = higher;
		int pivotIndex = (lower + higher) / 2;
		int pivot = array[pivotIndex];

		while (i <= j) {
			while (array[i] < pivot) {
				i++;
			}

			while (array[j] > pivot) {
				j--;
			}

			if (i <= j) {
				swap(i, j);
				i++;
				j--;
			}
		}

		if (lower < j) {
			quickSort(lower, j);
		}
		if (i < higher) {
			quickSort(i, higher);
		}
	}// End of quickSort

	private void swap(int i, int j) {
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}

	public static void main(String arrgs[]) {

		try {
			QuickSort sorter = new QuickSort();
			int input[] = { 24, 2, 45, 20, 56, 75, 2, 56, 99, 53, 12 };
			sorter.sort(input);
			for (int i = 0; i < 11; i++) {
				System.out.print(input[i]);
				System.out.print(" ");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}
}
