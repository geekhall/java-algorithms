package cn.geekhall.algorithms.divideandconquer;

/**
 * FibonachiNumberProblem.java
 *
 * @author yiny
 */
public class FibonachiNumberProblem  {

    /**
     *
     *     | f(n+1)   f(n) |    | 1    1 |n
     *     |               |  = |        |
     *     | f(n)    f(n-1)|    | 1    0 |
     *
     *
     * @param n
     * @return
     */
    public static int fibonachi1(int n) {
        return 0;
    }

    /**
     * 朴素的斐波那契算法的时间复杂度是指数级别的。
     *
     * @param n
     * @return
     */
    public static int fibonachi2(int n) {
        if (n == 1 || n == 2) {
            return 1;
        }
        return fibonachi2(n - 1 ) + fibonachi2(n - 2);
    }

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        System.out.println(fibonachi2(40));
        long end = System.currentTimeMillis();
        System.out.println(end - start);

    }
}
