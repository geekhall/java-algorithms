package cn.geekhall.algorithms.bruteforce;

/**
 * CoinsWayProblem.java
 *
 * @author yiny
 */
public class CoinsWayProblem {

    public static int ways(int[] arr, int aim){
        if (arr == null || arr.length == 0 || aim < 0){
            return 0;
        }

        return process(arr, 0, aim);
    }

    public static int process(int[] arr, int index, int rest){

    }

    public static int waysDP(int[]arr, int aim){

    }

    public static void main(String[] args) {
        
    }
}
