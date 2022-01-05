package cn.geekhall.test;

import cn.geekhall.algorithms.basic.ArrayUtils;
import cn.geekhall.algorithms.basic.HeapUtils;
import cn.geekhall.algorithms.basic.RunnableTest;
import cn.geekhall.algorithms.problems.SortArrayDistanceLessThanK;

import java.util.PriorityQueue;

import java.lang.reflect.Array;
import java.util.Arrays;

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
        testArrayEqual();
    }

    public static void testArrayEqual(){
        int testTime = 500;
        int maxSize = 10;
        int maxValue = 10;
        boolean succeed = true;
        for (int i =0; i< testTime; i++) {
            int[] arr1 = ArrayUtils.generateRandomArray(maxSize,maxValue);
            Arrays.sort(arr1);
            int[] arr2 = ArrayUtils.copyArray(arr1);
            ArrayUtils.insertionSort(arr1);
            if ( !ArrayUtils.isEqual(arr1, arr2)) {
                succeed = false;
                ArrayUtils.printArr(arr1);
                ArrayUtils.printArr(arr2);
                break;
            }
        }
        System.out.println(succeed ? "Nice!": "Fuck!");

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
        SortArrayDistanceLessThanK.sort(arr, 4);
    }

    /**
     * PriorityQueue Test function.
     * Java中的PriorityQueue其实就是小根堆。
     */
    public static void priorityQueueTest(){
        System.out.println("================");
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(1);
        pq.add(100);
        pq.add(30);
        pq.add(25);
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println("================");
    }

    /**
     * main method.
     * @param args params.
     */
    public static void main(String[] args) {
//        arrayTest();
//        threadTest();
//        heapTest();
        priorityQueueTest();
    }
}
