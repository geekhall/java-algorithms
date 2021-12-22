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

    /**
     * 归并排序
     * @param arr
     */
    public static void mergeSort(int[] arr){
        if (arr == null || arr.length < 2) {
            return;
        }
        mergeSort(arr, 0, arr.length - 1);
    }
    public static void mergeSort(int[] arr, int left, int right){
        if (left == right) {
            return;
        }

        int mid = left + ( (right - left) >> 1);
        mergeSort(arr, left, mid);
        mergeSort(arr, mid + 1, right);
        merge(arr, left, mid, right);
    }
    public static void merge(int[] arr, int l, int m, int r){
        int[] help = new int[r - l + 1];
        int i = 0;
        int p1 = l;
        int p2 = m + 1;
        // 将左半部分和右半部分中当前指针指向的较小值拷贝至help数组。
        while(p1 <= m && p2 <= r) {
            help[i++] = arr[p1] <= arr[p2] ? arr[p1++] : arr[p2++];
        }
        // 将左半部分或者右半部分中剩余还未拷贝的部分复制到help中。
        while(p1 <= m) {
            help[i++] = arr[p1++];
        }
        while(p2 <= r) {
            help[i++] = arr[p2++];
        }

        for (i=0; i< help.length; i++) {
            arr[l + i] = help[i];
        }
    }

    /**
     * Print an array.
     * @param arr
     */
    public static void printArr(int[] arr){
        for (int i =0; i<arr.length; i++){
            System.out.print(arr[i]);
            if (i == arr.length -1) {
                System.out.println("");
            } else {
                System.out.print(",");
            }
        }
    }

    /**
     * Insertion Sort method for array.
     * @param arr
     */
    public static void insertionSort(int[] arr) {
        int i, j;
        for (j=1; j<arr.length; j++){
            int key = arr[j];   // 比较基准关键字
            i = j - 1;
            while (i >= 0 && arr[i] > key){ // 左边的已排序数组从右向左与key依次比较，若大于key则右移
                arr[i+1] = arr[i];          // 右移
                i = i - 1;
            }
            arr[i+1] = key;
        }
    }

    /**
     *
     * @param arr
     */
    public static void bubbleSort(int[] arr){
        int temp;
        for (int i=0; i<arr.length; i++) {
            for (int j = arr.length; j>i+1; j--) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
    }

}
