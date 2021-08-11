# Merge Sort

## Trace
Sample Array: [8,4,23,42,16,15]

- At the beginning, n, which is the length of the array, is bigger than 1. So, n = 6 and mid = 3 which is 42 as an index.
- The left array length will be from 0 to the mid, which is 3. And the right array length will be 3 too.
- Left array = [8,4,23]
- Right array = [42,16,15]
- Then it will be inserted to the same function, which is mergeSort to be sorted.
- Left array = [4,8,23]
- Right array = [15,16,42]
- Then it will be inserted to other function, which is merge.
- The merge will sort the arrays by comparing indexes for each one with the other.
- I will compare each item in the array:
- Left[0] < Right[0] ---> no
- Then the arr[0] = 4
- Left[1] < Right[0] ---> no
- Then the arr[1] = 8
- Left[2] < Right[0] ---> yes
- Then the arr[2] = 15
- Left[2] < Right[1] ---> yes
- Then the arr[3] = 16
- Left[2] < Right[3] ---> no
- Then the arr[3] = 23
- The left array is ended. So, no more compare with it.
- At the end the last element in the right array will be the last element in the array which is 42.
-The final array will be [4,8,15,16,23,42]

![MergeSort](https://github.com/Amara002/data-structures-and-algorithm/blob/master/pseudocode/app/src/main/java/pseudocode/mergeSort/mergesort.png)
