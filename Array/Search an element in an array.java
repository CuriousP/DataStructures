// Program to search an element in an sorted array
//Binary serarch recurcive algorithm

public int searchElement(int [] arr), int d)
{

if(arr == null || arr.length == 0)
{
  return -1;
}
  int data = search(arr, 0, arr.length-1, d)
  return data;
}

private int search(int[] arr, int low, int high, int d)
{
int middle = arr.length/2;

if(arr[middle] == d)
{
  return middle;
}

if(d < arr[middle])
{
  search(arr, low, middle, d)
}

if(d> arr[middle])
{
  search(arr, middle, high, d)
}

return -1; // return -1 if element is not present in an array

}// End of search method
