Sorting

Sorting algorithms are techniques used to organize elements of a collection (such as an array or a list)
in a specific order, usually ascending or descending.

One of the simplest, although inefficient, algorithms is selection sort.
This algorithm aims to always move the smallest value in the array to the first position
(or the largest depending on the required order), then the second smallest value to the second position,
and so on until the entire array is sorted. Below is the algorithm in pseudocode:
ALGORITHM SelectionSort(A[0..N-1])
FOR i from 0 to N-2 DO
minIndex = i
FOR j from i+1 to N-1 DO
IF A[j] < A[minIndex] THEN
minIndex = j
END IF
END FOR
IF minIndex != i THEN
Swap A[i] <-> A[minIndex]

END IF
END FOR
END ALGORITHM

Explanation:

1. For each position i in the array, we assume that the smallest element is in that position
(minIndex = i).

2. We traverse the rest of the array (j = i+1 to N-1) to find the smallest element.

3. If a smaller element is found, minIndex is updated.

4. After traversing the entire array, we swap the element at i with the smallest one found (minIndex).

5. The process is repeated until the array is sorted.

In this practical activity, you will create a program that, upon receiving an array of integers,
is able to sort an array of integers in ascending order, applying the selection sorting algorithm described above.
