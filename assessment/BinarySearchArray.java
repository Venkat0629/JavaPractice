package assessment;

public class BinarySearchArray {
    public static void main(String[] args) {
        int[] arr = {-1, 0, 2, 5, 10, 15};
        int target = 6;
        System.out.println("Target element: " + target + " is at index: " + binarySearch(arr, target));
    }

    public static int binarySearch(int[] arr, int target) {
        int l = 0, r = arr.length - 1;
        while (l < r) {
            int mid = (l + r) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] > arr[l]) {
                l = mid;
            } else {
                r = mid - 1;
            }
        }
        return -1;
    }
}

