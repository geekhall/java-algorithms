package cn.geekhall.test;

import cn.geekhall.algorithms.basic.ArrayUtils;
import cn.geekhall.algorithms.basic.HeapUtils;
import cn.geekhall.algorithms.basic.RunnableTest;
import cn.geekhall.algorithms.problems.SortArrayDistanceLessThanK;

import java.util.PriorityQueue;

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
