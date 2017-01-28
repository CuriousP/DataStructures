// Reverse an array

public void reversArray(int [] arr){

if (arr == null)
return;
for(int i = 0; i< arr.length/2; i++)
{
 int j = arr.length - 1- i;
 int temp = arr[i];
 arr [i] = arr[j];
 arr[j] = temp;
}
}
