package assignment;

/*

Initialization and Array Setup:

segmentTree array: This array is used to represent the segment tree. Its size is 2 * n, where n is the length of the input array nums. The first n elements are used to store the original array nums, and the remaining elements are used for internal nodes of the segment tree.
n variable: Stores the length of the input array nums.
Building the Segment Tree (build method):

The method initializes the segment tree using the input array nums.
It first copies nums into the second half of segmentTree (from index n to 2 * n - 1).
Then, it iterates backwards from n - 1 to 1 and calculates each internal node of the segment tree by summing its two children.
Range Sum Query (sumRange method)
Adjusting Indices:

The method adjusts the indices l and r to fit within the segment tree array by adding n to both.
This transformation is necessary because the segment tree is represented in a linear array where the original array nums is stored from index n to 2 * n - 1.
Sum Calculation:

It iteratively computes the sum of elements between indices l and r:
If l is odd (indicating it's the right child of its parent in the segment tree), it adds segmentTree[l] to the sum and moves l to the right (increments l).
If r is even (indicating it's the left child of its parent), it adds segmentTree[r] to the sum and moves r to the left (decrements r).
After adding values, l and r are halved (l /= 2 and r /= 2) to move up the segment tree towards the root.
Iteration Continues:

This process continues until l is greater than r, ensuring all relevant segments are covered.
 */
public class SegmentTree {
    int[] segmentTree;
    int n;

    public SegmentTree(int[] nums) {
        n = nums.length;
        segmentTree = new int[2 * n];
        build(nums);
    }

    private void build(int[] nums) {
        for (int i = n, j = 0; i < 2 * n; i++, j++) {
            segmentTree[i] = nums[j];
        }
        for (int i = n - 1; i > 0; --i) {
            segmentTree[i] = segmentTree[2 * i] + segmentTree[2 * i + 1];
        }
    }

    public int sumRange(int l, int r) {
        l += n;
        r += n;
        int sum = 0;
        while (l <= r) {
            if ((l % 2) == 1) {
                sum += segmentTree[l];
                l++;
            }
            if ((r % 2) == 0) {
                sum += segmentTree[r];
                r--;
            }
            l /= 2;
            r /= 2;
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 7, 9, 11};
        SegmentTree st = new SegmentTree(nums);
        System.out.println("Sum of elements in range [1, 3] is: " + st.sumRange(1, 3));
    }
}
