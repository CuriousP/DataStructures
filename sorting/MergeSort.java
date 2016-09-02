
public class MergeSort {

	private int[] tempMergeArr;
	private int[] array;
	private int length;

	public static void main(String a[]) {

		int[] inputArr = { 45, 23, 11, 89, 1, 77, 98, 4, 28, 65, 43 };
		MergeSort mms = new MergeSort();
		mms.sort(inputArr);
		for (int i : inputArr) {
			System.out.print(i);
			System.out.print(" ");
		}
	}

	public void sort(int[] inputArray) {
		this.array = inputArray;
		this.length = inputArray.length;
		this.tempMergeArr = new int[length];
		mergeSort(0, length - 1);

	}

	public void mergeSort(int lowerIndex, int higherIndex) {
		if (lowerIndex < higherIndex) {
			int middle = (higherIndex + lowerIndex) / 2;
			mergeSort(lowerIndex, middle);
			mergeSort(middle + 1, higherIndex);
			merge(lowerIndex, middle, higherIndex);
		}
	}

	public void merge(int lower, int middle, int higher) {
		for (int i = lower; i <= higher; i++) {
			tempMergeArr[i] = array[i];
		}
		int i = lower;
		int j = middle + 1;
		int k = lower;

		while (i <= middle && j <= higher) {
			if (tempMergeArr[i] <= tempMergeArr[j]) {
				array[k] = tempMergeArr[i];
				i++;
			} else {
				array[k] = tempMergeArr[j];
				j++;
			}
			k++;
		}
		while (i <= middle) {
			array[k] = tempMergeArr[i];
			k++;
			i++;
		}
	}

}