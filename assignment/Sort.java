package assignment;

import java.util.*;
/*

Explanation of Each Sorting Algorithm
Bubble Sort (bubbleSort function):

Explanation: Bubble Sort is a simple sorting algorithm that repeatedly steps through the list, compares adjacent elements, and swaps them if they are in the wrong order. It continues iterating until the list is sorted.
Time Complexity (TC): O(n^2) in the worst and average case, where n is the number of elements.
Space Complexity (SC): O(1) because only a constant amount of extra space is needed.
Quick Sort (quickSort function):

Explanation: Quick Sort is a divide-and-conquer algorithm. It picks an element as a pivot and partitions the array around the pivot, such that elements smaller than the pivot are on its left, and elements greater than the pivot are on its right. It then recursively sorts the sub-arrays.
Time Complexity (TC): O(n log n) in the average case and O(n^2) in the worst case (when the pivot is consistently a bad choice, like in a sorted array).
Space Complexity (SC): O(log n) due to the recursive calls on the stack, but it can go up to O(n) due to partitioning.
Merge Sort (mergeSort and merge functions):

Explanation: Merge Sort also uses a divide-and-conquer approach. It divides the array into two halves, recursively sorts each half, and then merges the two sorted halves into one sorted array.
Time Complexity (TC): O(n log n) in all cases (worst, average, and best).
Space Complexity (SC): O(n) due to the additional memory used for the temporary arrays during the merge process.
Code Explanation
Main Method (main function):

Initializes an array arr with integers.
Clones the array and sorts it using Bubble Sort, Quick Sort, and Merge Sort algorithms, printing the results.
Utility Methods:

bubbleSort: Implements the Bubble Sort algorithm.
quickSort: Implements the Quick Sort algorithm using recursion.
mergeSort: Implements the Merge Sort algorithm using recursion.
partition: Partitions the array for Quick Sort.
merge: Merges two sorted arrays into one sorted array for Merge Sort.
swap: Swaps elements in the array.
Test Cases (TC) and Space Complexity (SC)
Test Cases:

The code sorts an array with integers, showing how each sorting algorithm performs on the same input.
Verifies correctness by comparing the sorted output with manually verified results.
Space Complexity (SC):

Each sorting algorithm has different space complexities:
Bubble Sort: O(1)
Quick Sort: O(log n) to O(n)
Merge Sort: O(n)
Space is primarily used for recursive calls (stack space) in Quick Sort and temporary arrays in Merge Sort.
 */

public class Sort {
    public static void main(String[] args) {
        int[] arr = new int[]{2, -1, 0, 5, -3, 7, 4, 111, 10, 11};
        System.out.println("Array: " + Arrays.toString(arr));

        //BubbleSort
        int[] bubbleSort = bubbleSort(arr.clone());
        System.out.println("Bubble Sort: " + Arrays.toString(bubbleSort));

        //QuickSort
        int[] quickSort = quickSort(arr.clone(), 0, arr.length - 1);
        System.out.println("Quick Sort: " + Arrays.toString(quickSort));

        //MergeSort
        int[] mergeSort = mergeSort(arr.clone(), 0, arr.length - 1);
        System.out.println("Merge Sort: " + Arrays.toString(mergeSort));

    }

    static int[] bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                }
            }
        }
        return arr;
    }

    static int[] quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
            return arr;
        }
        return arr;
    }

    static int[] mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = (right + left) / 2;
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);
            merge(arr, left, mid, right);
            return arr;
        }
        return arr;
    }

    static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                swap(arr, ++i, j);
            }
        }
        swap(arr, i + 1, high);
        return i + 1;
    }

    static void merge(int[] arr, int left, int mid, int right) {
        int l = mid - left + 1;
        int r = right - mid;
        int[] leftArr = new int[l];
        int[] rightArr = new int[r];

        for (int i = 0; i < l; i++) {
            leftArr[i] = arr[left + i];
        }
        for (int i = 0; i < r; i++) {
            rightArr[i] = arr[mid + 1 + i];
        }
        int i = 0, j = 0, k = left;
        while (i < l && j < r) {
            if (leftArr[i] <= rightArr[j]) {
                arr[k] = leftArr[i];
                i++;
            } else {
                arr[k] = rightArr[j];
                j++;
            }
            k++;
        }
        while (i < l) {
            arr[k] = leftArr[i];
            i++;
            k++;
        }
        while (j < r) {
            arr[k] = rightArr[j];
            j++;
            k++;
        }
    }

    static void swap(int[] arr, int i, int j) {
        int tmp = arr[j];
        arr[j] = arr[i];
        arr[i] = tmp;
    }
}
