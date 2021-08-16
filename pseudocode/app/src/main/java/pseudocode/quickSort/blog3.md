# Quick Sort 

***QuickSort is a Divide and Conquer algorithm. It picks an element as pivot and partitions the given array around the picked pivot. I picked last element as pivot***

## code 
` public void quickSort(int[] arr, int left, int right){`<br>
      `  if(arr.length < 2)`<br>
          `  return;`<br>
       `if(left < right){` <br>
         `// Partition the array by setting the position of the pivot value` <br>
         `   int position = partition(arr, left, right);` <br>
         `   // Sort the left` <br>
          `  quickSort(arr, left, position - 1);` <br>
          `  // Sort the right` <br>
         `   quickSort(arr, position + 1, right);`<br>
        `}`<br>
  `  }`<br>

  `  public int partition(int[] arr, int left, int right){`<br>
        `int pivot = arr[right];`<br>
        `int low = left - 1;` <br>
        `for(int i = left; i < right; i++){`<br>
           ` if ( arr[i] <= pivot){`<br>
               ` low ++;`<br>
              `  swap(arr, i, low);`<br>
           ` }`<br>
       ` }`<br>
      `  swap(arr, right, low + 1);`<br>
       ` return low + 1;`<br>
    `}`<br>
    `public void swap(int[] arr, int i, int low){`<br>
        `int temp;`<br>
        `temp = arr[i];`<br>
      `  arr[i] = arr[low];`<br>
        `arr[low] = temp;`<br>
    `}`<br>

## Tracing
***Sample Array: [8,4,23,42,16,15]***<br/>

* Let's suppose we pick 8 as the pivot for simplicity
* We'll first put all elements less than 8 in the first position of the array: {4,8, 15, 16, 23, 42}
* We'll then repeat it for the left sub-array {4}, taking 4 as the pivot
* There are no elements less than 4
* We apply quicksort on the sub-array in the right of the pivot, i.e. {4}
* This sub-array consists of only one sorted element
* We continue with the right part of the original array, {15, 16, 23, 42} until we get the final ordered array
* Big O , time: O(n log n), space:O(1)

![quickSort](https://github.com/Amara002/data-structures-and-algorithm/blob/quick-sort/pseudocode/app/src/main/java/pseudocode/quickSort/quickSort.png)










