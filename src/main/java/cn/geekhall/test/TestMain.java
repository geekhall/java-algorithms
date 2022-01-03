package cn.geekhall.test;

import cn.geekhall.algorithms.basic.ArrayUtils;
import cn.geekhall.algorithms.basic.HeapUtils;
import cn.geekhall.algorithms.basic.RunnableTest;

public class TestMain {
    /**
     * Array test method.
     */
    public static void arrayTest(){
        int[] arr = new int[] {3,2,5,6,9,8,1};
        int maxValue = ArrayUtils.getMax(arr);
        System.out.println(maxValue);
        ArrayUtils.printArr(arr);
        ArrayUtils.insertionSort(arr);
        ArrayUtils.printArr(arr);
    }

    /**
     * Thread test method.
     */
    public static void threadTest(){
        RunnableTest rt = new RunnableTest();
        rt.run();
    }

    /**
     * Heap test method.
     */
    public static void heapTest(){
        int[] arr = new int[]{1,5,3,7,2,8};
        HeapUtils.printHeap(arr);
        HeapUtils.heapSort(arr);
        HeapUtils.printHeap(arr);
//        HeapUtils.heapInsert(arr, 6);
        HeapUtils.swap(arr, 1,3);
        HeapUtils.printHeap(arr);
        System.out.println("================");
        HeapUtils.sortedArrDistanceLessThanK(arr,4);
    }

    /**
     * main method.
     * @param args params.
     */
    public static void main(String[] args) {
//        arrayTest();
//        threadTest();
        heapTest();
    }
}
