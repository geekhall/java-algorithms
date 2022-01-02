package cn.geekhall.algorithms.basic;

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
            int largest = left + 1 < size && arr[left + 1] > arr[left] ? left + 1 : left;
            largest = arr[largest] > arr[index] ? largest : index;
            if (largest == index) {
                break;
            }
            swap(arr, largest, index);
            index = largest;
            left = index * 2 + 1;

        }
    }

}
