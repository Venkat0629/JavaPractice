package assignment;

import java.util.*;

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
