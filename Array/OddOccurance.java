
public class OddOccurance {
	
	int getOddOccurence(int arr[], int arr_size)
	{
		int i;
        int res = 0;
        for (i = 0; i < arr_size; i++) 
        {
            res = res ^ arr[i];
        }
        return res;
	}

	
	public static void main(String[] args) {
		OddOccurance occur = new OddOccurance();
        int arr[] = new int[]{21, 31, 51, 41, 51, 21, 41, 31, 51, 21, 41, 41, 21, 51, 51};
        int n = arr.length;
        System.out.println(occur.getOddOccurence(arr, n));
    
	}	

	}


