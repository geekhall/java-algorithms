package cn.geekhall.test;

import cn.geekhall.algorithms.basic.ArrayUtils;

public class TestMain {
    public static void main(String[] args) {
        int[] arr = new int[] {3,2,5,6,9,8,1};
        int maxValue = ArrayUtils.getMax(arr);
        System.out.println(maxValue);
        ArrayUtils.printArr(arr);
        ArrayUtils.insertionSort(arr);
        ArrayUtils.printArr(arr);
    }
}
