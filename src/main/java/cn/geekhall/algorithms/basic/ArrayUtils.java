package cn.geekhall.algorithms.basic;

public class ArrayUtils {
    public static int getMax(int[] arr){
        return getMax(arr, 0, arr.length - 1);
    }

    /**
     * Get the max value of array in range left to right.
     * @param arr
     * @param left
     * @param right
     * @return
     */
    public static int getMax(int[] arr, int left, int right){
        if (left == right) {
            return arr[left];
        }
        int mid = left + ((right - left) >> 1);
        int leftMax = getMax(arr, left, mid);
        int rightMax = getMax(arr, mid + 1, right);
        return Math.max(leftMax, rightMax);
    }
}
