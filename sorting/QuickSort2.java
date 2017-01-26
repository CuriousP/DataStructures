// Quick Sort Algorithm

public void quickSort(int [] arr, int left, int right)
{
  int index = partition(arr, left, right);
  if(left < index -1)
  {
    quickSort(arr, left, index -1);
  }
  if(index < right)
  {
    quickSort(arr, index, right)
  }
}// End of quickSort method

private int partition(int[] arr, int left, int right)
{
int pivot = arr[(left + right)/2];

while (left <= right)
{
  while (arr[left] < pivot)
  {
    left++;
  }
  while(arr[right]> pivot)
  {
    right--;
  }
  if(left<= right)
  {
    int temp = arr[left];
    arr[left] = arr[right];
    arr[right] = temp;
  }
}// End of outer while loop
return left;

} // End of partion method
