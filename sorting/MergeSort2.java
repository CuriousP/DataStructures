
public class MergeSort2 {

	public void mergesort (int[] arr){

		int [] helper = new int[arr.length];
		mergesort(arr, helper, 0, arr.length-1);
	}

	private void mergesort(int[] arr, int[] helper, int low, int high){
		if(low < high){
			int middle = (low + high)/2;
			mergesort(arr, helper, low, middle);
			mergesort(arr, helper, middle+1, high);
			merge(arr, helper, low, middle, high);
		}
	}

	private void merge(int[] arr, int[] helper, int low, int middle, int high){

		for(int i = low; i <= high; i++){
			helper[i] = arr[i];
		}

		int helperLeft = low;
		int helperRight = middle + 1;
		int current = low;

		while(helperLeft <= middle && helperRight <= high){
			if(helper[helperLeft] < helper[helperRight]){
				arr[current] = helper[helperLeft];
				helperLeft ++;
			}
			else{
				arr[current] = helper[helperRight];
				helperRight ++;
			}

			current ++;
		}

		while(helperLeft <= middle){
			arr[current]= helper[helperLeft];
			current ++;
			helperLeft ++;
		}
	}

}
