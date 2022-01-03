package cn.geekhall.algorithms.basic;

import java.util.PriorityQueue;

/**
 * HeapUtils.java
 *
 * @author yiny
 */
public class HeapUtils {
    /**
     * 将处于index位置上的某个数插入数组arr中，使其满足堆特性。
     * @param arr
     * @param index
     */
    public static void heapInsert(int[] arr, int index) {
        while (arr[index] > arr[(index - 1)/2]) {
            swap(arr, index, (index-1)/2);
            index = (index - 1) / 2;
        }
    }

    /**
     * 交换数组arr中pos1和pos2位置的值。
     * @param arr
     * @param pos1
     * @param pos2
     */
    public static void swap(int[] arr, int pos1, int pos2){
        arr[pos1] = arr[pos1] ^ arr[pos2];
        arr[pos2] = arr[pos1] ^ arr[pos2];
        arr[pos1] = arr[pos1] ^ arr[pos2];
    }

    /**
     * 打印数组内容
     * @param arr
     */
    public static void printHeap(int[] arr){
        System.out.print("[");
        for (int i=0; i<arr.length; i++ ){
            System.out.print(arr[i]);
            if ( i == arr.length - 1) {
                System.out.println("]");
            } else {
                System.out.print(", ");
            }
        }
    }

    /**
     * 堆化，某个数在index位置，判断其是否满足大根堆条件并向下移动。
     * @param arr
     * @param index
     * @param size
     */
    public static void heapify(int[] arr, int index, int size) {
        int left = index * 2 + 1;
        while (left < size) { // 下方还有孩子的时候
            int largest = left + 1 < size && arr[left + 1] > arr[left] ? left + 1 : left;   // 取左右孩子的较大值，将其下标赋值给largest。
            largest = arr[largest] > arr[index] ? largest : index;                          // 取index位置元素与左右孩子中较大的元素比较，将其中较大者的下标赋值给largest。
            if (largest == index) {
                break;
            }
            swap(arr, largest, index);
            index = largest;        // 新的index
            left = index * 2 + 1;   // 新的左孩子
        }
    }

    /**
     * 堆排序
     * @param arr
     */
    public static void heapSort(int[] arr){
        if (arr == null || arr.length < 2){
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            heapInsert(arr, i);
        }
        int heapSize = arr.length;
        swap(arr, 0, --heapSize);
        while(heapSize > 0) {
            heapify(arr, 0, heapSize);
            swap(arr, 0, --heapSize);
        }
    }

    /**
     * 题目：给定一个几乎有序的数组（指数组中每个元组排序后移动的距离不会超过k，并且k相对于数组来说比较小）
     *      选择一个合适的排序算法进行排序。
     * @param arr
     * @param k
     */
    public static void sortedArrDistanceLessThanK(int[] arr, int k) {
//        PriorityQueue<Integer> heap = new PriorityQueue<>();
//        heap.add(8);
//        heap.add(7);
//        heap.add(4);
//        heap.add(2);
//        heap.add(9);
//        heap.add(5);
//
//        while (!heap.isEmpty()) {
//            System.out.println(heap.poll());
//        }
        PriorityQueue<Integer> heap = new PriorityQueue<>();
        int index = 0;
        for (; index <= Math.min(arr.length, k); index++) {
            heap.add(arr[index]);
        }
        int i = 0;
        for (; index < arr.length; i++, index++) {
            heap.add(arr[index]);
            arr[i] = heap.poll();
        }
        while (!heap.isEmpty()) {
            arr[i++] = heap.poll();
        }
    }

}
