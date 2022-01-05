package cn.geekhall.test;

import cn.geekhall.algorithms.basic.ArrayUtils;

import java.lang.reflect.Array;
import java.util.Arrays;

public class TestMain {
    public static void main(String[] args) {
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
}
